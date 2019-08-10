package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Objetos.Ruta;
import Objetos.Tarjeta;
import Objetos.Ticket;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MCompraEntrada extends javax.swing.JFrame {

    private LinkedList<Tarjeta> lista_tarjetas = new LinkedList<Tarjeta>();
    private DefaultListModel<Tarjeta> modelo_tarjetas = new DefaultListModel<Tarjeta>();

    private LinkedList<Ruta> lista_rutas_disponibles = new LinkedList<Ruta>();
    private DefaultListModel<Ruta> modelo_rutas_disponibles = new DefaultListModel<>();

    private LinkedList<Ruta> lista_rutas_seleccionadas = new LinkedList<Ruta>();
    private DefaultListModel<Ruta> modelo_rutas_seleccionadas = new DefaultListModel<>();

    public MCompraEntrada() {
        initComponents();
        settings();
    }

    private void settings() {
        //Establece el icono en la barra de estado y en el icono.
        setIconImage(Memoria.getIconImage());
        //Coloca el frame en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        //Hace el frame visible.
        this.setVisible(true);
        //Establece texto en la barra de estado.
        this.setTitle(Memoria.app_name);
        //No dejar que el frame se pueda hacer de tamaño grande
        this.setResizable(false);
        cargar_tarjetas();
        rellenar_lista_tarjetas();
        cargar_rutas();
        rellenar_lista_rutas_disponibles();
    }

    private void cargar_tarjetas() {
        this.lista_tarjetas = Memoria.sql_lite_query.obtener_tarjetas("SELECT * FROM TARJETA");
    }

    private void rellenar_lista_tarjetas() {
        this.modelo_tarjetas.clear();
        for (Tarjeta t : this.lista_tarjetas) {
            if (t.getClienteID() == Memoria.usuario_actual.getDB_ID()) {
                this.modelo_tarjetas.add(0, t);
            }
        }
        this.jList_tarjetas.setModel(this.modelo_tarjetas);
    }

    //Trae las rutas de la base de datos.
    private void cargar_rutas() {
        this.lista_rutas_disponibles = Memoria.sql_lite_query.obtener_rutas("SELECT * FROM RUTA");
    }

    //Llenar lista de usuarios
    private void rellenar_lista_rutas_disponibles() {
        //Limpiamos el modelo en caso de que ya tenga algo establecido.
        this.modelo_rutas_disponibles.clear();
        //Se rellena el jlist model con la lista de usuarios.
        for (Ruta u : this.lista_rutas_disponibles) {
            this.modelo_rutas_disponibles.add(0, u);
        }
        //Se la establecemos al jList.
        this.jList_rutas_disponibles.setModel(this.modelo_rutas_disponibles);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_comprat_tickets = new javax.swing.JButton();
        jButton2_volver = new javax.swing.JButton();
        jButton_agregar_ruta = new javax.swing.JButton();
        jButton_remover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_rutas_disponibles = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_tarjetas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_rutas_seleccionadas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_comprat_tickets.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_comprat_tickets.setText("Comprar tickets");
        jButton_comprat_tickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprat_ticketsActionPerformed(evt);
            }
        });

        jButton2_volver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2_volver.setText("Cancelar");
        jButton2_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_volverActionPerformed(evt);
            }
        });

        jButton_agregar_ruta.setText("Agregar ->");
        jButton_agregar_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_rutaActionPerformed(evt);
            }
        });

        jButton_remover.setText("<- Remover");
        jButton_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Rutas disponibles:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Viajes Seleccionados:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Compra de tickets");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Método de pago:");

        jScrollPane2.setViewportView(jList_rutas_disponibles);

        jScrollPane3.setViewportView(jList_tarjetas);

        jScrollPane4.setViewportView(jList_rutas_seleccionadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2_volver)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton_agregar_ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton_comprat_tickets, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(106, 106, 106))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton_agregar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_remover))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_comprat_tickets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2_volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_volverActionPerformed
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }//GEN-LAST:event_jButton2_volverActionPerformed

    private void jButton_agregar_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_rutaActionPerformed
        //Se agregan la ruta en la lista tiquetes para comprar
        this.modelo_rutas_seleccionadas.add(0, this.jList_rutas_disponibles.getSelectedValue());
        this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
    }//GEN-LAST:event_jButton_agregar_rutaActionPerformed

    private void jButton_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removerActionPerformed
        try {//Si borra la lista de tiquetes comprados
            int db_id_ruta = this.jList_rutas_seleccionadas.getSelectedValue().getDB_ID();
            for (int i = 0; i < this.modelo_rutas_seleccionadas.getSize(); i++) {
                if (this.modelo_rutas_seleccionadas.get(i).getDB_ID() == db_id_ruta) {
                    this.modelo_rutas_seleccionadas.remove(i);
                    break;
                }
            }
            this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
        } catch (NullPointerException e) {
            System.out.println("No selected item to remove.");
        }
    }//GEN-LAST:event_jButton_removerActionPerformed

    private void jButton_comprat_ticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comprat_ticketsActionPerformed
        //Una vez que se agregue toda la informacion del tiquete se compra tiquete y se guarda la info
        Tarjeta tarjeta = jList_tarjetas.getSelectedValue();
        if (tarjeta != null) {
            int precio_compra = 0;
            LinkedList<Ticket> lista_tickets_a_comprar = new LinkedList<Ticket>();
            for (Ruta r : obtener_lista_de_rutas_seleccionadas()) {
                precio_compra += r.getCosto();
                lista_tickets_a_comprar.add(generar_ticket(r.getDB_ID(), r.getLugar_llegada(), r.getLugar_salida()));
            }
            reducir_saldo(precio_compra, tarjeta.getDB_ID());
            guardar_tickets_en_base_de_datos(lista_tickets_a_comprar);
            this.modelo_rutas_seleccionadas.clear();
            this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
            Run.message("Tickets comprados!", "Compra hecha", 1);
        } else {
            Run.message("Debe elegir un metodo de pago!", "Sin metodo de pago seleccionado", 2);
        }
    }//GEN-LAST:event_jButton_comprat_ticketsActionPerformed

    private void guardar_tickets_en_base_de_datos(LinkedList<Ticket> lista_tickets_comprados) {//Una vez que se haya hecho la compra del tiquete la informacion se guardara en la base de datos
        for (Ticket ticket : lista_tickets_comprados) {
            Memoria.sql_lite_query.Query("INSERT INTO TICKET "
                    + "(UserID"
                    + ", RutaID"
                    + ", Codigo"
                    + ", Fecha_caducidad"
                    + ", Utilizado)\n"
                    + "VALUES "
                    + "('" + Memoria.usuario_actual.getDB_ID() + "'"
                    + ",'" + ticket.getRutaID() + "'"
                    + ",'" + ticket.getCodigo() + "'"
                    + ",'" + ticket.getFecha_caducidad() + "'"
                    + ",'" + ticket.isUtilizado() + "'"
                    + ");", "Ticket agregado");
        }
    }

    private void reducir_saldo(int precio_compra, int db_id_tarjeta) {//Una vez que se compra el tiquete se le reducira el saldo a la tarjeta del usuario
        LinkedList<Tarjeta> lista_tarjetas = Memoria.sql_lite_query.obtener_tarjetas("SELECT * FROM TARJETA");
        for (Tarjeta t : lista_tarjetas) {
            if (t.getDB_ID() == db_id_tarjeta) {
                int saldo_nuevo = t.getSaldo() - precio_compra;
                Memoria.sql_lite_query.Query("UPDATE TARJETA\n"
                        + "SET Saldo = '" + saldo_nuevo + "'"
                        + "WHERE TarjetaID = '" + t.getDB_ID() + "';", "Tarjeta actualizada");
                break;
            }
        }
    }

    private LinkedList<Ruta> obtener_lista_de_rutas_seleccionadas() {//Cuando a haga la compra del tiquete se deben obtener la listas de las rutas agregadas
        LinkedList<Ruta> lista_rutas_selecciondas = new LinkedList<Ruta>();
        for (int i = 0; i < this.modelo_rutas_seleccionadas.size(); i++) {
            lista_rutas_selecciondas.add(this.modelo_rutas_seleccionadas.get(i));
        }
        return lista_rutas_selecciondas;
    }

    private Ticket generar_ticket(int ruta_id, String lugar_llegada, String lugar_salida) {//Una vez el usuario haya comprado se genera el tiquete con toda la informacion agregada
        Ticket t = new Ticket();
        t.setClienteID(Memoria.usuario_actual.getDB_ID());
        t.setCodigo(AES.encrypt("" + Run.random_x_between_y(0, 999, 3) + Run.randomLetter() + Run.random_x_between_y(0, 9999, 4), Memoria.DBKeyPassword));
        t.setFecha_caducidad("sprint3");
        t.setUtilizado(false);
        t.setRutaID(ruta_id);
        return t;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_volver;
    private javax.swing.JButton jButton_agregar_ruta;
    private javax.swing.JButton jButton_comprat_tickets;
    private javax.swing.JButton jButton_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Ruta> jList_rutas_disponibles;
    private javax.swing.JList<Ruta> jList_rutas_seleccionadas;
    private javax.swing.JList<Tarjeta> jList_tarjetas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
