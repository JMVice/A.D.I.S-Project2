package UI.Chofer;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Objetos.Ruta;
import Objetos.Ticket;
import UI.MLogin;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MChofer extends javax.swing.JFrame {

//Variable de tipo lista que almacena las rutas de la base de datos
    private LinkedList<Ruta> lista_rutas = new LinkedList<Ruta>();
    //Variable de tipo lista que almacena los tickets de la base de datos
    private LinkedList<Ticket> lista_tickets = new LinkedList<Ticket>();
    //Modelo para dar forma a la lista de rutas.
    private DefaultListModel<Ruta> modelo_rutas = new DefaultListModel<>();
    //String para controlar la digitacion de digitos en el panel electronico
    //cuando se este en modo de pago manual
    private String contenido_panel_de_digitación = "";
    //variable local que almacena la ruta seleccionada
    private Ruta ruta_seleccionada = new Ruta();

    private int costo_total = 0;

    public MChofer() {
        initComponents();
        settings();
        cargar_rutas();
        rellenar_lista_rutas();
        cargar_tickets();
    }

    //Carga las rutas de la base de datos.
    private void cargar_rutas() {
        this.lista_rutas = Memoria.sql_lite_query.obtener_rutas("SELECT * FROM RUTA");
    }

    //ellena la lista de rutas con las rutas disponibles en la base de datos.
    private void rellenar_lista_rutas() {
        this.modelo_rutas.clear();
        for (Ruta r : this.lista_rutas) {
            this.modelo_rutas.add(0, r);
        }
        this.jList_rutas.setModel(this.modelo_rutas);
    }

    //Carga los tickets almaenados en la base de datos
    private void cargar_tickets() {
        this.lista_tickets = Memoria.sql_lite_query.obtener_tickets("SELECT * FROM TICKET");
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
        //establece la modalidad por default de pago en efectivo
        this.jRadioButton_pago_manual.setSelected(true);
        this.jRadioButton_pago_por_ticket.setSelected(false);
        //Hacemos que el panel de digitación sea solo editable con el teclado
        //solo cuando se esta en modalidad de pago manual.
        this.jTextField_panel_de_digitacion.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_nombre_ruta = new javax.swing.JLabel();
        jTextField_panel_de_digitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_rutas = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_costo = new javax.swing.JLabel();
        jSpinner_pasajeros = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel_total_a_pagar = new javax.swing.JLabel();
        jButton0 = new javax.swing.JButton();
        jButton_C = new javax.swing.JButton();
        jRadioButton_pago_manual = new javax.swing.JRadioButton();
        jRadioButton_pago_por_ticket = new javax.swing.JRadioButton();
        jButton13_log_out = new javax.swing.JButton();
        jButton_pago_validar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("7");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("9");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pagos - Chofer");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ruta:");

        jLabel_nombre_ruta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nombre_ruta.setText("sin ruta seleccionada");

        jTextField_panel_de_digitacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jList_rutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_rutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_rutas);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Lista rutas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Costo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Pasajeros:");

        jLabel_costo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_costo.setText("₡:");
        jLabel_costo.setToolTipText("");

        jSpinner_pasajeros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner_pasajeros.setModel(new javax.swing.SpinnerNumberModel(1, 1, 60, 1));
        jSpinner_pasajeros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_pasajerosStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Total:");

        jLabel_total_a_pagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_total_a_pagar.setText("₡:");
        jLabel_total_a_pagar.setToolTipText("");

        jButton0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton0.setText("0");
        jButton0.setToolTipText("");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton_C.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_C.setText("C");
        jButton_C.setToolTipText("");
        jButton_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_pago_manual);
        jRadioButton_pago_manual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_pago_manual.setText("Pago manual");
        jRadioButton_pago_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_pago_manualActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_pago_por_ticket);
        jRadioButton_pago_por_ticket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton_pago_por_ticket.setText("Pago por ticket");
        jRadioButton_pago_por_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_pago_por_ticketActionPerformed(evt);
            }
        });

        jButton13_log_out.setText("Log out");
        jButton13_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13_log_outActionPerformed(evt);
            }
        });

        jButton_pago_validar.setText("Pagar/Validar");
        jButton_pago_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pago_validarActionPerformed(evt);
            }
        });

        jLabel4.setText("Colones/ticket");

        jLabel_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_pago_validar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRadioButton_pago_manual)
                            .addGap(41, 41, 41)
                            .addComponent(jRadioButton_pago_por_ticket))))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel_status))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton13_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel_nombre_ruta))
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel_costo))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jSpinner_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel_total_a_pagar)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(jTextField_panel_de_digitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(46, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_pago_manual)
                    .addComponent(jRadioButton_pago_por_ticket))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jButton_pago_validar)
                .addGap(33, 33, 33)
                .addComponent(jLabel_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13_log_out)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(16, 16, 16)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel_nombre_ruta))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel_costo))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jSpinner_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel_total_a_pagar)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5)
                                        .addComponent(jButton6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton0)
                                        .addComponent(jButton_C))))
                            .addGap(66, 66, 66)
                            .addComponent(jTextField_panel_de_digitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold desc="Botones">

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "1";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "2";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "3";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "4";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "5";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "6";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "7";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "8";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "9";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if (this.jRadioButton_pago_manual.isSelected()) {
            this.contenido_panel_de_digitación += "0";
            this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
            label_status_change("", "black");
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CActionPerformed
        this.contenido_panel_de_digitación = "";
        this.jTextField_panel_de_digitacion.setText(this.contenido_panel_de_digitación);
        label_status_change("", "black");
    }//GEN-LAST:event_jButton_CActionPerformed

    // </editor-fold>

    private void jButton13_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13_log_outActionPerformed
        MLogin mLogin = new MLogin();
        this.dispose();
    }//GEN-LAST:event_jButton13_log_outActionPerformed

    private void jRadioButton_pago_por_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_pago_por_ticketActionPerformed
        //Cambio a la modalidad de pago por ticket. Se hacen cambios en la visual
        if (this.jRadioButton_pago_por_ticket.isSelected()) {
            //se deshabilita el teclado electronico
            cambiar_estado_de_teclado_electronico(false);
            //se limpia el contenido del panel electronico
            limpiar_panel_electronico();
            //se habilita el panel electronico para escribir en el con el teclado
            cambiar_estado_panel_electronico(true);
            //Cambios visuales
            this.jLabel_nombre_ruta.setText("sin ruta seleccionada");
            this.jList_rutas.setEnabled(false);
            this.jSpinner_pasajeros.setEnabled(false);
            this.costo_total = 0;
            this.jLabel_costo.setText("₡:");
            this.jLabel_total_a_pagar.setText("₡:");
            this.jSpinner_pasajeros.setValue((int) 1);
            this.ruta_seleccionada = null;
            this.jButton_pago_validar.setText("Validar");
            label_status_change("", "black");
            //se deselecciona cualquier ruta previamente seleccionada en la
            //modalidad de pago manual
            this.jList_rutas.clearSelection();
        }
    }//GEN-LAST:event_jRadioButton_pago_por_ticketActionPerformed

    private void jRadioButton_pago_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_pago_manualActionPerformed
        //cambios en la visual del frame si se cambia a modalidad de pago manual
        if (this.jRadioButton_pago_manual.isSelected()) {
            //se activa el teclado electronico
            cambiar_estado_de_teclado_electronico(true);
            //se limpia el contenido del teclado electronico
            limpiar_panel_electronico();
            //deshabilita la digitacion del teclado fisico en el panel electronico
            cambiar_estado_panel_electronico(false);
            //activa la seleccion de rutas
            this.jList_rutas.setEnabled(true);
            //activa el spinner de cantidad de pasajeros
            this.jSpinner_pasajeros.setEnabled(true);
            //cambia el texto del boton a "pagar
            this.jButton_pago_validar.setText("Pagar");
            //borra la ruta seleccionada, porque en modo ticket ahora se paga
            //con tickets y no con seleccion de rutas
            this.ruta_seleccionada = null;
        }
    }//GEN-LAST:event_jRadioButton_pago_manualActionPerformed

    private void jList_rutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_rutasMouseClicked
        //Al pulsar la lista de rutas, se actualiza la información de la ruta 
        //seleccionada en pantalla.
        this.ruta_seleccionada = this.jList_rutas.getSelectedValue();
        if (ruta_seleccionada != null) {
            this.costo_total = this.ruta_seleccionada.getCosto();
            //Muestra en pantalla el nombre de la ruta
            this.jLabel_nombre_ruta.setText(ruta_seleccionada.getNombreRuta());
            //Muestra en pantalla el costo de la ruta
            this.jLabel_costo.setText("₡: " + this.ruta_seleccionada.getCosto());
            //muestra en pantalla el costo total a pagar
            this.jLabel_total_a_pagar.setText("₡: " + this.ruta_seleccionada.getCosto());
            //resetea el spiner a 1, por default se asume que se va a pagar solo
            //una entrada
            this.jSpinner_pasajeros.setValue((int) 1);
        }
    }//GEN-LAST:event_jList_rutasMouseClicked

    private void jSpinner_pasajerosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_pasajerosStateChanged
        //Aumenta el precio total en relaion a cuantos pasajeros supone el pago
        //de un pasaje.
        int valor = (int) this.jSpinner_pasajeros.getValue();
        this.costo_total = (this.ruta_seleccionada.getCosto() * valor);
        this.jLabel_total_a_pagar.setText("₡:" + costo_total);
    }//GEN-LAST:event_jSpinner_pasajerosStateChanged

    private void jButton_pago_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pago_validarActionPerformed
        //Al pulsar el boton de validar pago, se llama el metodo correspondiente a esta accion.
        verificacion_antes_de_pago(tipo_de_pago());
    }//GEN-LAST:event_jButton_pago_validarActionPerformed

    //Tipo de pago. 0=Pago manual. 1=Pago por ticket.
    private void verificacion_antes_de_pago(int tipo_pago) {
        switch (tipo_pago) {
            //pago manual
            case 0:
                //valida que se hata seleccionado una ruta antes de intentar un pago.
                if (this.ruta_seleccionada != null && costo_total > 0) {
                    //valida que se haya digitado algo en el menu de digitacion
                    if (!this.jTextField_panel_de_digitacion.getText().equals("")) {
                        //valida si el monto dado es mayor o igual al cobro del pase
                        if (this.costo_total <= Integer.parseInt(this.jTextField_panel_de_digitacion.getText())) {
                            //si llegamos aqui, el pago fue exitoso
                            int valor_con_que_el_cliente_paga = Integer.parseInt(this.jTextField_panel_de_digitacion.getText());
                            this.jTextField_panel_de_digitacion.setText("");
                            this.contenido_panel_de_digitación = "";
                            //mostramos en pantalla el vuelto del cliente.
                            label_status_change("El vuelto del cliente es: " + (valor_con_que_el_cliente_paga - this.costo_total), "black");
                            //Metodo que agrega el registro de un pago manual en la base de datos.
                            insertar_registro_en_historial_compra_PAGO_MANUAL();
                        } else {
                            this.jTextField_panel_de_digitacion.setText("");
                            this.contenido_panel_de_digitación = "";
                            Run.message("El monto que el cliente ha dado no es suficiente!", "Monto insuficiente", 2);
                        }
                    } else {
                        Run.message("Debe digitar el monto con el que el cliente paga su entrada!", "Falta informacion.", 0);
                    }
                } else {
                    Run.message("Debe seleccionar una ruta primero!", "Sin ruta seleccionada", 0);
                }
                break;
                //Modalidad de pago por ticket
            case 1:
                //Boolean para validar si el ticket existe
                boolean ticket_existente = false;
                Ticket ticket_encontrado = new Ticket();
                //validar si se escribio algo en el panel virtual
                if (!this.jTextField_panel_de_digitacion.getText().equals("")) {
                    String codigo_ticket = jTextField_panel_de_digitacion.getText();
                    //busca el ticket en la base de datos.
                    for (Ticket t : this.lista_tickets) {
                        //si entra aqui, no ha encontrado
                        if (AES.decrypt(t.getCodigo(), Memoria.DBKeyPassword).equals(codigo_ticket)) {
                            ticket_existente = true;
                            ticket_encontrado = t;
                            break;
                        }
                    }
                    if (ticket_existente) {
                        if (!ticket_encontrado.isUtilizado()) {
                            //Si el ticket no ha sido utilizado se ejecuta el update del ticket en la base
                            //de datos para especificar que acaba de ser utilizado.
                            Memoria.sql_lite_query.Query("UPDATE TICKET\n"
                                    + "SET Utilizado = '" + true + "'"
                                    + "WHERE TicketID = '" + ticket_encontrado.getDB_ID() + "';", "Ticket actualizado... utilizado");
                            Run.message("Ticket aceptado. El cliente puede pasar.", "Ticket correcto.", 1);
                            insertar_registro_en_historial_compra_TICKET(ticket_encontrado);
                            cargar_tickets();
                            //mensajes de error
                        } else {
                            //si el ticket ya ha sido utilizado, se mostrara esa alerta
                            Run.message("El ticket digitado ya ha sido utilizado...", "Ticket utilizado", 2);
                        }
                    } else {
                        Run.message("El ticket ingresado no existe!", "Ticket no existente", 0);
                    }
                    break;
                }

            default:
                throw new AssertionError();
        }
    }

    //Retorna 0 o 1 segun corresponda para realizar las lineas de codigo
    //correspondiente a si el cliente esta ingresando al autobus por medio del
    //uso de un ticket o un pago manual.
    //0=Pago manual. 1=Pago por ticket.
    private int tipo_de_pago() {
        //Esto se valida dependiendo de si el jradiobutton esta activado o no.
        if (jRadioButton_pago_manual.isSelected()) {
            return 0;
        } else {
            return 1;
        }
    }

    //Habilita o deshabilita el teclado electronico.
    private void cambiar_estado_de_teclado_electronico(boolean estado) {
        this.jButton0.setEnabled(estado);
        this.jButton1.setEnabled(estado);
        this.jButton2.setEnabled(estado);
        this.jButton3.setEnabled(estado);
        this.jButton4.setEnabled(estado);
        this.jButton5.setEnabled(estado);
        this.jButton6.setEnabled(estado);
        this.jButton7.setEnabled(estado);
        this.jButton8.setEnabled(estado);
        this.jButton9.setEnabled(estado);
    }

    //Vacia
    private void limpiar_panel_electronico() {
        this.contenido_panel_de_digitación = "";
        this.jTextField_panel_de_digitacion.setText("");
    }

    //habilita o deshabilita la digitacion por teclado del panel electronico.
    private void cambiar_estado_panel_electronico(boolean estado) {
        this.jTextField_panel_de_digitacion.setEditable(estado);
    }

    //Metodo que cambia el texto del vuelto del usuario
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
                throw new AssertionError();
        }
        jLabel_status.setText(message);
    }

    //Inserta un registro en la tabla de historial de compras cuando se hace una
    //entrada de un cliente utilizando un ticket.
    private void insertar_registro_en_historial_compra_TICKET(Ticket ticket) {
        Memoria.sql_lite_query.Query("INSERT INTO HISTORIAL_COMPRA "
                + "(UserID_cliente"
                + ", UserID_cobrador"
                + ", TicketID"
                + ", RutaID)"
                + "VALUES "
                + "('" + ticket.getClienteID() + "'"
                + ", '" + Memoria.usuario_actual.getDB_ID() + "'"
                + ", '" + ticket.getDB_ID() + "'"
                + ", '" + ticket.getRutaID() + "');", "Registro de pago con ticket guardado");
    }

    //Inserta un registro en la tabla de historial de compras cuando se hace una
    //entrada de un cliente cuando paga de manera manual
    private void insertar_registro_en_historial_compra_PAGO_MANUAL() {
        Memoria.sql_lite_query.Query("INSERT INTO HISTORIAL_COMPRA "
                + "(UserID_cobrador"
                + ", RutaID"
                + ",Monto)\n"
                + "VALUES "
                + "('" + Memoria.usuario_actual.getDB_ID() + "'"
                + ", '" + this.ruta_seleccionada.getDB_ID() + "'"
                + ", '" + this.ruta_seleccionada.getCosto() + "');", "Registro de pago manual guardado");
        Run.message("Pago exitoso", "Pago exitoso", 1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13_log_out;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_C;
    private javax.swing.JButton jButton_pago_validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_costo;
    private javax.swing.JLabel jLabel_nombre_ruta;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JLabel jLabel_total_a_pagar;
    private javax.swing.JList<Ruta> jList_rutas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_pago_manual;
    private javax.swing.JRadioButton jRadioButton_pago_por_ticket;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_pasajeros;
    private javax.swing.JTextField jTextField_panel_de_digitacion;
    // End of variables declaration//GEN-END:variables
}
