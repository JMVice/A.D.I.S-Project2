package UI.Cliente;

import Logica.AES;
import Logica.Memoria;
import Logica.Run;
import Logica.Fecha;
import Objetos.Tarjeta;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class MMetodoPago extends javax.swing.JFrame {

    private LinkedList<Tarjeta> lista_tarjetas = new LinkedList<Tarjeta>();
    private DefaultListModel<Tarjeta> modelo_tarjetas = new DefaultListModel<Tarjeta>();
    private int contador_de_tarjetas_usuario = 0;

    public MMetodoPago() {
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
        //Carga las tarjetas en la lista
        cargar_tarjetas();
        //Rellena la lista con las tarjetas
        rellenar_lista();
        verificar_limite_de_tarjetas();
    }

    private void cargar_tarjetas() {
        this.lista_tarjetas = Memoria.sql_lite_query.obtener_tarjetas("SELECT * FROM TARJETA");
    }

    private void rellenar_lista() {
        this.contador_de_tarjetas_usuario = 0;
        this.modelo_tarjetas.clear();
        for (Tarjeta t : this.lista_tarjetas) {
            if (t.getClienteID() == Memoria.usuario_actual.getDB_ID()) {
                this.contador_de_tarjetas_usuario++;
                this.modelo_tarjetas.add(0, t);
            }
        }
        this.jList_tarjetas.setModel(this.modelo_tarjetas);
    }

    //Vacia los espacios de texto cuando es llamado.
    private void limpiar_espacios() {
        jTextField1_numero_tarjeta.setText("");
        jTextField2_cvv.setText("");
        label_marca_tarjeta("", "black");
        label_status("", "black");
    }

    //Un usuario solo puede guardar 3 tarjetas. Si guarda más de 3, el usuario
    //no podra guardar mas.
    private void verificar_limite_de_tarjetas() {
        if (this.contador_de_tarjetas_usuario >= 3) {
            label_status("Limite de 3 tarjetas alcanzado...", "blue");
            jTextField1_numero_tarjeta.setEnabled(false);
            jTextField2_cvv.setEnabled(false);
            jButton_guardar_metodo_de_pago.setEnabled(false);
            jComboBox_anio.setEnabled(false);
            jComboBox_mes.setEnabled(false);
        } else {
            jTextField1_numero_tarjeta.setEnabled(true);
            jTextField2_cvv.setEnabled(true);
            jButton_guardar_metodo_de_pago.setEnabled(true);
            jComboBox_anio.setEnabled(true);
            jComboBox_mes.setEnabled(true);
            label_status("", "blue");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1_numero_tarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2_cvv = new javax.swing.JTextField();
        jButton_guardar_metodo_de_pago = new javax.swing.JButton();
        jButton2_volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_tarjetas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_eliminar_tarjeta = new javax.swing.JButton();
        jComboBox_mes = new javax.swing.JComboBox<>();
        jComboBox_anio = new javax.swing.JComboBox<>();
        jLabel_status_tarjeta = new javax.swing.JLabel();
        jLabel_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1_numero_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_numero_tarjetaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Número de la tarjeta:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CVV:");

        jTextField2_cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_cvvKeyTyped(evt);
            }
        });

        jButton_guardar_metodo_de_pago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar_metodo_de_pago.setText("Guardar metodo de pago");
        jButton_guardar_metodo_de_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_metodo_de_pagoActionPerformed(evt);
            }
        });

        jButton2_volver.setText("Atras");
        jButton2_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_volverActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de vencimiento:");

        jLabel5.setText("Mes");

        jLabel6.setText("Año");

        jScrollPane1.setViewportView(jList_tarjetas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Metodos de pago actuales");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Metodos de pago");

        jButton_eliminar_tarjeta.setText("Eliminar metodo de pago");
        jButton_eliminar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_tarjetaActionPerformed(evt);
            }
        });

        jComboBox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_guardar_metodo_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jButton_eliminar_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_status)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1_numero_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel_status_tarjeta))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_eliminar_tarjeta)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_numero_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_status_tarjeta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_guardar_metodo_de_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_status)
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void jButton2_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_volverActionPerformed
        MNavCliente mNavCliente = new MNavCliente();
        this.dispose();
    }//GEN-LAST:event_jButton2_volverActionPerformed

    private void jButton_guardar_metodo_de_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_metodo_de_pagoActionPerformed
        if (sin_espacios_vacios() && tamanios_correctos_tarjeta_cvv() && es_tarjeta_visa_o_mastercard() && tarjeta_no_vencida()) {
            guardar_tarjeta_en_base_de_datos();
        }
    }//GEN-LAST:event_jButton_guardar_metodo_de_pagoActionPerformed

    //Metodo que se encarga de guardar los parametros establecidos en los espacios
    //vacios como una nueva tarjeta.
    private void guardar_tarjeta_en_base_de_datos() {
        
        //Variable temporal de tipo tarjeta a la cual se le asignan todos los
        //parametros ingresados por el usuario.
        Tarjeta t = new Tarjeta();
        t.setCVV(AES.encrypt(jTextField2_cvv.getText(), Memoria.DBKeyPassword));
        t.setClienteID(Memoria.usuario_actual.getDB_ID());
        t.setFecha_caducidad(AES.encrypt("" + jComboBox_mes.getSelectedItem().toString() + "-" + jComboBox_anio.getSelectedItem().toString(), Memoria.DBKeyPassword));
        t.setNum_tarjeta(AES.encrypt(jTextField1_numero_tarjeta.getText(), Memoria.DBKeyPassword));
        //El saldo del usuario es por default entre 1000 a 10.000 colones.
        t.setSaldo(Run.random_x_between_y(1000, 10000, 5));
        
        //Se hace la consulta sql para guardar la tarjeta nueva en la base de datos.
        Memoria.sql_lite_query.Query("INSERT INTO TARJETA "
                + "(UserID"
                + ",Num_tarjeta"
                + ",CVV"
                + ",Fecha_caducidad"
                + ",Saldo )\n"
                + "VALUES "
                + "('" + t.getClienteID() + "'"
                + ", '" + t.getNum_tarjeta() + "'"
                + ", '" + t.getCVV() + "'"
                + ", '" + t.getFecha_caducidad() + "'"
                + ", '" + t.getSaldo() + "');", "Metodo de pago agregado");
        
        //Se recargan las tarjetas para mostrar la nueva tarjeta en la lista y
        //se vacian todos los espacios.
        cargar_tarjetas();
        rellenar_lista();
        limpiar_espacios();
        
        //Verifica si el limite de tarjeta ha sido alcanzado. Si es así, se des-
        //habilitan los espacios y botones para guardar otra. El limite por 
        //default es de 3 tarjetas por usuario.
        verificar_limite_de_tarjetas();
        
        //Se muestra un mensaje de exito al usuario.
        Run.message("Tarjeta guardada!", "Guardado", 1);
    }

    //Verifica si han llenado todos los espacios necesarios para guarda la
    //tarjeta.
    private boolean sin_espacios_vacios() {
        if (!jTextField1_numero_tarjeta.getText().equals("") && !jTextField2_cvv.getText().equals("")) {
            return true;
        } else {
            label_status("¡Debe rellenar todos los espacios!", "red");
            return false;
        }
    }

    //Verifica si se ingreso una tarjeta de 16 digitos y un cvv de 3 digitos
    private boolean tamanios_correctos_tarjeta_cvv() {
        if (jTextField1_numero_tarjeta.getText().length() == 16 && jTextField2_cvv.getText().length() == 3) {
            return true;
        } else {
            label_status("La tarjeta o CVV ingresados no son correctos..", "red");
            return false;
        }
    }

    //Verifica si la tarjeta que esta a punto de ser registrada no esta vencida.
    private boolean tarjeta_no_vencida() {
        Fecha fecha_actual = new Fecha();
        fecha_actual.asignar_fecha_del_sistema();
        int anio_dado = Integer.parseInt(jComboBox_anio.getSelectedItem().toString());
        if (anio_dado < fecha_actual.getAnio()) {
            label_status("No puede registrar una tarjeta vencida", "red");
            return false;
        } else if (anio_dado == fecha_actual.getAnio()) {
            int mes_dado = Integer.parseInt(jComboBox_mes.getSelectedItem().toString());
            if (mes_dado <= fecha_actual.getMes()) {
                label_status("No puede registrar una tarjeta vencida", "red");
                return false;
            } else {
                return true;
            }
        } else {
            label_status("", "black");
            return true;
        }
    }

    //Verifica si la tarjeta que esta por ser guardada es VISA o MasterCard.
    private boolean es_tarjeta_visa_o_mastercard() {
        if (jTextField1_numero_tarjeta.getText().charAt(0) == '4'
                || jTextField1_numero_tarjeta.getText().charAt(0) == '5') {
            return true;
        } else {
            label_status("¡La tarjeta no es valida!", "red");
            return false;
        }
    }

    //Metodo encargado de eliminar la tarjeta seleccionada por el usuario.
    private void eliminar_tarjeta() {
        if (jList_tarjetas.getSelectedValue() != null) {
            Memoria.sql_lite_query.Query("DELETE FROM TARJETA "
                    + "WHERE TarjetaID = '" + jList_tarjetas.getSelectedValue().getDB_ID() + "';", "Metodo de pago eliminado");
            cargar_tarjetas();
            rellenar_lista();
            limpiar_espacios();
            verificar_limite_de_tarjetas();
        } else {
            System.out.println("Tarjeta no seleccionada");
        }
    }

    private void jButton_eliminar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_tarjetaActionPerformed
        eliminar_tarjeta();
    }//GEN-LAST:event_jButton_eliminar_tarjetaActionPerformed

    private void jTextField1_numero_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_numero_tarjetaKeyTyped

        //Este codigo se despliega cuando se digita un numero dentro del espacio
        //para digitar el numero de tarjeta
        //Si la tecla pulsada no es un numero o se ha llegado al limite de 16 digitos
        //no se digitara lo pulsado dentro del espacio de numero de tarjeta
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField1_numero_tarjeta.getText().length() == 16) {
            evt.consume();
        }

        //Vefirica si la tarjeta ingresada es VISA, MasterCard o no valida. 
        //Muestra además en pantalla la marca de tarjeta.
        if (!jTextField1_numero_tarjeta.getText().equals("")) {
            switch (jTextField1_numero_tarjeta.getText().charAt(0)) {
                case '4':
                    label_marca_tarjeta("VISA", "blue");
                    break;
                case '5':
                    label_marca_tarjeta("MasterCard", "blue");
                    break;
                default:
                    label_marca_tarjeta("Tarjeta no valida!", "red");
                    break;
            }
        }
    }//GEN-LAST:event_jTextField1_numero_tarjetaKeyTyped

    private void jTextField2_cvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_cvvKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField2_cvv.getText().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_cvvKeyTyped

    //Muestra en pantalla si la tarjeta escrita es VISA, MasterCard o no valida.
    private void label_marca_tarjeta(String message, String color) {
        switch (color) {
            case "red":
                jLabel_status_tarjeta.setForeground(Color.red);
                break;
            case "blue":
                jLabel_status_tarjeta.setForeground(Color.blue);
                break;
            case "green":
                jLabel_status_tarjeta.setForeground(Color.green);
                break;
            case "black":
                jLabel_status_tarjeta.setForeground(Color.black);
                break;
            default:
                jLabel_status.setForeground(Color.black);
                throw new AssertionError();
        }
        jLabel_status_tarjeta.setText(message);
    }

    //Muestra mensajes en pantalla para el usuario. Generalmente mensajes de error.
    private void label_status(String message, String color) {
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
                throw new AssertionError();
        }
        jLabel_status.setText(message);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_volver;
    private javax.swing.JButton jButton_eliminar_tarjeta;
    private javax.swing.JButton jButton_guardar_metodo_de_pago;
    private javax.swing.JComboBox<String> jComboBox_anio;
    private javax.swing.JComboBox<String> jComboBox_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JLabel jLabel_status_tarjeta;
    private javax.swing.JList<Tarjeta> jList_tarjetas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1_numero_tarjeta;
    private javax.swing.JTextField jTextField2_cvv;
    // End of variables declaration//GEN-END:variables
}
