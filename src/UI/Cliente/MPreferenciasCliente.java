package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Objetos.Usuario;
import UI.MLogin;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
        label_status_change("", "red");
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
        jButton_cambiar_contrasenia = new javax.swing.JButton();
        jLabel_status = new javax.swing.JLabel();

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

        jButton_cambiar_contrasenia.setText("Cambiar contraseña");
        jButton_cambiar_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cambiar_contraseniaActionPerformed(evt);
            }
        });

        jLabel_status.setText("STATUS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

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
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1_guardar_cambios, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jButton2_deshabilitar_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cambiar_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_guardar_cambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_cambiar_contrasenia)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2_deshabilitar_cuenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jToggleButton2_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel_status)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2_atrasActionPerformed
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }//GEN-LAST:event_jToggleButton2_atrasActionPerformed

    private void jButton1_guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_guardar_cambiosActionPerformed
        if (usuario_no_repetido()
                && sin_espacios_vacios()
                && longitud_nombre_de_usuario(5, 15)) {
            guardar_cambios();
        }
    }//GEN-LAST:event_jButton1_guardar_cambiosActionPerformed

    //Guarda los cambios realizados en la base de datos.
    private void guardar_cambios() {
        
        //Variables temporales para construir el objeto.
        Memoria.usuario_actual.setNombre_de_usuario(jTextField1_nombre_usuario.getText());
        Memoria.usuario_actual.setNombre(jTextField2_nombre.getText());
        Memoria.usuario_actual.setAp_materno(jTextField6_ap2.getText());
        Memoria.usuario_actual.setAp_paterno(jTextField3_ap1.getText());
        
        //Consulta SQLite para hacer el update a la base de datos
        Memoria.sql_lite_query.Query("UPDATE USER\n"
                + "SET Nombre_usuario = '" + Memoria.usuario_actual.getNombre_de_usuario() + "',"
                + "Nombre = '" + Memoria.usuario_actual.getNombre() + "',"
                + "Ap_paterno = '" + Memoria.usuario_actual.getAp_paterno() + "',"
                + "Ap_materno = '" + Memoria.usuario_actual.getAp_materno() + "'"
                + "WHERE UserID = '" + Memoria.usuario_actual.getDB_ID() + "';", "Usuario actualizado");
        
        //Mensaje de exito
        Run.message("Datos de la cuenta actualizados!", "Hecho", 1);
        
        //Limpia errores.
        label_status_change("", "red");
    }

    private void jButton2_deshabilitar_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_deshabilitar_cuentaActionPerformed
        //Funcionalida del botón de deshabilitar cuenta de cliente
        String status = JOptionPane.showInputDialog("¿Esta seguro "
                + "de que desea deshabilitar su cuenta?"
                + "\nEscriba \"delete\" dentro de la caja de texto para proceder"
                + "\nEsta acción no puede deshacerse.");
        try {
            if (status.toLowerCase().equals("delete")) {
                Memoria.sql_lite_query.Query("UPDATE USER\n"
                        + "SET Habilitado = '" + false + "' "
                        + "WHERE UserID = '" + Memoria.usuario_actual.getDB_ID() + "';", "Usuario deshabilitado");
                Memoria.usuario_actual = new Usuario();
                MLogin mLogin = new MLogin();
                this.dispose();
            } else {
                System.out.println("cancelado");
            }
        } catch (Exception e) {
            System.out.println("cancelado");
        }
    }//GEN-LAST:event_jButton2_deshabilitar_cuentaActionPerformed

    //Verifica si el nombre de usuario seleccionado no esta ya en uso por otro usuario.
    //Además, si el nombre de usuario es igual al actual, regresa true.
    private boolean usuario_no_repetido() {
        if (!Memoria.usuario_actual.getNombre_de_usuario().toLowerCase().equals(jTextField1_nombre_usuario.getText().toLowerCase())) {
            LinkedList<Objetos.Usuario> lista_usuarios = Memoria.sql_lite_query.obtener_usuarios("Select * from USER");
            for (Objetos.Usuario u : lista_usuarios) {
                if (u.getNombre_de_usuario().toLowerCase().equals(this.jTextField1_nombre_usuario.getText().toLowerCase())) {
                    label_status_change("El nombre de usuario " + u.getNombre_de_usuario() + " ya esta en uso.", "red");
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    //Verifica que el usuario haya llenado todos los espacios.
    private boolean sin_espacios_vacios() {
        if (!this.jTextField1_nombre_usuario.getText().equals("")
                && !this.jTextField2_nombre.getText().equals("")
                && !this.jTextField3_ap1.getText().equals("")
                && !this.jTextField6_ap2.getText().equals("")) {
            return true;
        } else {
            label_status_change("Ningun espacio puede estar vacio", "red");
            return false;
        }
    }

    private boolean longitud_nombre_de_usuario(int longitud_minima, int longitud_maxima) {
        String nombre_usuario = this.jTextField1_nombre_usuario.getText();
        if (nombre_usuario.length() >= longitud_minima && nombre_usuario.length() <= longitud_maxima) {
            return true;
        } else {
            if (nombre_usuario.length() < longitud_minima) {
                label_status_change("El nombre de usuario debe ser de al menos " + longitud_minima + " caracteres", "red");
            } else {
                label_status_change("El nombre de usuario no puede ser mayor a " + longitud_maxima + " caracteres", "red");
            }
            return false;
        }
    }

    //Asigna mensajes de error en pantalla.
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

    private void jButton_cambiar_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cambiar_contraseniaActionPerformed
        MCambiarContrasenia mCambiarContrasenia = new MCambiarContrasenia();
        this.dispose();
    }//GEN-LAST:event_jButton_cambiar_contraseniaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_guardar_cambios;
    private javax.swing.JButton jButton2_deshabilitar_cuenta;
    private javax.swing.JButton jButton_cambiar_contrasenia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_nombre_usuario;
    private javax.swing.JTextField jTextField2_nombre;
    private javax.swing.JTextField jTextField3_ap1;
    private javax.swing.JTextField jTextField6_ap2;
    private javax.swing.JToggleButton jToggleButton2_atras;
    // End of variables declaration//GEN-END:variables
}
