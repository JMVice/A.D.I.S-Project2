package UI.Admin;

import Logica.Memoria;
import Logica.Run;
import Objetos.Ruta;
import Objetos.Ticket;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MCreacionRutas extends javax.swing.JFrame {

    private LinkedList<Ruta> lista_rutas = new LinkedList<Ruta>();
    private DefaultListModel<Ruta> jlist_model = new DefaultListModel<>();
    private Ruta ruta_seleccionada_para_editar = null;

    public MCreacionRutas() {
        initComponents();
        settings();
        cargar_rutas();
        rellenar_lista_rutas();
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
        //Ajustes del panel de texto para la descripcion de la ruta.
        panel_settings();
        this.jRadioButton_habilitado.setSelected(true);
        this.jButton1_actualizar_ruta_seleccionada.setEnabled(false);
        this.jButton2_guardar_ruta_cancelar_cambios.setText("Guardar ruta");
    }

    //Trae las rutas de la base de datos.
    private void cargar_rutas() {
        this.lista_rutas = Memoria.sql_lite_query.obtener_rutas("SELECT * FROM RUTA");
    }

    //Llenar lista de usuarios
    private void rellenar_lista_rutas() {
        //Limpiamos el modelo en caso de que ya tenga algo establecido.
        this.jlist_model.clear();
        //Se rellena el jlist model con la lista de usuarios.
        for (Ruta u : this.lista_rutas) {
            this.jlist_model.add(0, u);
        }
        //Se la establecemos al jList.
        this.jList_rutas.setModel(this.jlist_model);
    }

    private void panel_settings() {
        //Desabilita el scroll lateral
        jTextArea1_descripcion.setLineWrap(true);
        //Desabilita el scroll vertical
        jTextArea1_descripcion.setCaretPosition(0);
        //Hace salto de linea si se llega al limite horizontal.
        jTextArea1_descripcion.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2_costo = new javax.swing.JTextField();
        jTextField4_lugar_salida = new javax.swing.JTextField();
        jTextField5_lugar_llegada = new javax.swing.JTextField();
        jTextField6_hora_salida = new javax.swing.JTextField();
        jTextField7_hora_llegada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_descripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_rutas = new javax.swing.JList<>();
        jRadioButton_habilitado = new javax.swing.JRadioButton();
        jRadioButton_deshabilitada = new javax.swing.JRadioButton();
        jButton3_volver = new javax.swing.JButton();
        jButton2_guardar_ruta_cancelar_cambios = new javax.swing.JButton();
        jButton1_actualizar_ruta_seleccionada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Costo");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Lugar de Salida");

        jLabel5.setText("Lugar de Llegada");

        jLabel6.setText("Hora de Salida");

        jLabel7.setText("Hora de Llegada");

        jLabel8.setText("Estado de la ruta");

        jTextArea1_descripcion.setColumns(20);
        jTextArea1_descripcion.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_descripcion);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Crear rutas");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Lista de rutas");

        jList_rutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_rutasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_rutas);

        buttonGroup1.add(jRadioButton_habilitado);
        jRadioButton_habilitado.setText("Habilitada");

        buttonGroup1.add(jRadioButton_deshabilitada);
        jRadioButton_deshabilitada.setText("Deshabilitada");

        jButton3_volver.setText("Volver");
        jButton3_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_volverActionPerformed(evt);
            }
        });

        jButton2_guardar_ruta_cancelar_cambios.setText("Guardar ruta / Cancelar edicion");
        jButton2_guardar_ruta_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_guardar_ruta_cancelar_cambiosActionPerformed(evt);
            }
        });

        jButton1_actualizar_ruta_seleccionada.setText("Actualizar ruta");
        jButton1_actualizar_ruta_seleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_actualizar_ruta_seleccionadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton3_volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5_lugar_llegada)
                                    .addComponent(jTextField6_hora_salida)
                                    .addComponent(jTextField4_lugar_salida)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7_hora_llegada))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jRadioButton_habilitado)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_deshabilitada)
                                .addGap(14, 14, 14)))
                        .addGap(10, 10, 10))
                    .addComponent(jButton2_guardar_ruta_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1_actualizar_ruta_seleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4_lugar_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5_lugar_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7_hora_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_deshabilitada)
                            .addComponent(jLabel8)
                            .addComponent(jRadioButton_habilitado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2_guardar_ruta_cancelar_cambios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_actualizar_ruta_seleccionada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton3_volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_volverActionPerformed
        MNavAdmin mNavAdmin = new MNavAdmin();
        this.dispose();
    }//GEN-LAST:event_jButton3_volverActionPerformed

    private void jButton2_guardar_ruta_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_guardar_ruta_cancelar_cambiosActionPerformed
        String opcion = this.jButton2_guardar_ruta_cancelar_cambios.getText();
        switch (opcion) {//
            case "Guardar ruta"://Guarda la ruta que el usuario agrego
                guardar_nueva_ruta();
                break;
            case "Cancelar cambios"://Cancela la informacion que el usuario agrego o cambio 
                this.ruta_seleccionada_para_editar = null;
                limpiar_espacios();// Elimina cualquier informacion que haya en los espacios 
                this.jButton2_guardar_ruta_cancelar_cambios.setText("Guardar ruta");
                //Se agrega la ruta creada 
                this.jButton1_actualizar_ruta_seleccionada.setEnabled(false);
                //Actualiza la ruta creada anteriormente con la informacion nueva
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jButton2_guardar_ruta_cancelar_cambiosActionPerformed

    private void jList_rutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_rutasMouseClicked
       this.ruta_seleccionada_para_editar = jList_rutas.getSelectedValue();
        //Selecciona la ruta a editar 
        if (this.ruta_seleccionada_para_editar != null) {
            rellenar_espacios_click_en_jlist(this.ruta_seleccionada_para_editar);
            //Se rellena los espacios en el JList una vez sekeccionada la ruta 
            jButton2_guardar_ruta_cancelar_cambios.setText("Cancelar cambios");
            //Guarda o cancela los cambios 
            this.jButton1_actualizar_ruta_seleccionada.setEnabled(true);
            //Actualiza la ruta agregada
        }
    }//GEN-LAST:event_jList_rutasMouseClicked

    private void jButton1_actualizar_ruta_seleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_actualizar_ruta_seleccionadaActionPerformed
        String nombre_ruta_original = this.ruta_seleccionada_para_editar.getNombreRuta();
        //Se agrega el nombre de la ruta 
        this.ruta_seleccionada_para_editar.setCosto(Integer.parseInt(jTextField2_costo.getText()));
        //Se agrega el costo del viaje
        this.ruta_seleccionada_para_editar.setDescripcion_ruta(jTextArea1_descripcion.getText());
        //Se agrega una descripcion de la ruta 
        this.ruta_seleccionada_para_editar.setLugar_llegada(jTextField5_lugar_llegada.getText());
       
        this.ruta_seleccionada_para_editar.setLugar_salida(jTextField4_lugar_salida.getText());
        this.ruta_seleccionada_para_editar.setHora_salida(jTextField6_hora_salida.getText());
        this.ruta_seleccionada_para_editar.setHora_llegada(jTextField7_hora_llegada.getText());
        if (this.jRadioButton_habilitado.isSelected()) {
            this.ruta_seleccionada_para_editar.setHabilidato(true);
        } else {
            this.ruta_seleccionada_para_editar.setHabilidato(false);
        }
        Memoria.sql_lite_query.Query("UPDATE RUTA\n"//Actualiza la ruta que el usuario anteriormente creo 
                + "SET Costo = '" + this.ruta_seleccionada_para_editar.getCosto() + "',"
                + " Descripcion_ruta = '" + this.ruta_seleccionada_para_editar.getDescripcion_ruta() + "', "
                + " Lugar_salida = '" + this.ruta_seleccionada_para_editar.getLugar_salida() + "',"
                + " Lugar_llegada = '" + this.ruta_seleccionada_para_editar.getLugar_llegada() + "',"
                + " Hora_salida = '" + this.ruta_seleccionada_para_editar.getHora_salida() + "',"
                + " Hora_llegada = '" + this.ruta_seleccionada_para_editar.getHora_llegada() + "',"
                + " Habilitado = '" + this.ruta_seleccionada_para_editar.isHabilidato() + "'"
                + "WHERE RutaID = " + this.ruta_seleccionada_para_editar.getDB_ID() + ";", "Ruta actualizada");
        cargar_rutas();//Se rellena una lista de rutas con la informacion actualizada y las rutas que se vayan agregando
        rellenar_lista_rutas();
        Run.message("Ruta " + nombre_ruta_original + " ha sido actualizada.", "Actualizada", 1);
        limpiar_espacios();
        this.jButton2_guardar_ruta_cancelar_cambios.setText("Guardar ruta");
        this.jButton1_actualizar_ruta_seleccionada.setEnabled(false);

    }//GEN-LAST:event_jButton1_actualizar_ruta_seleccionadaActionPerformed

    private void rellenar_espacios_click_en_jlist(Ruta r) {//Rellena los espacios con la informacion de la ruta 
        jTextField2_costo.setText("" + r.getCosto());
        jTextArea1_descripcion.setText(r.getDescripcion_ruta());
        jTextField4_lugar_salida.setText(r.getLugar_salida());
        jTextField5_lugar_llegada.setText(r.getLugar_llegada());
        jTextField6_hora_salida.setText(r.getHora_salida());
        jTextField7_hora_llegada.setText(r.getHora_llegada());

        if (r.isHabilidato()) {
            jRadioButton_habilitado.setSelected(true);
            jRadioButton_deshabilitada.setSelected(false);
        } else {
            jRadioButton_habilitado.setSelected(false);
            jRadioButton_deshabilitada.setSelected(true);
        }
    }

    private void guardar_nueva_ruta() {//Guarda la ruta una vez que el usuario haya rellendo la informacion de dicha ruta 
        Ruta r = new Ruta();
        if (jRadioButton_habilitado.isSelected()) {
            r.setHabilidato(true);
        } else {
            r.setHabilidato(false);
        }
        r.setCosto(Integer.parseInt(jTextField2_costo.getText()));
        r.setDescripcion_ruta(jTextArea1_descripcion.getText());
        r.setLugar_salida(jTextField4_lugar_salida.getText());
        r.setLugar_llegada(jTextField5_lugar_llegada.getText());
        r.setHora_salida(jTextField6_hora_salida.getText());
        r.setHora_llegada(jTextField7_hora_llegada.getText());
        Memoria.sql_lite_query.Query("INSERT INTO RUTA("
                + "Costo"
                + ",Descripcion_ruta"
                + ",Lugar_salida"
                + ",Lugar_llegada"
                + ",Hora_salida"
                + ",Hora_llegada"
                + ",Habilitado)"
                + "VALUES("
                + "'" + r.getCosto() + "',"
                + "'" + r.getDescripcion_ruta() + "',"
                + "'" + r.getLugar_salida() + "',"
                + "'" + r.getLugar_llegada() + "',"
                + "'" + r.getHora_salida() + "',"
                + "'" + r.getHora_llegada() + "',"
                + "'" + r.isHabilidato() + "');", "Ruta agregada");
        cargar_rutas();
        rellenar_lista_rutas();
        limpiar_espacios();
        Run.message("Ruta " + r.getNombreRuta() + " agregada!", "Agreagado", 1);
    }

    private void limpiar_espacios() {//Elimina los espacios de que esten rellenados 
        jTextField2_costo.setText("");
        jTextArea1_descripcion.setText("");
        jTextField4_lugar_salida.setText("");
        jTextField5_lugar_llegada.setText("");
        jTextField6_hora_salida.setText("");
        jTextField7_hora_llegada.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_actualizar_ruta_seleccionada;
    private javax.swing.JButton jButton2_guardar_ruta_cancelar_cambios;
    private javax.swing.JButton jButton3_volver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Ruta> jList_rutas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_deshabilitada;
    private javax.swing.JRadioButton jRadioButton_habilitado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1_descripcion;
    private javax.swing.JTextField jTextField2_costo;
    private javax.swing.JTextField jTextField4_lugar_salida;
    private javax.swing.JTextField jTextField5_lugar_llegada;
    private javax.swing.JTextField jTextField6_hora_salida;
    private javax.swing.JTextField jTextField7_hora_llegada;
    // End of variables declaration//GEN-END:variables

}
