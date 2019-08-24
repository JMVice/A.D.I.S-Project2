package UI.Admin;

import Logica.Memoria;
import Objetos.Usuario;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MDeshabilitarClientes extends javax.swing.JFrame {

    private LinkedList<Usuario> lista_usuarios = new LinkedList<Usuario>();
    private DefaultListModel<Usuario> modelo_de_lista = new DefaultListModel<Usuario>();
    private Usuario usuario_a_editar = new Usuario();

    public MDeshabilitarClientes() {
        initComponents();
        settings();
        cargar_usuarios();
        rellenar_lista();
    }

    //Carga los usuarios dentro de la base de datos en la lista local.
    private void cargar_usuarios() {
        this.lista_usuarios = Memoria.sql_lite_query.obtener_usuarios("SELECT * FROM USER");
    }

    //Rellena la lista con los usuarios dentro de la lista
    private void rellenar_lista() {
        this.modelo_de_lista.clear();
        for (Usuario u : this.lista_usuarios) {
            if (u.getRol().equals("cliente")) {
                this.modelo_de_lista.add(0, u);
            }
        }
        this.jList_usuarios.setModel(this.modelo_de_lista);
    }

    //Ajustes del Frame
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
        this.jButton_habilitar.setEnabled(false);
        this.jButton_deshabilitar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_usuarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_status_cliente = new javax.swing.JLabel();
        jButton_habilitar = new javax.swing.JButton();
        jButton_deshabilitar = new javax.swing.JButton();
        jLabel3_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_volver.setText("Volver");
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });

        jList_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_usuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Deshabilitar cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Status del cliente:");

        jLabel_status_cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_habilitar.setText("Habilitar");
        jButton_habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_habilitarActionPerformed(evt);
            }
        });

        jButton_deshabilitar.setText("Deshabilitar");
        jButton_deshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deshabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jButton_habilitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_deshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel_status_cliente))
                            .addComponent(jLabel3_status))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_volver)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_status_cliente)
                        .addGap(35, 35, 35)
                        .addComponent(jButton_habilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_deshabilitar)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3_status))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jList_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_usuariosMouseClicked
        //Manejo de eventos para habilitación de botones de acuerdo al usuario seleccionado
        if (!this.lista_usuarios.isEmpty()) {
            this.usuario_a_editar = this.jList_usuarios.getSelectedValue();
            if (usuario_a_editar != null) {
                if (usuario_a_editar.isHabilitado()) {
                    this.jLabel_status_cliente.setText("Habilitado");
                    this.jButton_deshabilitar.setEnabled(true);
                    this.jButton_habilitar.setEnabled(false);
                } else {
                    this.jLabel_status_cliente.setText("Deshabilitado");
                    this.jButton_habilitar.setEnabled(true);
                    this.jButton_deshabilitar.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_jList_usuariosMouseClicked

    private void jButton_habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_habilitarActionPerformed
        //Funcionalidad de botón para habílitar usuario y realizar consultas requeridas a la base de datos
        if (this.usuario_a_editar != null) {
            String nombre_usuario_seleccionado = this.usuario_a_editar.getNombre();
            Memoria.sql_lite_query.Query("UPDATE USER\n"
                    + "SET Habilitado = '" + true + "'"
                    + "WHERE UserID = '" + this.usuario_a_editar.getDB_ID() + "';", "Usuario actualizado.. habilitado");
            cargar_usuarios();
            rellenar_lista();
            this.usuario_a_editar = null;
            jList_usuarios.clearSelection();
            this.jButton_habilitar.setEnabled(false);
            this.jButton_deshabilitar.setEnabled(false);
            label_status_change("Usuario " + nombre_usuario_seleccionado + " ha sido habilitado", "black");
        }
    }//GEN-LAST:event_jButton_habilitarActionPerformed

    private void jButton_deshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deshabilitarActionPerformed
        //Funcionalidad de botón para deshabilitar usuario y realizar consultas requeridas a la base de datos
        if (this.usuario_a_editar != null) {
            String nombre_usuario_seleccionado = this.usuario_a_editar.getNombre();
            Memoria.sql_lite_query.Query("UPDATE USER\n"
                    + "SET Habilitado = '" + false + "'"
                    + "WHERE UserID = '" + this.usuario_a_editar.getDB_ID() + "';", "Usuario actualizado.. habilitado");
            cargar_usuarios();
            rellenar_lista();
            this.usuario_a_editar = null;
            jList_usuarios.clearSelection();
            this.jButton_habilitar.setEnabled(false);
            this.jButton_deshabilitar.setEnabled(false);
            //Label con mesaje de habilitación
            label_status_change("Usuario " + nombre_usuario_seleccionado + " ha sido deshabilitado", "black");
        }
    }//GEN-LAST:event_jButton_deshabilitarActionPerformed

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        //Funcionalidad de botón para regresar al menú de navegación de administrador y cierre de ventana
        MNavAdmin mNavAdmin = new MNavAdmin();
        this.dispose();
    }//GEN-LAST:event_jButton_volverActionPerformed
    
    //Formato del color de los mensajes desplegados de las acciones ejecutadas
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
    private javax.swing.JButton jButton_deshabilitar;
    private javax.swing.JButton jButton_habilitar;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_status;
    private javax.swing.JLabel jLabel_status_cliente;
    private javax.swing.JList<Usuario> jList_usuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
