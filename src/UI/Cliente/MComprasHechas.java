package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.QRModule;
import Objetos.Ruta;
import Objetos.Ticket;

import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MComprasHechas extends javax.swing.JFrame {

    private LinkedList<Ticket> lista_tickets = new LinkedList<Ticket>();
    private DefaultListModel<Ticket> modelo_tickets = new DefaultListModel<>();
    private LinkedList<Ruta> lista_rutas = new LinkedList<Ruta>();
    private QRModule qr;

    public MComprasHechas() {
        initComponents();
        settings();
        cargar_rutas();
        cargar_tickets();
        rellenar_lista_tickets();
        try {
            this.qr = new QRModule();
        } catch (Exception e) {
        }
    }

    private void cargar_tickets() {
        // Consulta al SQL que carga los tickets
        this.lista_tickets = Memoria.sql_lite_query.obtener_tickets("SELECT * FROM TICKET");
        for (int i = 0; i < lista_tickets.size(); i++) {
            // Si el ID de una ruta es el mismo al cual pertence la ruta del ticket se le asigna esa ruta al ticket 
            // por que el nombre del ticket se basa en el punto de partida y llegada guardado en el objeto de tipo ruta
            for (Ruta r : this.lista_rutas) {
                if (lista_tickets.get(i).getRutaID() == r.getDB_ID()) {
                    lista_tickets.get(i).setRuta(r);
                    break;
                }
            }
        }
    }

    //Rellena la lista de tickets con los tickets comprados por el usuario
    //actual que esta logeado.
    private void rellenar_lista_tickets() {
        //Muestra solomaente los tickets del usuario que esta en loggeado
        this.modelo_tickets.clear();
        for (Ticket t : this.lista_tickets) {
            if (t.getClienteID() == Memoria.usuario_actual.getDB_ID()) {
                this.modelo_tickets.add(0, t);
            }
        }
        this.jList_tickets.setModel(this.modelo_tickets);
    }

    private void cargar_rutas() {
        this.lista_rutas = Memoria.sql_lite_query.obtener_rutas("SELECT * FROM RUTA");
    }

    //Ajustes del frame y set up de objetos.
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
        //Hace un salto de linea si el texto llega al final de la derecha
        jTextArea_panel_resumen.setLineWrap(true);
        //posiciona el scroll vertical hasta arriba
        jTextArea_panel_resumen.setCaretPosition(0);
        //Hace un salto de linea si el texto llega al final de la derecha
        jTextArea_panel_resumen.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_tickets = new javax.swing.JList<>();
        jButton1_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_panel_resumen = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1_qr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Resumen:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Historial de compras");

        jList_tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ticketsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_tickets);

        jButton1_volver.setText("Volver");
        jButton1_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_volverActionPerformed(evt);
            }
        });

        jTextArea_panel_resumen.setColumns(20);
        jTextArea_panel_resumen.setRows(5);
        jScrollPane1.setViewportView(jTextArea_panel_resumen);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Código QR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addComponent(jLabel1_qr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1_volver))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1_volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_volverActionPerformed
        //Boton de volver
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }//GEN-LAST:event_jButton1_volverActionPerformed

    private void jList_ticketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ticketsMouseClicked
        mostrar_informacion_ticket();
    }//GEN-LAST:event_jList_ticketsMouseClicked

    //Establece la información del ticket al cual el usuario ha hecho click
    //dentro del cuadro informativo. Establece también el codigo QR.
    private void mostrar_informacion_ticket() {
        //Variables temporales.
        Ticket t = jList_tickets.getSelectedValue();
        String resumen = "";

        //Verifica si un ticket fue seleccionado.
        if (t != null) {

            //Variable para guardar la información de que si el ticket ha sido
            //utilizado o no.
            String utilizado = "";
            if (t.isUtilizado()) {
                utilizado = "El tickete ha sido utilizado...";
            } else {
                utilizado = "No";
            }

            //Se prepara el string que mostrara la informacion dentro del cuadro informativo.
            resumen = "Viaje " + t.getRuta().getLugar_salida() + "-" + t.getRuta().getLugar_llegada() + "\n"
                    + "\n"
                    + "Codigo: " + AES.decrypt(t.getCodigo(), Memoria.DBKeyPassword) + "\n"
                    + "\n"
                    + "Fecha de caducidad: " + t.getFecha_caducidad() + "\n"
                    + "\n"
                    + "Utilizado: " + utilizado
                    + "\n"
                    + "\n"
                    + "Descripción de la ruta: \n" + obtener_descripcion_ruta(t.getRutaID());

            //Se establece dentro de un jLabel la imagen QR generada con el objeto
            //QR. El codigo corresponde al codigo del ticket seleccionado.
            try {
                jLabel1_qr.setIcon(this.qr.generar_imagen_qr(AES.decrypt(t.getCodigo(), Memoria.DBKeyPassword)));
            } catch (Exception e) {
                Logica.Run.message("The Libraries \n\njavase-3.3.0.jar\n"
                    + "zxing core-3.3.0.jar.jar\n\nWeren't found! Please, locate the "
                    + "libraries and add to .jar application\n"
                    + "Consult Troubleshooting - Libraries "
                    + "Troubleshooting.pdf for more information", "LIBRARIES NOT FOUND!", 0);
            System.exit(0);
            }
        }

        //Establece la informacion dentro del cuadro informativo.
        jTextArea_panel_resumen.setText(resumen);
    }

    //Retorna la información de la ruta a la cual el ticket esta asociada.
    //Esto es necesario para rellenar con la información de la ruta dentro del
    //cuadro informativo.
    private String obtener_descripcion_ruta(int ruta_id) {
        String mensaje = "";
        for (Ruta r : this.lista_rutas) {
            if (r.getDB_ID() == ruta_id) {
                mensaje = r.getDescripcion_ruta();
            }
        }
        return mensaje;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_volver;
    private javax.swing.JLabel jLabel1_qr;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Ticket> jList_tickets;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_panel_resumen;
    // End of variables declaration//GEN-END:variables
}
