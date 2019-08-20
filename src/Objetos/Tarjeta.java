package Objetos;

import Logica.AES;
import Logica.Memoria;

public class Tarjeta {

    //NOTA: Las tarjetas VISA siempre comienzan con el numero 4.
    //Las tarjetas MasterCard siempre comienzan con el numero 5.
    //La longitud de cualquier tarjeta es siempre de 16 digitos.
    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    private int DB_ID;
    //PartyID es equivalente a la variable DB_ID en el objeto Usuario. Nos
    //permite saber a quien pertenece esta tarjeta.
    private int ClienteID;
    private String Num_tarjeta;
    private String CVV;
    private String Fecha_caducidad;
    private int Saldo;

    //Constructor vacio.
    public Tarjeta() {
    }

    @Override
    public String toString() {
        //Usamos stringbuilder para eliminar los todos los numeros de la tarjeta hasta tener sólo 4.
        StringBuilder sb = new StringBuilder(AES.decrypt(this.Num_tarjeta, Memoria.DBKeyPassword));
        String tipo_tarjeta = "VISA";
        //Si el numero de tarjeta es 5 se setea como MasterCard.
        if (sb.charAt(0) == '5') {
            tipo_tarjeta = "MasterCard";
        }
        //Borra los primeros 12 numeros
        for (int i = 0; i < 12; i++) {
            sb.deleteCharAt(0);
        }
        //Regresa el formato de string como xxxxNNNN. Visa/MasterCard
        return "xxxx" + sb.toString() + ". " + tipo_tarjeta;
    }

    //Constructor para dar todas las variables.
    public Tarjeta(int DB_ID, int ClienteID, String Num_tarjeta, String CVV, String Fecha_caducidad, int Saldo) {
        this.DB_ID = DB_ID;
        this.ClienteID = ClienteID;
        this.Num_tarjeta = Num_tarjeta;
        this.CVV = CVV;
        this.Fecha_caducidad = Fecha_caducidad;
        this.Saldo = Saldo;
    }

    //Regresa el mes de caducidad de la tarjeta
    public int obtener_mes_vencimiento() {
        //Variables para hacer la extraccion del mes de caducidad.
        String fecha = AES.decrypt(this.Fecha_caducidad, Memoria.DBKeyPassword);
        StringBuilder stringBuilder = new StringBuilder(fecha);
        String mes = "";

        //Logica de extraccion. Ejmeplo de fecha: 10-2058
        while (stringBuilder.charAt(0) != '-') {
            mes += stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
        }
        return Integer.parseInt(mes);
    }

    //Regresa el mes de caducidad de la tarjeta
    public int obtener_anio_vencimiento() {
        //Variables para hacer la extraccion del año de caducidad.
        String fecha = AES.decrypt(this.Fecha_caducidad, Memoria.DBKeyPassword);
        StringBuilder stringBuilder = new StringBuilder(fecha);
        String anio = "";

        //Logica de extraccion. Ejmeplo de fecha: 10-2058
        while (stringBuilder.charAt(0) != '-') {
            stringBuilder.deleteCharAt(0);
        }
        stringBuilder.deleteCharAt(0);

        while (stringBuilder.length() != 0) {
            anio += stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
        }

        return Integer.parseInt(anio);
    }

    //Seccion de gets y set
    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
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

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

}
