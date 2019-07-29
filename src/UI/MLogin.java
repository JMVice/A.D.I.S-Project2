package UI;

import Logica.AES;
import Logica.Memoria;
import Objetos.Usuario;
import UI.Admin.MNavAdmin;
import UI.Chofer.MChofer;
import UI.Cliente.MNavCliente;
import UI.Cliente.MRegistro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class MLogin extends javax.swing.JFrame {

    //Lista que guardara temporalmente los usuaios para comprobar credenciales
    //e iniciar sesion.
    private LinkedList<Usuario> lista_usuarios = new LinkedList();

    public MLogin() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_log_in = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_nombre_usuario = new javax.swing.JTextField();
        jButton_registrarse = new javax.swing.JButton();
        jLabel3_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_log_in.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_log_in.setText("Ingresar");
        jButton_log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_log_inActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CR BUSES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de usuario");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jTextField1_nombre_usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1_nombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_nombre_usuarioKeyTyped(evt);
            }
        });

        jButton_registrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_registrarse.setText("Registrarse");
        jButton_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarseActionPerformed(evt);
            }
        });

        jLabel3_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField1_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3_status)
                            .addComponent(jButton_log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton_log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3_status)
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void jButton_log_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_log_inActionPerformed
        //Boton que ejecuta el inicio de sesion
        iniciar_sesion();
    }//GEN-LAST:event_jButton_log_inActionPerformed

    //Inicia seción, valida usuario y contraseña
    private void iniciar_sesion() {
        // Condición que valida que se haya ingresado la información de usuario y contraseña 
        if (!new String(jPasswordField1.getPassword()).equals("") && !jTextField1_nombre_usuario.getText().equals("")) {
            // Llama a la usuario dentro de la base de datos
            this.lista_usuarios = Memoria.sql_lite_query.obtener_usuarios("SELECT * FROM USER");
            if (!this.lista_usuarios.isEmpty()) {
                //Validación que el usuario exista
                for (Usuario u : this.lista_usuarios) {
                    // Se valida que la contraseña sea correcta y el nombre de usuario
                    if (AES.decrypt(u.getContrasenia(), Memoria.DBKeyPassword).equals(new String(jPasswordField1.getPassword()))
                            && u.getNombre_de_usuario().equals(jTextField1_nombre_usuario.getText())) {
                        Memoria.usuario_actual = u;
                        //Abre nuevo menu de navegación dependiendo del rol
                        switch (u.getRol()) {
                            case "admin":
                                MNavAdmin mNavAdmin = new MNavAdmin();
                                this.dispose();
                                break;
                            case "cliente":
                                MNavCliente mNavCliente = new MNavCliente();
                                this.dispose();
                                break;
                            case "chofer":
                                MChofer mChofer = new MChofer();
                                this.dispose();
                                break;
                            case "masteradmin":
                                MNavAdmin mNavAdmin2 = new MNavAdmin();
                                this.dispose();
                                break;
                            default:
                                throw new AssertionError();
                        }
                        break;
                    }
                }
                //mensajes a mostrar dependiendo del error
                label_status_change("El usuario o la contraseña no es correcta.", "red");
            } else {
                System.out.println("sin usuarios");
                label_status_change("No hay usuarios en la base de datos", "red");
            }
        } else {
            label_status_change("Debe rellenar todos los espacios.", "red");
        }
    }

    private void jButton_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarseActionPerformed
        // Abre ventana de registro 
        MRegistro mRegistro = new MRegistro();
        this.dispose();
    }//GEN-LAST:event_jButton_registrarseActionPerformed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        // Inicia sesion presionando enter
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            iniciar_sesion();
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jTextField1_nombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_nombre_usuarioKeyTyped
        // Inicia sesion presionando enter
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            iniciar_sesion();
        }
    }//GEN-LAST:event_jTextField1_nombre_usuarioKeyTyped

    //Mensaje que se muestra de error en caso de haberlos en el momento de log in 
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_log_in;
    private javax.swing.JButton jButton_registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1_nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
