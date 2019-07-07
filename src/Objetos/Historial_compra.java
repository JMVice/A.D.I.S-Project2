package Objetos;

public class Historial_compra {

    //Las variables se ajustan a todas sus equivalentes a las de la base de 
    //datos.
    //DB_ID es equivalente a Historial_compraID dentro de la base de datos.
    private int DB_ID;
    //En el caso de que se haya hecho la compra de la entrada mediante ticket
    //este valor siempre sera 0.
    private int Monto;
    //Información del cliente que realizo este movimiento
    private int clienteID;
    //Información del chofer que proceso este movimiento
    private int choferID;
    //Variable para asociar el ticket que se ha usado en éste movimiento, cuando
    //aplique.
    private int TicketID;

    //Constructor vacio
    public Historial_compra() {
    }

    //Contructor para establecer las variables
    public Historial_compra(int DB_ID, int Monto, int clienteID, int choferID, int TicketID) {
        this.DB_ID = DB_ID;
        this.Monto = Monto;
        this.clienteID = clienteID;
        this.choferID = choferID;
        this.TicketID = TicketID;
    }

    //Seccion de get y set
    public int getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(int DB_ID) {
        this.DB_ID = DB_ID;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getChoferID() {
        return choferID;
    }

    public void setChoferID(int choferID) {
        this.choferID = choferID;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int TicketID) {
        this.TicketID = TicketID;
    }

}
