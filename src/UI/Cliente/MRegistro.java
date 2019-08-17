package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Objetos.Usuario;
import UI.MLogin;
import java.awt.Color;
import java.util.LinkedList;

public class MRegistro extends javax.swing.JFrame {

    private LinkedList<Usuario> lista_usuarios = new LinkedList<Usuario>();

    public MRegistro() {
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
        //Rellenamos la lista con los usuarios actuales
        this.lista_usuarios = Memoria.sql_lite_query.obtener_usuarios("SELECT * FROM USER");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_nombre_de_usuario = new javax.swing.JTextField();
        jTextField2_nombre = new javax.swing.JTextField();
        jTextField3_segundo_apellido = new javax.swing.JTextField();
        jTextField4_primer_apellido = new javax.swing.JTextField();
        jButton1_cancelar = new javax.swing.JButton();
        jButton_crear_cuenta = new javax.swing.JButton();
        jLabel3_status = new javax.swing.JLabel();
        jPasswordField_contrasenia1 = new javax.swing.JPasswordField();
        jPasswordField_contrasenia2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de usuario");

        jLabel2.setText("Nombre de usuario:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Primer apellido:");

        jLabel5.setText("Segundo apellido:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Repita la contraseña: ");

        jButton1_cancelar.setText("Cancelar");
        jButton1_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cancelarActionPerformed(evt);
            }
        });

        jButton_crear_cuenta.setText("Crear cuenta");
        jButton_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jButton1_cancelar))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3_segundo_apellido)
                            .addComponent(jTextField2_nombre)
                            .addComponent(jTextField1_nombre_de_usuario)
                            .addComponent(jTextField4_primer_apellido)
                            .addComponent(jButton_crear_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jPasswordField_contrasenia1)
                            .addComponent(jPasswordField_contrasenia2)))
                    .addComponent(jLabel3_status))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_nombre_de_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField_contrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField_contrasenia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cancelar)
                    .addComponent(jButton_crear_cuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3_status)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cancelarActionPerformed
        MLogin mLogin = new MLogin();
        this.dispose();
    }//GEN-LAST:event_jButton1_cancelarActionPerformed

    private void jButton_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crear_cuentaActionPerformed
        if (usuario_no_repetido()
                && sin_espacios_vacios()
                && longitud_contrasenia(8)
                && las_contrasenias_coinciden()
                && longitud_nombre_de_usuario(5)) {
            crear_cuenta();
        }
    }//GEN-LAST:event_jButton_crear_cuentaActionPerformed

    private boolean longitud_contrasenia(int longitud) {
        if (new String(this.jPasswordField_contrasenia1.getPassword()).length() >= longitud) {
            return true;
        } else {
            label_status_change("La contraseña debe ser de al menos " + longitud + " caracteres.", "red");
            return false;
        }
    }

    private boolean sin_espacios_vacios() {
        //Verifica que todos los espacios tengan algo escrito
        if (!jTextField1_nombre_de_usuario.getText().equals("")
                && !jTextField2_nombre.getText().equals("")
                && !jTextField3_segundo_apellido.getText().equals("")
                && !jTextField4_primer_apellido.getText().equals("")
                && !new String(this.jPasswordField_contrasenia1.getPassword()).equals("")
                && !new String(this.jPasswordField_contrasenia2.getPassword()).equals("")) {
            return true;
        } else {
            label_status_change("Debe rellenar todos los espacios!", "red");
            return false;
        }
    }

    private boolean las_contrasenias_coinciden() {
        //Verifica que los 2 espacios de contrasenia coincidan
        if (new String(this.jPasswordField_contrasenia1.getPassword()).equals(new String(this.jPasswordField_contrasenia2.getPassword()))) {
            return true;
        } else {
            label_status_change("Las contraseñas no coinciden!", "red");
            return false;
        }
    }

    private boolean usuario_no_repetido() {
        //Verifica que el nombre de usuario del usuario nuevo que se va a 
        //registrar no este repetido.
        if (!this.lista_usuarios.isEmpty()) {
            for (Usuario u : this.lista_usuarios) {
                if (u.getNombre_de_usuario().equals(jTextField1_nombre_de_usuario.getText().toLowerCase())) {
                    label_status_change("El nombre de usuario \""
                            + jTextField1_nombre_de_usuario.getText() + "\" ya ha sido tomado", "red");
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    private boolean longitud_nombre_de_usuario(int longitud) {
        String nombre_usuario = this.jTextField1_nombre_de_usuario.getText();
        if (nombre_usuario.length() >= longitud) {
            return true;
        } else {
            label_status_change("El nombre de usuario debe ser de al menos " + longitud + " caracteres", "red");
            return false;
        }
    }

    //Cambia el contenido y color del mensaje de estado.
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
                throw new AssertionError();
        }
        jLabel3_status.setText(message);
    }

    private void crear_cuenta() {
        Usuario usuario_nuevo = new Usuario();
        usuario_nuevo.setRol("cliente");
        usuario_nuevo.setNombre_de_usuario(jTextField1_nombre_de_usuario.getText().toLowerCase());
        usuario_nuevo.setContrasenia(AES.encrypt(new String(this.jPasswordField_contrasenia1.getPassword()), Memoria.DBKeyPassword));
        usuario_nuevo.setNombre(jTextField2_nombre.getText());
        usuario_nuevo.setAp_paterno(jTextField4_primer_apellido.getText());
        usuario_nuevo.setAp_materno(jTextField3_segundo_apellido.getText());
        usuario_nuevo.setHabilitado(true);
        //Consulta para ingreso de nuevo usuario a la base de datos
        Memoria.sql_lite_query.Query("INSERT INTO USER (Rol, "
                + "Nombre_usuario, "
                + "Contrasenia, "
                + "Nombre, "
                + "Ap_paterno, "
                + "Ap_materno, "
                + "Habilitado)\n"
                + "VALUES ('" + usuario_nuevo.getRol() + "', "
                + "'" + usuario_nuevo.getNombre_de_usuario() + "', "
                + "'" + usuario_nuevo.getContrasenia() + "', "
                + "'" + usuario_nuevo.getNombre() + "',"
                + "'" + usuario_nuevo.getAp_paterno() + "',"
                + "'" + usuario_nuevo.getAp_materno() + "',"
                + "'" + usuario_nuevo.isHabilitado() + "');", "Usuario registrado");
        //Redireccionamiento de usuario a menu principal una vez creada la cuenta en el proceso de registro. Dispose the ventana de registro.
        LinkedList<Usuario> lista_usuarios_temporal = new LinkedList<Usuario>();
        lista_usuarios_temporal = Memoria.sql_lite_query.obtener_usuarios("SELECT * FROM USER");
        for (Usuario usuario_temporal : lista_usuarios_temporal) {
            if (usuario_temporal.getNombre_de_usuario().equals(usuario_nuevo.getNombre_de_usuario())
                    && AES.decrypt(usuario_temporal.getContrasenia(), Memoria.DBKeyPassword).equals(AES.decrypt(usuario_nuevo.getContrasenia(), Memoria.DBKeyPassword))) {
                Memoria.usuario_actual = usuario_temporal;
            }
        }
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_cancelar;
    private javax.swing.JButton jButton_crear_cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_status;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_contrasenia1;
    private javax.swing.JPasswordField jPasswordField_contrasenia2;
    private javax.swing.JTextField jTextField1_nombre_de_usuario;
    private javax.swing.JTextField jTextField2_nombre;
    private javax.swing.JTextField jTextField3_segundo_apellido;
    private javax.swing.JTextField jTextField4_primer_apellido;
    // End of variables declaration//GEN-END:variables
}
