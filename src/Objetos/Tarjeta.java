package Objetos;

public class Tarjeta {

    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    private int DB_ID;
    //PartyID es equivalente a la variable DB_ID en el objeto Usuario. Nos
    //permite saber a quien pertenece esta tarjeta.
    private int PartyID;
    private String Num_tarjeta;
    private String CVV;
    private String Fecha_caducidad;
    private String Saldo;

    //Constructor vacio.
    public Tarjeta() {
    }

    //Constructor para dar todas las variables.
    public Tarjeta(int DB_ID, int PartyID, String Num_tarjeta, String CVV, String Fecha_caducidad, String Saldo) {
        this.DB_ID = DB_ID;
        this.PartyID = PartyID;
        this.Num_tarjeta = Num_tarjeta;
        this.CVV = CVV;
        this.Fecha_caducidad = Fecha_caducidad;
        this.Saldo = Saldo;
    }

    //Seccion de gets y set
    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public int getPartyID() {
        return PartyID;
    }

    public void setPartyID(int PartyID) {
        this.PartyID = PartyID;
    }

    public String getNum_tarjeta() {
        return Num_tarjeta;
    }

    public void setNum_tarjeta(String Num_tarjeta) {
        this.Num_tarjeta = Num_tarjeta;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getFecha_caducidad() {
        return Fecha_caducidad;
    }

    public void setFecha_caducidad(String Fecha_caducidad) {
        this.Fecha_caducidad = Fecha_caducidad;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

}
