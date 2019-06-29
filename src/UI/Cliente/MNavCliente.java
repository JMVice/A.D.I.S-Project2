package UI.Cliente;

import Logica.Static;
import UI.MLogin;

public class MNavCliente extends javax.swing.JFrame {

    public MNavCliente() {
        initComponents();
        settings();
    }

    private void settings() {
        //Establece el icono en la barra de estado y en el icono.
        setIconImage(Static.getIconImage());
        //Coloca el frame en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        //Hace el frame visible.
        this.setVisible(true);
        //Establece texto en la barra de estado.
        this.setTitle(Static.app_name);
        //No dejar que el frame se pueda hacer de tamaño grande
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1_metodo_pago = new javax.swing.JButton();
        jButton2_compra_pasajes = new javax.swing.JButton();
        jButton3_resumen_compras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7_log_out = new javax.swing.JButton();
        jButton4_cuenta_y_perfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1_metodo_pago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_metodo_pago.setText("Método de pago");
        jButton1_metodo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_metodo_pagoActionPerformed(evt);
            }
        });

        jButton2_compra_pasajes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_compra_pasajes.setText("Compra de Pasajes");
        jButton2_compra_pasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_compra_pasajesActionPerformed(evt);
            }
        });

        jButton3_resumen_compras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_resumen_compras.setText("Resumen de Compras");
        jButton3_resumen_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_resumen_comprasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ DE NAVEGACIÓN");

        jButton7_log_out.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7_log_out.setText("Log out");
        jButton7_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_log_outActionPerformed(evt);
            }
        });

        jButton4_cuenta_y_perfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_cuenta_y_perfil.setText("Cuenta y Perfil");
        jButton4_cuenta_y_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_cuenta_y_perfilActionPerformed(evt);
            }
        });

        jLabel2.setText("[Usuario JMV]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4_cuenta_y_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_metodo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_compra_pasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_resumen_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1_metodo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2_compra_pasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3_resumen_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4_cuenta_y_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7_log_out)
                .addContainerGap(29, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_metodo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_metodo_pagoActionPerformed
        MMetodoPago mMetodoPago = new MMetodoPago();
        this.dispose();
    }//GEN-LAST:event_jButton1_metodo_pagoActionPerformed

    private void jButton2_compra_pasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_compra_pasajesActionPerformed
        MCompraEntrada mCompraEntrada = new MCompraEntrada();
        this.dispose();
    }//GEN-LAST:event_jButton2_compra_pasajesActionPerformed

    private void jButton3_resumen_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_resumen_comprasActionPerformed
        MComprasHechas mComprasHechas = new MComprasHechas();
        this.dispose();
    }//GEN-LAST:event_jButton3_resumen_comprasActionPerformed

    private void jButton4_cuenta_y_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_cuenta_y_perfilActionPerformed
        MPreferenciasCliente mPreferenciasCliente = new MPreferenciasCliente();
        this.dispose();
    }//GEN-LAST:event_jButton4_cuenta_y_perfilActionPerformed

    private void jButton7_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_log_outActionPerformed
        MLogin mLogin = new MLogin();
        this.dispose();
    }//GEN-LAST:event_jButton7_log_outActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_metodo_pago;
    private javax.swing.JButton jButton2_compra_pasajes;
    private javax.swing.JButton jButton3_resumen_compras;
    private javax.swing.JButton jButton4_cuenta_y_perfil;
    private javax.swing.JButton jButton7_log_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
