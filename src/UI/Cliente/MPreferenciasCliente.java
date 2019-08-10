package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Objetos.Usuario;
import UI.MLogin;

public class MPreferenciasCliente extends javax.swing.JFrame {

    public MPreferenciasCliente() {
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
        rellenar_espacios();
    }
    //Funcionalidad de los espacios para texto (jTextFields) para capturar información del menú
    private void rellenar_espacios() {
        jTextField1_nombre_usuario.setText(Memoria.usuario_actual.getNombre_de_usuario());
        jTextField2_nombre.setText(Memoria.usuario_actual.getNombre());
        jTextField3_ap1.setText(Memoria.usuario_actual.getAp_paterno());
        jTextField6_ap2.setText(Memoria.usuario_actual.getAp_materno());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_nombre_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2_nombre = new javax.swing.JTextField();
        jTextField3_ap1 = new javax.swing.JTextField();
        jToggleButton2_atras = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6_ap2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1_guardar_cambios = new javax.swing.JButton();
        jButton2_deshabilitar_cuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Usuario:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Primer apellido");

        jToggleButton2_atras.setText("Atras");
        jToggleButton2_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2_atrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Si desea cambiar su informacion personal,");
        jLabel6.setToolTipText("");

        jLabel8.setText("digite la nueva información y presione guardar");

        jLabel9.setText("Segundo apellido");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Preferencias de cuenta");

        jButton1_guardar_cambios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1_guardar_cambios.setText("Guardar cambios");
        jButton1_guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_guardar_cambiosActionPerformed(evt);
            }
        });

        jButton2_deshabilitar_cuenta.setText("Deshabilitar cuenta");
        jButton2_deshabilitar_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_deshabilitar_cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6_ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3_ap1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton2_atras)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1_guardar_cambios)
                            .addComponent(jButton2_deshabilitar_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3_ap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6_ap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jToggleButton2_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton1_guardar_cambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2_deshabilitar_cuenta)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2_atrasActionPerformed
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }//GEN-LAST:event_jToggleButton2_atrasActionPerformed

    private void jButton1_guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_guardar_cambiosActionPerformed
        //Funcionalidad de botón para guardar información y actualizar base de datos
        Memoria.usuario_actual.setNombre_de_usuario(jTextField1_nombre_usuario.getText());
        Memoria.usuario_actual.setNombre(jTextField2_nombre.getText());
        Memoria.usuario_actual.setAp_materno(jTextField6_ap2.getText());
        Memoria.usuario_actual.setAp_paterno(jTextField3_ap1.getText());
        Memoria.sql_lite_query.Query("UPDATE USER\n"
                + "SET Nombre_usuario = '" + Memoria.usuario_actual.getNombre_de_usuario() + "',"
                + "Nombre = '" + Memoria.usuario_actual.getNombre() + "',"
                + "Ap_paterno = '" + Memoria.usuario_actual.getAp_paterno() + "',"
                + "Ap_materno = '" + Memoria.usuario_actual.getAp_materno() + "'"
                + "WHERE UserID = '" + Memoria.usuario_actual.getDB_ID() + "';","Usuario actualizado");
        Run.message("Datos de la cuenta actualizados!", "Hecho", 1);
    }//GEN-LAST:event_jButton1_guardar_cambiosActionPerformed

    private void jButton2_deshabilitar_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_deshabilitar_cuentaActionPerformed
        //Funcionalida del botón de deshabilitar cuenta de cliente
        String mensaje = "¿Esta seguro de que desea deshabilitar su cuenta?\nEsta acción no puede deshacerse.";
        int opcion = Run.askMessage(mensaje, "Deshabilitar cuenta", 0, 2);
        if (opcion == 0) {
            System.out.println("delete");
            Memoria.sql_lite_query.Query("UPDATE USER\n"
                    + "SET Habilitado = '" + false + "' "
                    + "WHERE UserID = '" + Memoria.usuario_actual.getDB_ID() + "';","Usuario deshabilitado");
            Memoria.usuario_actual = new Usuario();
            MLogin mLogin = new MLogin();
            this.dispose();
        }
    }//GEN-LAST:event_jButton2_deshabilitar_cuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_guardar_cambios;
    private javax.swing.JButton jButton2_deshabilitar_cuenta;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_nombre_usuario;
    private javax.swing.JTextField jTextField2_nombre;
    private javax.swing.JTextField jTextField3_ap1;
    private javax.swing.JTextField jTextField6_ap2;
    private javax.swing.JToggleButton jToggleButton2_atras;
    // End of variables declaration//GEN-END:variables
}
