package UI.Admin;

import Logica.Memoria;
import UI.MLogin;

public class MNavAdmin extends javax.swing.JFrame {

    public MNavAdmin() {
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
        //Escribe el nombre de usuario en el label de bienvenida.
        this.jLabel1_bienvenida.setText("Bienvenido " + Memoria.usuario_actual.getNombre_de_usuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1_editar_rutas = new javax.swing.JButton();
        jButton2_administrar_usuarios = new javax.swing.JButton();
        jButton3_log_out = new javax.swing.JButton();
        jLabel1_bienvenida = new javax.swing.JLabel();
        jButton1_deshabiltar_cliente = new javax.swing.JButton();

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

        jLabel1_bienvenida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_bienvenida.setText("Bienvenido [Nombre usuario]");

        jButton1_deshabiltar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_deshabiltar_cliente.setText("Deshabilitar cliente");
        jButton1_deshabiltar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_deshabiltar_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel1_bienvenida)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2_administrar_usuarios)
                            .addComponent(jButton1_editar_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1_deshabiltar_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_bienvenida)
                .addGap(18, 18, 18)
                .addComponent(jButton1_editar_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2_administrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_deshabiltar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_log_outActionPerformed
        MLogin mLogin = new MLogin();
        this.dispose();
    }//GEN-LAST:event_jButton3_log_outActionPerformed

    private void jButton1_editar_rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_editar_rutasActionPerformed
        MCreacionRutas mCreacionRutas = new MCreacionRutas();
        this.dispose();
    }//GEN-LAST:event_jButton1_editar_rutasActionPerformed

    private void jButton2_administrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_administrar_usuariosActionPerformed
        MCreacionUsuarios mCreacionUsuarios = new MCreacionUsuarios();
        this.dispose();
    }//GEN-LAST:event_jButton2_administrar_usuariosActionPerformed

    private void jButton1_deshabiltar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_deshabiltar_clienteActionPerformed
        MDeshabilitarClientes mDeshabilitarClientes = new MDeshabilitarClientes();
        this.dispose();
    }//GEN-LAST:event_jButton1_deshabiltar_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_deshabiltar_cliente;
    private javax.swing.JButton jButton1_editar_rutas;
    private javax.swing.JButton jButton2_administrar_usuarios;
    private javax.swing.JButton jButton3_log_out;
    private javax.swing.JLabel jLabel1_bienvenida;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
