package Objetos;

public class Usuario {

    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    //DB_ID: Equivalente a PartyID. Es el ID del usuario.
    private int DB_ID;
    private String Rol;
    private String nombre_de_usuario;
    private String contrasenia;
    private String nombre;
    private String ap_materno;
    private String ap_paterno;
    private boolean habilitado;

    //Contructor vacio.
    public Usuario() {
    }

    //Constructor para dar todas las variables.
    public Usuario(int DB_ID, String Rol, String nombre_de_usuario, String contrasenia, String nombre, String ap_materno, String ap_paterno, boolean habilitado) {
        this.DB_ID = DB_ID;
        this.Rol = Rol;
        this.nombre_de_usuario = nombre_de_usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.habilitado = habilitado;
    }

    //Seccion de get y set
    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombre_de_usuario() {
        return nombre_de_usuario;
    }

    public void setNombre_de_usuario(String nombre_de_usuario) {
        this.nombre_de_usuario = nombre_de_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
