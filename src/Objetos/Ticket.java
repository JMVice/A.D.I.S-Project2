package Objetos;

import Logica.AES;
import Logica.Memoria;
import java.util.LinkedList;

public class Ticket {

    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    //DB_ID es equivalente a TicketID dentro de la base de datos.
    private int DB_ID;
    //Variable para saber a quien pertenece este ticket
    private int ClienteID;
    //Variable para saber a que ruta pertenece este ticket.
    private int RutaID;
    //Codigo del ticket. Se refiere al codigo unico que genera el sistema.
    private String Codigo;
    private String Fecha_caducidad;
    //Este boolean establece si el ticket ya ha sido utilizado o no.
    private boolean utilizado;
    //Guarda el objeto de tipo Ruta correspondiete al ticket en caso de necesitar
    //su información
    private Ruta ruta;

    //Constructor vacio
    public Ticket() {
    }

    //Constructor para establecer las variables
    public Ticket(int DB_ID, int ClienteID, int RutaID, String Codigo, String Fecha_caducidad, boolean utilizado, Ruta ruta) {
        this.DB_ID = DB_ID;
        this.ClienteID = ClienteID;
        this.RutaID = RutaID;
        this.Codigo = Codigo;
        this.Fecha_caducidad = Fecha_caducidad;
        this.utilizado = utilizado;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return AES.decrypt(this.Codigo, Memoria.DBKeyPassword) + " - Ruta: " + this.ruta.getLugar_salida() + " - " + this.ruta.getLugar_llegada();
    }

    //num - Ruta X-Y
    //Seccion de get y set
    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public int getRutaID() {
        return RutaID;
    }

    public void setRutaID(int RutaID) {
        this.RutaID = RutaID;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFecha_caducidad() {
        return Fecha_caducidad;
    }

    public void setFecha_caducidad(String Fecha_caducidad) {
        this.Fecha_caducidad = Fecha_caducidad;
    }

    public boolean isUtilizado() {
        return utilizado;
    }

    public void setUtilizado(boolean utilizado) {
        this.utilizado = utilizado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

}
