package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Objetos.Ruta;
import Objetos.Tarjeta;
import Objetos.Ticket;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MCompraEntrada extends javax.swing.JFrame {

    private LinkedList<Tarjeta> lista_tarjetas = new LinkedList<>();
    private final DefaultListModel<Tarjeta> modelo_tarjetas = new DefaultListModel<>();

    private LinkedList<Ruta> lista_rutas_disponibles = new LinkedList<>();
    private final DefaultListModel<Ruta> modelo_rutas_disponibles = new DefaultListModel<>();

    private final LinkedList<Ruta> lista_rutas_seleccionadas = new LinkedList<>();
    private final DefaultListModel<Ruta> modelo_rutas_seleccionadas = new DefaultListModel<>();

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
        cargar_rutas();
        //Ajustes del panel de vista de compra
        jTextArea_info.setLineWrap(true);
        jTextArea_info.setCaretPosition(0);
        jTextArea_info.setWrapStyleWord(true);
        jTextArea_info.setText("Sin rutas seleccionadas...");
        label_status_change("", "");
    }

    private void cargar_tarjetas() {
        this.lista_tarjetas = Memoria.sql_lite_query.obtener_tarjetas("SELECT * FROM TARJETA");
        rellenar_lista_tarjetas();
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
        rellenar_lista_rutas_disponibles();
    }

    //Llenar lista de usuarios
    private void rellenar_lista_rutas_disponibles() {
        //Limpiamos el modelo en caso de que ya tenga algo establecido.
        this.modelo_rutas_disponibles.clear();
        //Se rellena el jlist model con la lista de usuarios.
        for (Ruta u : this.lista_rutas_disponibles) {
            if (u.isHabilidato()) {
                this.modelo_rutas_disponibles.add(0, u);
            }
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
        jButton_limpiar_viajes_seleccionados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_info = new javax.swing.JTextArea();
        jLabel_status = new javax.swing.JLabel();

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

        jButton_limpiar_viajes_seleccionados.setText("Limpiar viajes");
        jButton_limpiar_viajes_seleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiar_viajes_seleccionadosActionPerformed(evt);
            }
        });

        jTextArea_info.setColumns(20);
        jTextArea_info.setRows(5);
        jScrollPane1.setViewportView(jTextArea_info);

        jLabel_status.setText("SATUS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2_volver)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel_status)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton_agregar_ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_limpiar_viajes_seleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(106, 106, 106))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jButton_comprat_tickets, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_comprat_tickets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton_agregar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_remover)
                                .addGap(9, 9, 9)
                                .addComponent(jButton_limpiar_viajes_seleccionados))
                            .addComponent(jScrollPane2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_volver)
                    .addComponent(jLabel_status))
                .addGap(20, 20, 20))
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
        System.out.println(this.jList_rutas_disponibles.getSelectedValue().getNombreRuta());
        if (this.modelo_rutas_seleccionadas.size() < 9) {
            this.modelo_rutas_seleccionadas.add(0, this.jList_rutas_disponibles.getSelectedValue());
            this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
            actualizar_cuadro_de_informacion_de_compra();
        }else{
            label_status_change("Limite de rutas alcanzada. Sólo 9 tickets a la vez.", "red");
        }
    }//GEN-LAST:event_jButton_agregar_rutaActionPerformed

    private void jButton_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removerActionPerformed

        //Se retira el ticket seleccionado dentro de la lista a comprar.
        try {
            int db_id_ruta = this.jList_rutas_seleccionadas.getSelectedValue().getDB_ID();
            for (int i = 0; i < this.modelo_rutas_seleccionadas.getSize(); i++) {
                if (this.modelo_rutas_seleccionadas.get(i).getDB_ID() == db_id_ruta) {
                    this.modelo_rutas_seleccionadas.remove(i);
                    break;
                }
            }
            this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
            actualizar_cuadro_de_informacion_de_compra();
        } catch (NullPointerException e) {
            System.out.println("No selected item to remove.");
        }
    }//GEN-LAST:event_jButton_removerActionPerformed

    private void jButton_comprat_ticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comprat_ticketsActionPerformed
        //Secuencia de acciones para comprar y guardar los tickets en la base
        //de datos.
        if (hay_viajes_seleccionados()
                && tarjeta_seleccionada()
                && tarjeta_no_vencida()
                && tarjeta_con_fondos_suficientes()) {
            comprar_tickets();
        }
    }//GEN-LAST:event_jButton_comprat_ticketsActionPerformed

    private void jButton_limpiar_viajes_seleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiar_viajes_seleccionadosActionPerformed
        vaciar_lista_de_rutas_para_comprar();
    }//GEN-LAST:event_jButton_limpiar_viajes_seleccionadosActionPerformed

    //Metodo que genera la secuencia de acciones para realizar una compra de tickets.
    private void comprar_tickets() {
        //Tarjeta elegida para realizar la compra.
        Tarjeta tarjeta_utilizada = this.jList_tarjetas.getSelectedValue();

        //Lista de tickets que se genera en base a las rutas seleccionadas para comprar 
        //un ticket
        LinkedList<Ticket> lista_tickets = new LinkedList<Ticket>();
        for (Ruta ruta : obtener_lista_de_rutas_seleccionadas()) {
            lista_tickets.add(generar_ticket(ruta.getDB_ID(), ruta.getLugar_llegada(), ruta.getLugar_salida()));
        }

        //Se utiliza la lista de tickets generada para guardar los tickets en la base de datos.
        guardar_tickets_en_base_de_datos(lista_tickets);

        //Se reduce el saldo de la tarjeta utilizada para realizar la compra.
        reducir_saldo(obtener_precio_compra(), tarjeta_utilizada.getDB_ID());

        //Se recargan las tarjetas con el saldo actualizado.
        cargar_tarjetas();

        //limpia la lista de rutas para comprar en forma de tickets.
        vaciar_lista_de_rutas_para_comprar();

        //Muestra mensaje de exito
        Run.message("Compra realizada con exito", "Compra realizada", 1);

        //Elimina los mensajes de error
        label_status_change("", "");
    }

    //Vacia la lista de viajes seleccionados para comprar en tickets. 
    //Reinicia ademas el cuadro de texto de vista de compra.
    private void vaciar_lista_de_rutas_para_comprar() {
        this.modelo_rutas_seleccionadas.clear();
        this.jList_rutas_seleccionadas.setModel(this.modelo_rutas_seleccionadas);
        actualizar_cuadro_de_informacion_de_compra();
    }

    //Verifica que el usuario haya seleccionado rutas para comprar.
    private boolean hay_viajes_seleccionados() {
        if (!this.modelo_rutas_seleccionadas.isEmpty()) {
            return true;
        } else {
            label_status_change("Debe seleccionar al menos una ruta para comprar un ticket", "red");
            return false;
        }
    }

    //Verifica si el usuario ha seleccionado una tarjeta para efectuar la compra.
    private boolean tarjeta_seleccionada() {
        Tarjeta tarjeta = jList_tarjetas.getSelectedValue();
        if (tarjeta != null) {
            return true;
        } else {
            label_status_change("Debe seleccionar una tarjeta para efectuar la compra", "red");
            return false;
        }
    }

    //Verifica si la tarjeta seleccionada no esta vencida
    private boolean tarjeta_no_vencida() {

        //Variables temporales para generar la validacion. Tarjeta
        Tarjeta tarjeta = jList_tarjetas.getSelectedValue();
        int anio_vencimiento_tarjeta = tarjeta.obtener_anio_vencimiento();
        int mes_vencimiento_tarjeta = tarjeta.obtener_mes_vencimiento();

        //Fecha actual del sistema para validar tarjeta.
        Logica.Fecha fecha_actual = new Logica.Fecha();
        fecha_actual.asignar_fecha_del_sistema();

        //Logica de la validacion
        if (anio_vencimiento_tarjeta > fecha_actual.getAnio()) {
            return true;
        } else if (mes_vencimiento_tarjeta > fecha_actual.getMes()) {
            return true;
        } else {
            label_status_change("La tarjeta con la que esta intentando efectuar el "
                    + "pago esta vencida", "red");
            return false;
        }
    }

    //Verifica si la tarjeta seleccionada tiene suficientes fondos para ejectuar
    //el pago
    private boolean tarjeta_con_fondos_suficientes() {
        Tarjeta tarjeta = jList_tarjetas.getSelectedValue();
        if (tarjeta.getSaldo() >= obtener_precio_compra()) {
            return true;
        } else {
            label_status_change("La tarjeta seleccionada no tiene suficientes"
                    + " fondos para realizar la compra", "red");
            return false;
        }
    }

    //Retorna el costo total de la compra a efectuar.
    private int obtener_precio_compra() {
        int precio_compra = 0;
        for (int i = 0; i < this.modelo_rutas_seleccionadas.size(); i++) {
            precio_compra += this.modelo_rutas_disponibles.get(i).getCosto();
        }
        return precio_compra;
    }

    //Guarda en la base de datos la lista de tickets que se le de al metodo.
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

    //Reduce el saldo de la tarjeta a la cual se le pase el id al metodo. Se 
    //reduce el saldo que se le de al metodo.
    private void reducir_saldo(int precio_compra, int db_id_tarjeta) {//Una vez que se compra el tiquete se le reducira el saldo a la tarjeta del usuario
        Memoria.sql_lite_query.Query("UPDATE TARJETA\n"
                + "SET Saldo = Saldo - " + precio_compra
                + "WHERE TarjetaID = '" + db_id_tarjeta + "';", "Tarjeta actualizada");
    }

    //Regresa una lista de objetos tipo Ruta. La lista corresponde a las Rutas elegidas
    //por el usuario para comprar.
    private LinkedList<Ruta> obtener_lista_de_rutas_seleccionadas() {
        LinkedList<Ruta> lista_rutas_selecciondas = new LinkedList<Ruta>();
        for (int i = 0; i < this.modelo_rutas_seleccionadas.size(); i++) {
            lista_rutas_selecciondas.add(this.modelo_rutas_seleccionadas.get(i));
        }
        return lista_rutas_selecciondas;
    }

    //Metodo de accion rapida que genera objetos de tipo Ticket con informacion
    //personalizada para cada uno.
    private Ticket generar_ticket(int ruta_id, String lugar_llegada, String lugar_salida) {//Una vez el usuario haya comprado se genera el tiquete con toda la informacion agregada
        Ticket ticket = new Ticket();
        ticket.setClienteID(Memoria.usuario_actual.getDB_ID());
        ticket.setCodigo(AES.encrypt("" + Run.random_x_between_y(0, 999, 3) + Run.randomLetter() + Run.random_x_between_y(0, 9999, 4), Memoria.DBKeyPassword));
        ticket.setFecha_caducidad(asignar_fecha_de_caducidad());
        ticket.setUtilizado(false);
        ticket.setRutaID(ruta_id);
        return ticket;
    }

    //Da la fecha de caducidad al ticket. Aumenta el mes en 1.
    private String asignar_fecha_de_caducidad() {
        Logica.Fecha fecha = new Logica.Fecha();
        fecha.asignar_fecha_del_sistema();
        if (fecha.getMes() == 12) {
            fecha.setAnio(fecha.getAnio() + 1);
            fecha.setMes(1);
        } else {
            fecha.setMes(fecha.getMes() + 1);
        }
        return fecha.toString();
    }

    //Genera mensajes de error en pantalla.
    private void label_status_change(String message, String color) {
        switch (color) {
            case "red":
                jLabel_status.setForeground(Color.red);
                break;
            case "blue":
                jLabel_status.setForeground(Color.blue);
                break;
            case "green":
                jLabel_status.setForeground(Color.green);
                break;
            case "black":
                jLabel_status.setForeground(Color.black);
                break;
            default:
                jLabel_status.setForeground(Color.black);
        }
        jLabel_status.setText(message);
    }

    //Genera una vista simple con el precio total de su compra.
    private void actualizar_cuadro_de_informacion_de_compra() {
        if (!this.modelo_rutas_seleccionadas.isEmpty()) {
            String str = "Cantidad de tickets: " + this.modelo_rutas_seleccionadas.size() + "\n"
                    + "Precio total: " + obtener_precio_compra();
            this.jTextArea_info.setText(str);
        } else {
            this.jTextArea_info.setText("Sin rutas seleccionadas...");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_volver;
    private javax.swing.JButton jButton_agregar_ruta;
    private javax.swing.JButton jButton_comprat_tickets;
    private javax.swing.JButton jButton_limpiar_viajes_seleccionados;
    private javax.swing.JButton jButton_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JList<Ruta> jList_rutas_disponibles;
    private javax.swing.JList<Ruta> jList_rutas_seleccionadas;
    private javax.swing.JList<Tarjeta> jList_tarjetas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea_info;
    // End of variables declaration//GEN-END:variables
}
