package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import java.awt.Color;

public class MCambiarContrasenia extends javax.swing.JFrame {

    public MCambiarContrasenia() {
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
        //Establece el nombre de usuario en el label de contrasenia
        this.jLabel_nombre_de_usuario.setText("Usuario: " + Memoria.usuario_actual.getNombre_de_usuario());
        label_status_change("", "red");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_nombre_de_usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_cancelar = new javax.swing.JButton();
        jButton_guardar_nueva_contrasenia = new javax.swing.JButton();
        jLabel3_status = new javax.swing.JLabel();
        jPasswordField_contrasenia_actual = new javax.swing.JPasswordField();
        jPasswordField_contrasenia_nueva = new javax.swing.JPasswordField();
        jPasswordField_repite_contrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cambiar contraseña");

        jLabel_nombre_de_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre_de_usuario.setText("Usuario: XXXXXXX");

        jLabel2.setText("Contraseña actual");

        jLabel3.setText("Contraseña nueva");

        jLabel4.setText("Repite contraseña nueva");

        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jButton_guardar_nueva_contrasenia.setText("Guardar nueva contraseña");
        jButton_guardar_nueva_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_nueva_contraseniaActionPerformed(evt);
            }
        });

        jLabel3_status.setText("STATUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3_status, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombre_de_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField_repite_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField_contrasenia_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jPasswordField_contrasenia_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_guardar_nueva_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_nombre_de_usuario)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jPasswordField_repite_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField_contrasenia_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField_contrasenia_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_guardar_nueva_contrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cancelar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        MPreferenciasCliente mPreferenciasCliente = new MPreferenciasCliente();
        this.dispose();
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jButton_guardar_nueva_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_nueva_contraseniaActionPerformed
        //Si todas las validaciones son correctas, la contraseña es actualizada.
        if (sin_espacios_vacios()
                && contrasenias_coinciden()
                && contrasenia_actual_correcta()
                && longitud_contrasenia(8)) {
            cambiar_contrasenia();
        }
    }//GEN-LAST:event_jButton_guardar_nueva_contraseniaActionPerformed

    private boolean contrasenias_coinciden() {
        String contrasenia_nueva = new String(this.jPasswordField_contrasenia_nueva.getPassword());
        String repite_contrasenia_nueva = new String(this.jPasswordField_repite_contrasenia.getPassword());
        if (contrasenia_nueva.equals(repite_contrasenia_nueva)) {
            return true;
        } else {
            label_status_change("Las contraseñas escritas para hacer el cambio no coinciden", "red");
            return false;
        }
    }

    private boolean sin_espacios_vacios() {
        String contrasenia_escrita = new String(this.jPasswordField_contrasenia_actual.getPassword());
        String contrasenia_nueva = new String(this.jPasswordField_contrasenia_nueva.getPassword());
        String repite_contrasenia_nueva = new String(this.jPasswordField_repite_contrasenia.getPassword());
        if (!contrasenia_escrita.equals("")
                && !contrasenia_nueva.equals("")
                && !repite_contrasenia_nueva.equals("")) {
            return true;
        } else {
            label_status_change("Debe rellenar todos los espacios", "red");
            return false;
        }
    }

    private boolean contrasenia_actual_correcta() {
        String contrasenia_escrita = new String(this.jPasswordField_contrasenia_actual.getPassword());
        String contrasenia_actual = AES.decrypt(Memoria.usuario_actual.getContrasenia(), Memoria.DBKeyPassword);
        if (contrasenia_escrita.equals(contrasenia_actual)) {
            return true;
        } else {
            label_status_change("La contraseña escrita no es correcta.", "red");
            return false;
        }
    }

    private boolean longitud_contrasenia(int length) {
        String repite_contrasenia_nueva = new String(this.jPasswordField_repite_contrasenia.getPassword());
        if (repite_contrasenia_nueva.length() >= length) {
            return true;
        } else {
            label_status_change("La contraseña debe ser de al menos " + length + " caracteres.", "red");
            return false;
        }
    }

    //Realiza la accion de cambiar la contraseña
    private void cambiar_contrasenia() {
        //Cambia la contraseña actual del usuario guardado en memoria.
        Memoria.usuario_actual.setContrasenia(
                AES.encrypt(new String(this.jPasswordField_repite_contrasenia.getPassword()),
                        Memoria.DBKeyPassword));
        //Ejecuta la consulta en la base de datos.
        Memoria.sql_lite_query.Query("UPDATE USER\n"
                + "SET Contrasenia = '" + 
                Memoria.usuario_actual.getContrasenia() + "'"
                + "WHERE UserID = '" + Memoria.usuario_actual.getDB_ID() + "';", "Contrasenia actualizada");
        Run.message("La contraseña ha sido actualizada.", "Hecho", 1);
        //Cierra este frame y abre las preferencias del usuario.
        MPreferenciasCliente mPreferenciasCliente = new MPreferenciasCliente();
        this.dispose();
    }

    //Establece un mensaje para mostrar al usuario cualquier error cometido.
    private void label_status_change(String message, String color) {
        switch (color) {
            case "red":
                jLabel3_status.setForeground(Color.red);
                break;
            case "blue":
                jLabel3_status.setForeground(Color.blue);
                break;
            case "green":
                jLabel3_status.setForeground(Color.green);
                break;
            case "black":
                jLabel3_status.setForeground(Color.black);
                break;
            default:
                jLabel3_status.setForeground(Color.black);
        }
        jLabel3_status.setText(message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_guardar_nueva_contrasenia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_status;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_nombre_de_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_contrasenia_actual;
    private javax.swing.JPasswordField jPasswordField_contrasenia_nueva;
    private javax.swing.JPasswordField jPasswordField_repite_contrasenia;
    // End of variables declaration//GEN-END:variables
}
