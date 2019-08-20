package Logica;

public class Hora {

    private String hora = "3";
    private String minuto = "33";

    public Hora() {
    }
    
    public Hora(String hora) {
        establecer_hora(hora);
    }

    //Establece en las variables locales del objeto la hora y el minuto
    public void establecer_hora(String hora) {
        StringBuilder sb = new StringBuilder(hora);
        String hora_temporal = "";
        String minuto_temporal = "";
        while (sb.charAt(0) != ':') {
            hora_temporal += sb.charAt(0);
            sb.deleteCharAt(0);
        }
        sb.deleteCharAt(0);
        while (sb.length() != 0) {
            minuto_temporal += sb.charAt(0);
            sb.deleteCharAt(0);
        }
        this.hora = hora_temporal;
        this.minuto = minuto_temporal;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }

    //Si la HORA es correcta, regresa true. La parte de la hora debe estar entre
    //0 a 23. Si no es así, regresa false. Puede ser ademas con un 0 adelante por 
    //ejemplo "05" para indicar 5.
    public boolean hora_hora_correcta(String hora) {
        switch (hora) {
            case "01":
                return true;

            case "02":
                return true;

            case "03":
                return true;

            case "04":
                return true;

            case "05":
                return true;

            case "06":
                return true;

            case "07":
                return true;

            case "08":
                return true;

            case "09":
                return true;
            case "00":
                return true;
            case "0":
                return true;

            case "1":
                return true;

            case "2":
                return true;

            case "3":
                return true;

            case "4":
                return true;

            case "5":
                return true;

            case "6":
                return true;

            case "7":
                return true;

            case "8":
                return true;

            case "9":
                return true;

            case "10":
                return true;

            case "11":
                return true;

            case "12":
                return true;

            case "13":
                return true;

            case "14":
                return true;

            case "15":
                return true;

            case "16":
                return true;

            case "17":
                return true;

            case "18":
                return true;

            case "19":
                return true;

            case "20":
                return true;

            case "21":
                return true;

            case "22":
                return true;

            case "23":
                return true;
            default:
                return false;
        }
    }

//Si LOS MINUTOS son correctos, regresa true. La parte de la hora debe estar entre
    //0 a 59. Si no es así, regresa false. Puede ser ademas con un 0 adelante por 
    //ejemplo "05" para indicar 5.
    public boolean hora_minuto_correcto(String hora) {
        switch (hora) {
            case "00":
                return true;
            case "01":
                return true;
            case "02":
                return true;
            case "03":
                return true;
            case "04":
                return true;
            case "05":
                return true;
            case "06":
                return true;
            case "07":
                return true;
            case "08":
                return true;
            case "09":
                return true;
            case "0":
                return true;
            case "1":
                return true;
            case "2":
                return true;
            case "3":
                return true;
            case "4":
                return true;
            case "5":
                return true;
            case "6":
                return true;
            case "7":
                return true;
            case "8":
                return true;
            case "9":
                return true;
            case "10":
                return true;
            case "11":
                return true;
            case "12":
                return true;
            case "13":
                return true;
            case "14":
                return true;
            case "15":
                return true;
            case "16":
                return true;
            case "17":
                return true;
            case "18":
                return true;
            case "19":
                return true;
            case "20":
                return true;
            case "21":
                return true;
            case "22":
                return true;
            case "23":
                return true;
            case "24":
                return true;
            case "25":
                return true;
            case "26":
                return true;
            case "27":
                return true;
            case "28":
                return true;
            case "29":
                return true;
            case "30":
                return true;
            case "31":
                return true;
            case "32":
                return true;
            case "33":
                return true;
            case "34":
                return true;
            case "35":
                return true;
            case "36":
                return true;
            case "37":
                return true;
            case "38":
                return true;
            case "39":
                return true;
            case "40":
                return true;
            case "41":
                return true;
            case "42":
                return true;
            case "43":
                return true;
            case "44":
                return true;
            case "45":
                return true;
            case "46":
                return true;
            case "47":
                return true;
            case "48":
                return true;
            case "49":
                return true;
            case "50":
                return true;
            case "51":
                return true;
            case "52":
                return true;
            case "53":
                return true;
            case "54":
                return true;
            case "55":
                return true;
            case "56":
                return true;
            case "57":
                return true;
            case "58":
                return true;
            case "59":
                return true;
            default:
                return false;
        }
    }

    //Hay distintas maneras de escribir una hora, por ejemplo 5 o 05. Retorna
    //un estandar de hora en esos casos.
    public String control_de_hora(String hora) {
        switch (hora) {
            case "00":
                return "0";
            case "01":
                return "1";
            case "02":
                return "2";
            case "03":
                return "3";
            case "04":
                return "4";
            case "05":
                return "5";
            case "06":
                return "6";
            case "07":
                return "7";
            case "08":
                return "8";
            case "09":
                return "9";
            default:
                return hora;
        }
    }

    //Hay distintas maneras de escribir un minuto, por ejemplo 5 o 05. Retorna
    //un estandar de hora en esos casos.
    public String control_de_minuto(String minuto) {
        switch (minuto) {
            case "1":
                return "01";
            case "2":
                return "02";
            case "3":
                return "03";
            case "4":
                return "04";
            case "5":
                return "05";
            case "6":
                return "06";
            case "7":
                return "07";
            case "8":
                return "08";
            case "9":
                return "09";
            case "0":
                return "00";
            default:
                return minuto;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

}
