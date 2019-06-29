package Objetos;

public class Ruta {

    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    //DB_ID es equivalente a RutaID dentro de la base de datos.
    private int DB_ID;
    //Costo del ticket.
    private int costo;
    //Cuaquier descripcion extra que se quiera dar a la ruta.
    private String descripcion_ruta;
    //Descripcion de los lugares de salida, llegada y horarios.
    private String lugar_salida;
    private String lugar_llegada;
    private String hora_salida;
    private String hora_llegada;
    //Boolean que enmarca si la ruta esta habilitada o deshabilitada.
    private boolean habilidato;

    //Constructor vacio.
    public Ruta() {
    }

    //Constructor para dar las variables
    public Ruta(int DB_ID, int costo, String descripcion_ruta, String lugar_salida, String lugar_llegada, String hora_salida, String hora_llegada, boolean habilidato) {
        this.DB_ID = DB_ID;
        this.costo = costo;
        this.descripcion_ruta = descripcion_ruta;
        this.lugar_salida = lugar_salida;
        this.lugar_llegada = lugar_llegada;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.habilidato = habilidato;
    }

    //Seccion de get y set
    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion_ruta() {
        return descripcion_ruta;
    }

    public void setDescripcion_ruta(String descripcion_ruta) {
        this.descripcion_ruta = descripcion_ruta;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public String getLugar_llegada() {
        return lugar_llegada;
    }

    public void setLugar_llegada(String lugar_llegada) {
        this.lugar_llegada = lugar_llegada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public boolean isHabilidato() {
        return habilidato;
    }

    public void setHabilidato(boolean habilidato) {
        this.habilidato = habilidato;
    }

}
