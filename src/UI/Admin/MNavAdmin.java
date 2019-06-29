package UI.Admin;

import Logica.Static;
import UI.MLogin;

public class MNavAdmin extends javax.swing.JFrame {

    public MNavAdmin() {
        initComponents();
        settings();
    }

    private void settings() {
        //Coloca el frame en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        //Hace el frame visible.
        this.setVisible(true);
        //Establece texto en la barra de estado.
        this.setTitle(Static.app_name);
        //Establece el icono en la barra de estado y en el icono.
        setIconImage(Static.getIconImage());
        //No dejar que el frame se pueda hacer de tamaño grande
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1_editar_rutas = new javax.swing.JButton();
        jButton2_administrar_usuarios = new javax.swing.JButton();
        jButton3_log_out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1_editar_rutas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_editar_rutas.setText("Editor de rutas");
        jButton1_editar_rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_editar_rutasActionPerformed(evt);
            }
        });

        jButton2_administrar_usuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_administrar_usuarios.setText("Agregar o deshabilitar usuario");
        jButton2_administrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_administrar_usuariosActionPerformed(evt);
            }
        });

        jButton3_log_out.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3_log_out.setText("Log out");
        jButton3_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_log_outActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido [Nombre usuario]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2_administrar_usuarios)
                        .addComponent(jButton1_editar_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1_editar_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2_administrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_log_outActionPerformed
        MLogin mLogin = new MLogin();
    }//GEN-LAST:event_jButton3_log_outActionPerformed

    private void jButton1_editar_rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editar_rutasActionPerformed
        MCreacionRutas mCreacionRutas = new MCreacionRutas();
        this.dispose();
    }//GEN-LAST:event_jButton1_editar_rutasActionPerformed

    private void jButton2_administrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_administrar_usuariosActionPerformed
        MCreacionUsuarios mCreacionUsuarios = new MCreacionUsuarios();
        this.dispose();
    }//GEN-LAST:event_jButton2_administrar_usuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_editar_rutas;
    private javax.swing.JButton jButton2_administrar_usuarios;
    private javax.swing.JButton jButton3_log_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
