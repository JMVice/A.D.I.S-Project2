package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    //Objeto o para contruir fechas. Sera mayormente utilizada para la revision
    //de fechas de caducidad de las tarjetas y los tickets.
    private int anio;
    private int mes;
    private int dia;
    private int id;

    //Toda fecha tiene un id
    public Fecha() {
        id = ((int) (Math.random() * 100000));
    }

    public Fecha(int year, int month, int day) {
        id = ((int) (Math.random() * 100000));
        this.anio = year;
        this.mes = month;
        this.dia = day;
    }

    @Override
    public String toString() {
        return anio + "/" + mes + "/" + dia;
    }

    //Regresa un formato de fecha por default
    public String obtener_formato_de_fecha() {
        return anio + "/" + mes + "/" + dia;
    }

    //Convierte el string entrante en variables para ser utilizadas por el objeto.
    //Tambien devuelve el valor de la fecha completa en string
    public String convertir_formato_de_fecha_y_obtener(String fecha_entrante) {
        StringBuilder sb = new StringBuilder(fecha_entrante + "/");
        String valor_anio = "";
        String valor_mes = "";
        String valor_dia = "";
        while (sb.charAt(0) != '/') {
            valor_anio += sb.charAt(0);
            sb.deleteCharAt(0);
        }
        sb.deleteCharAt(0);
        while (sb.charAt(0) != '/') {
            valor_mes += sb.charAt(0);
            sb.deleteCharAt(0);
        }
        sb.deleteCharAt(0);
        while (sb.charAt(0) != '/') {
            valor_dia += sb.charAt(0);
            sb.deleteCharAt(0);
        }
        this.anio = Integer.parseInt(valor_anio);
        this.mes = Integer.parseInt(valor_mes);
        this.dia = Integer.parseInt(valor_dia);
        return this.toString();
    }

    //Regresa el año, mes y día actual del sistema.
    public String obtener_fecha_del_sistema() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return dateFormat.format(date);
    }

    //Se da a si mismo los valores de la fecha del sistema.
    public void autoasigar_fecha_del_sistema() {
        this.convertir_formato_de_fecha_y_obtener(this.obtener_fecha_del_sistema());
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
