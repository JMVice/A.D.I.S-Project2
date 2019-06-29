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
    private int PartyID_cliente;
    //Información del cobrador que proceso este movimiento
    private int PartyID_cobrador;
    //Variable para asociar el ticket que se ha usado en éste movimiento, cuando
    //aplique.
    private int TicketID;

    //Constructor vacio
    public Historial_compra() {
    }

    //Contructor para establecer las variables
    public Historial_compra(int DB_ID, int Monto, int PartyID_cliente, int PartyID_cobrador, int TicketID) {
        this.DB_ID = DB_ID;
        this.Monto = Monto;
        this.PartyID_cliente = PartyID_cliente;
        this.PartyID_cobrador = PartyID_cobrador;
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

    public int getPartyID_cliente() {
        return PartyID_cliente;
    }

    public void setPartyID_cliente(int PartyID_cliente) {
        this.PartyID_cliente = PartyID_cliente;
    }

    public int getPartyID_cobrador() {
        return PartyID_cobrador;
    }

    public void setPartyID_cobrador(int PartyID_cobrador) {
        this.PartyID_cobrador = PartyID_cobrador;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int TicketID) {
        this.TicketID = TicketID;
    }

}
