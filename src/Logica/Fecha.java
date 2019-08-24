package Logica;

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

    //regresa el formato default.
    @Override
    public String toString() {
        return anio + "/" + mes + "/" + dia;
    }

    //Requiere un string con el formato de fecha default. Establece los valores
    //en las variables locales del objeto
    public void establecer_fecha(String fecha_entrante) {
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
    }

    //Regresa el año, mes y día actual del sistema en el formato default.
    public String obtener_fecha_del_sistema() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return dateFormat.format(date);
    }

    //Establece en las variables locales la hora actual del sistema.
    public void asignar_fecha_del_sistema() {
        this.establecer_fecha(this.obtener_fecha_del_sistema());
    }

    //GET y SET
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
