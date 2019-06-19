package Logica;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public void Query(String query) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            Statement stmt = this.con.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException e) {
            //e.printStackTrace();
        } finally {
            System.out.println("Query finished");
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

    //Metodo para verificar si una tabla existe en la base de datos
    //Se introduce el nombre de la tabla en la sobrecarga del metodo
    public Boolean check_if_table_exists(String table_name) {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:" + data_source_path);
            DatabaseMetaData dbm = this.con.getMetaData();
            ResultSet rs = dbm.getTables(null, null, table_name, null);
            if (rs.next()) {
                System.out.println("Table exists");
                return true;
            } else {
                System.out.println("Table does not exist");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            System.out.println("Query finished");
            Close_connection();
        }
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
            System.out.println("SQL connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int number_of_rows() {
        try {
            this.rs.last();
            int result = this.rs.getRow();
            this.rs.first();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    //</editor-fold>
    //<editor-fold desc="GET and SET">
    public String getData_source_path() {
        return data_source_path;
    }

    public void setData_source_path(String data_source_path) {
        this.data_source_path = data_source_path;
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
