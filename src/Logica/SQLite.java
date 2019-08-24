package Logica;

import Objetos.Ruta;
import Objetos.Tarjeta;
import Objetos.Ticket;
import Objetos.Usuario;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLite {

    private String data_source_path = "";
    private Connection con;
    ResultSet rs;

    //Connection example:
    //SQLite sql = new SQLite(ClassLoader.getSystemResource("PackageName/DataBaseName.db").toString());
    //public static SQLite sqlite = new SQLite(System.getProperty("user.dir") + "\\SQLite&JavaDB.db");
    //ClassLoader.getSystemResource returns: /build/classes/
    //Example: Getting data from ResultSet rs -> this.rs.getString("ColumnName");
    //To get program path System.getProperty("user.dir")
    public SQLite(String data_source_path) {
        this.data_source_path = data_source_path;
    }

    //Metodo para consultas tipo InsertInto o Delete
    //Se coloca la query en la sobrecarga del metodo
    public void Query(String query, String query_description) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException e) {
//         e.printStackTrace();
        } finally {
            System.out.println(query_description);
            Close_connection();
        }
    }

    //Metodo que regresa True si la conexion a la base de datos es correcta
    //False si no lo es.
    public boolean test_connection() {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            System.out.println("Connection to SQLite has been established.");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (this.con != null) {
                Close_connection();
            }
        }
    }

    //Returns true if the database file exists
    public Boolean verificar_si_existe_base_de_datos(String db_name) {
        java.io.File file = new java.io.File(db_name);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    //Retorna true si las tablas pasadas por el array de string existen dentro
    //de la base de datos.
    public Boolean check_tables_existence(String[] tables) {
        boolean status = true;
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            DatabaseMetaData dbm = this.con.getMetaData();

            for (int i = 0; i < tables.length; i++) {
                ResultSet rs = dbm.getTables(null, null, tables[i], null);
                if (rs.next()) {
                    System.out.println("Table exists");
                } else {
                    System.out.println("Table does not exist");
                    status = false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Run.message("The Library: \n\nsqlite-jdbc-3.27.2.1.jar"
                    + "\n\nWasn't found! Please, locate the "
                    + "library and add to .jar application\n"
                    + "Consult Troubleshooting - Libraries "
                    + "Troubleshooting.pdf for more information", "LIBRARY NOT FOUND!", 0);
            return false;
        } finally {
            System.out.println("Query finished");
            Close_connection();
            return status;
        }
    }

    //Retorna todos los valores de la tabla USER en formato LinkedList
    public LinkedList<Usuario> obtener_usuarios(String query) {
        LinkedList<Usuario> lista_usuarios = new LinkedList<Usuario>();
        try {
            Usuario u = new Usuario();
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(query);
            while (rs.next()) {
                u.setDB_ID(rs.getInt("UserID"));
                u.setRol(rs.getString("Rol"));
                u.setNombre_de_usuario(rs.getString("Nombre_usuario"));
                u.setContrasenia(rs.getString("Contrasenia"));
                u.setNombre(rs.getString("Nombre"));
                u.setAp_paterno(rs.getString("Ap_paterno"));
                u.setAp_materno(rs.getString("Ap_materno"));
                String habilidato_str = rs.getString("Habilitado");
                if (habilidato_str.equals("true")) {
                    u.setHabilitado(true);
                } else {
                    u.setHabilitado(false);
                }
                lista_usuarios.add(u);
                u = new Usuario();
            }
        } catch (SQLException e) {
//            e.printStackTrace();
            return null;
        } finally {
            System.out.println("Usuarios consultados");
            Close_connection();
        }
        return lista_usuarios;
    }

    //Retorna todos los valores de la tabla TARJETA en formato LinkedList
    public LinkedList<Tarjeta> obtener_tarjetas(String query) {
        LinkedList<Tarjeta> lista_tarjetas = new LinkedList<Tarjeta>();
        Tarjeta t = new Tarjeta();
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(query);
            while (rs.next()) {
                t.setCVV(AES.decrypt(rs.getString("CVV"), Memoria.DBKeyPassword));
                t.setClienteID(rs.getInt("UserID"));
                t.setDB_ID(rs.getInt("TarjetaID"));
                t.setFecha_caducidad(rs.getString("Fecha_caducidad"));
                t.setNum_tarjeta(rs.getString("Num_tarjeta"));
                t.setSaldo(rs.getInt("Saldo"));
                lista_tarjetas.add(t);
                t = new Tarjeta();
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        } finally {
            System.out.println("Tarjetas consultadas");
            Close_connection();
            return lista_tarjetas;
        }
    }

    //Retorna todos los valores de la tabla RUTA en formato LinkedList
    public LinkedList<Ruta> obtener_rutas(String query) {
        LinkedList<Ruta> lista_rutas = new LinkedList<Ruta>();
        try {
            Ruta r = new Ruta();
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(query);
            while (rs.next()) {
                r.setDB_ID(rs.getInt("RutaID"));
                r.setCosto(rs.getInt("Costo"));
                r.setDescripcion_ruta(rs.getString("Descripcion_ruta"));
                r.setLugar_salida(rs.getString("Lugar_salida"));
                r.setLugar_llegada(rs.getString("Lugar_llegada"));
                r.setHora_salida(rs.getString("Hora_salida"));
                r.setHora_llegada(rs.getString("Hora_llegada"));
                String status = rs.getString("Habilitado");
                if (status.equals("true")) {
                    r.setHabilidato(true);
                } else {
                    r.setHabilidato(false);
                }
                lista_rutas.add(r);
                r = new Ruta();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            System.out.println("Rutas consultadas");
            Close_connection();
        }
        return lista_rutas;
    }

    //Retorna todos los valores de la tabla TICKET en formato LinkedList
    public LinkedList<Ticket> obtener_tickets(String query) {
        LinkedList<Ticket> lista_tickets = new LinkedList<Ticket>();
        try {
            Ticket t = new Ticket();
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(query);
            while (rs.next()) {
                t.setDB_ID(rs.getInt("TicketID"));
                t.setClienteID(rs.getInt("UserID"));
                t.setCodigo(rs.getString("Codigo"));
                t.setFecha_caducidad(rs.getString("Fecha_caducidad"));
                t.setRutaID(rs.getInt("RutaID"));
                String utilizado = rs.getString("Utilizado");
                if (utilizado.equals("true")) {
                    t.setUtilizado(true);
                } else {
                    t.setUtilizado(false);
                }
                lista_tickets.add(t);
                t = new Ticket();
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        } finally {
            System.out.println("Tickets consultados");
            Close_connection();
        }
        return lista_tickets;
    }

    //Metodos de plantilla
    //<editor-fold desc="Templates SQLite methods">
    //Template request object with paramethers
    public void template_query_request_object(String query) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            this.rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("TABLENAME"));
                System.out.println(rs.getInt("TABLENAME"));
            }
        } catch (SQLException e) {
            //e.printStackTrace();
        } finally {
            System.out.println("Query finished");
            Close_connection();
        }
    }

    //Template to insert into with PreparedStatement
    public void template_query_with_parameters(String value_1, String value_2, String value_3) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            String ps_string = "INSERT INTO TABLENAME (COLUMN_1, COLUMN_2,COLUMN_3) VALUES(?,?,?);";
            PreparedStatement ps = this.con.prepareStatement(ps_string);
            ps.setString(1, value_1);
            ps.setString(2, value_2);
            ps.setString(3, value_3);
            ps.executeUpdate();
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            Close_connection();
        }
    }

    //</editor-fold>
    //<editor-fold desc="Other methods">
    private void Close_connection() {
        try {
            this.con.close();
//            System.out.println("SQL connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //</editor-fold>
    //<editor-fold desc="GET and SET">
    public String getData_source_path() {
        return data_source_path;
    }

    //</editor-fold>
    //<editor-fold desc="Deprecated code">
    public Boolean isConnectionEstablished() {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + this.data_source_path);
            if (con != null) {
                System.out.println("SQLite connection success");
                return true;
            } else {
                System.out.println("SQLite connection FAILED. Data source: " + this.data_source_path + "\n");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("SQLite connection ERROR!!!. Data source: " + this.data_source_path + "\n");
            return false;
        } finally {
            Close_connection();
        }
    }
//</editor-fold>

}
