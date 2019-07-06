package Logica;

import java.awt.Image;
import java.awt.Toolkit;

//Esta clase se encarga de guardar variables estaticas en memoria para ser
//utilizadas en el proyecto.
public class Memoria {

    //Variable que contiene el nombre de la app.
    public static String app_name = "ADIS G2";
    //Variable que contiene la contraseña para desencriptar la data.
    public static String DBKeyPassword = "ADISPROJECTULACIT2019";
    //Variable que contiene el nombre de la base de datos para ser cargada.
    public static String database_instance = "ADIS_DB_V3.db";
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/bus_logo_small.png"));
    }

}
