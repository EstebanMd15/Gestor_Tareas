
package Asignar_Tarea;

import IFG.Menu1;
import gestor_tareas.BD_CONEXION;//
import java.sql.*;//
import java.sql.Connection;//
import javax.swing.JOptionPane;//
import javax.swing.table.DefaultTableModel;
import java.sql.Date;


public class GUI_Asignar_Tarea extends javax.swing.JFrame {
    
    BD_CONEXION enlace1 = new BD_CONEXION();
     Connection con1 = enlace1.conectar();
     
    

    public GUI_Asignar_Tarea() {
        initComponents();
    }
   
         public void mostrar(String tabla){
        String sql =  "SELECT * FROM " + tabla;
         
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("TAREA");
        model.addColumn("FECHA_ASIGNACION");
        model.addColumn("FECHA_LIMITE");
        model.addColumn("OBSERVACIONES");
        model.addColumn("RESPONSABLE");
        model.addColumn("PRIORIDAD");
        model.addColumn("ASIGNADO_POR");
        model.addColumn("ESTADO");
        Tabla_1.setModel(model);
        
        String [] datos = new String [9];
        try {
            Statement st;
            st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
        }
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTN_Salir_Ast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Campo_Id = new javax.swing.JTextField();
        Campo_Observ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_Fecha_Limit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Combo_AsignadoPor = new javax.swing.JComboBox<>();
        BTN_Asignar_Tarea = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Campo_Tarea = new javax.swing.JTextField();
        BTN_Mostrar_Tabla = new javax.swing.JButton();
        BTN_Modificar_Tarea = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Combo_Prioridad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Combo_Responsable = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        BTN_BUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Combo_Estado = new javax.swing.JComboBox<>();
        BTN_OK_Estado = new javax.swing.JButton();
        BTN_Eliminar_Tarea1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BTN_Salir_Ast.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BTN_Salir_Ast.setText("SALIR");
        BTN_Salir_Ast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_AstActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setText("FECHA LIMITE: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setText("ID:");

        Campo_Id.setBackground(new java.awt.Color(204, 204, 204));

        Campo_Observ.setBackground(new java.awt.Color(204, 204, 204));
        Campo_Observ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_ObservActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setText("OBSERVACIONES:");

        Campo_Fecha_Limit.setBackground(new java.awt.Color(204, 204, 204));
        Campo_Fecha_Limit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Fecha_LimitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setText("RESPONSABLE: ");

        Combo_AsignadoPor.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Combo_AsignadoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cesar Coral", "Diego Gaviria", "Esteban Meneses" }));

        BTN_Asignar_Tarea.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Asignar_Tarea.setText("ASIGNAR");
        BTN_Asignar_Tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Asignar_TareaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setText("TAREA: ");

        Campo_Tarea.setBackground(new java.awt.Color(204, 204, 204));

        BTN_Mostrar_Tabla.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Mostrar_Tabla.setText("VER/ACT");
        BTN_Mostrar_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Mostrar_TablaActionPerformed(evt);
            }
        });

        BTN_Modificar_Tarea.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Modificar_Tarea.setText("MODIFICAR");
        BTN_Modificar_Tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Modificar_TareaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel7.setText("TAREAS ASIGNADAS");

        Combo_Prioridad.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Combo_Prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTA", "BAJA", "MEDIA" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel8.setText("PRIORIDAD:");

        Combo_Responsable.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Combo_Responsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cesar Coral", "Diego Gaviria", "Esteban Meneses" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel9.setText("ASIGNADO POR:");

        BTN_BUSCAR.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_BUSCAR.setText("BUSCAR");
        BTN_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCARActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

        Tabla_1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_1);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel10.setText("ESTADO:");

        Combo_Estado.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Combo_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPLETADO", "EN PROCESO", "PENDIENTE" }));

        BTN_OK_Estado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BTN_OK_Estado.setText("OK");
        BTN_OK_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OK_EstadoActionPerformed(evt);
            }
        });

        BTN_Eliminar_Tarea1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Eliminar_Tarea1.setText("ELIMINAR");
        BTN_Eliminar_Tarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Eliminar_Tarea1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO MENNAR.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_Observ, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTN_Asignar_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(BTN_Mostrar_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Campo_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BTN_Modificar_Tarea))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTN_BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTN_Eliminar_Tarea1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(776, 776, 776)
                                .addComponent(BTN_Salir_Ast)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Campo_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Campo_Fecha_Limit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5))
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Combo_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Combo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_OK_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Combo_AsignadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Combo_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Combo_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(Combo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_OK_Estado))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Combo_AsignadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addComponent(Campo_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Campo_Fecha_Limit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(Combo_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Campo_Observ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Mostrar_Tabla)
                            .addComponent(BTN_Asignar_Tarea))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Campo_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Modificar_Tarea)
                            .addComponent(BTN_Eliminar_Tarea1))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Salir_Ast)
                .addGap(14, 14, 14))
        );

        jMenu1.setText("MENU PRINCIPAL");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void Campo_ObservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_ObservActionPerformed
      
    }//GEN-LAST:event_Campo_ObservActionPerformed

    private void BTN_Salir_AstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_AstActionPerformed
        Menu1 mn1 = new Menu1();
        mn1.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BTN_Salir_AstActionPerformed

    private void BTN_Asignar_TareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Asignar_TareaActionPerformed
          try {
            PreparedStatement asignar = con1.prepareStatement("INSERT INTO ASIGNACION (TAREA,FECHA_ASIGNACION,FECHA_LIMITE,OBSERVACIONES,RESPONSABLE,PRIORIDAD,ASIGNADO_POR,ESTADO) VALUES (?,?,?,?,?,?,?,?)");
            asignar.setString(1, Campo_Tarea.getText());
            java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
            asignar.setString(2, fechaActual.toString());
//                if(Campo_Fecha_Asig.getText().trim().isEmpty()){
//                    asignar.setNull(2, java.sql.Types.DATE);
////                }
//                java.sql.Date fechaAct = new java.sql.Date(System.currentTimeMillis());
//                asignar.setDate(2, fechaAct);               
//              Campo_Fecha_Asig.setText(fechaAct.toString());
            asignar.setString(3, Campo_Fecha_Limit.getText());
                if(Campo_Fecha_Limit.getText().trim().isEmpty()){
                    asignar.setNull(3, java.sql.Types.DATE);
                    
                }
            asignar.setString(4, Campo_Observ.getText());
            asignar.setString(5, Combo_Responsable.getSelectedItem().toString());
            asignar.setString(6, Combo_Prioridad.getSelectedItem().toString());
            asignar.setString(7, Combo_AsignadoPor.getSelectedItem().toString());
            asignar.setString(8, Combo_Estado.getSelectedItem().toString());
            Campo_Tarea.setText("");
//            Campo_Fecha_Asig.setText("");
            Campo_Fecha_Limit.setText("");
            Campo_Observ.setText("");
            asignar.executeUpdate();

            JOptionPane.showMessageDialog(null, "TAREA REGISTRADA CON EXITO!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e + "NO SE REGISTRÓ LA TAREA");
        }
    }//GEN-LAST:event_BTN_Asignar_TareaActionPerformed

    private void BTN_Mostrar_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Mostrar_TablaActionPerformed
        mostrar("ASIGNACION");
    }//GEN-LAST:event_BTN_Mostrar_TablaActionPerformed

    private void BTN_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCARActionPerformed
        try {
            PreparedStatement buscar = con1.prepareStatement("SELECT * FROM ASIGNACION WHERE ID=?");
            buscar.setString(1, Campo_Id.getText());
            ResultSet rs = buscar.executeQuery();
            
            if(rs.next()){
                Campo_Tarea.setText(rs.getString("TAREA"));
//            Campo_Fecha_Asig.setText(rs.getString("FECHA_ASIGNACION"));
            Campo_Fecha_Limit.setText(rs.getString("FECHA_LIMITE"));
            Campo_Observ.setText(rs.getString("OBSERVACIONES"));
            
            Combo_AsignadoPor.setSelectedItem(rs.getString("ASIGNADO_POR"));
            Combo_Prioridad.setSelectedItem(rs.getString("PRIORIDAD"));
            Combo_Responsable.setSelectedItem(rs.getString("RESPONSABLE"));
            }
            else{
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN REGISTRO CON ESE ID");
            }
            
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR" + e.toString());
        }
      
         
    }//GEN-LAST:event_BTN_BUSCARActionPerformed

    private void BTN_Modificar_TareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Modificar_TareaActionPerformed
        try {
            PreparedStatement actualizar = con1.prepareStatement("UPDATE ASIGNACION SET TAREA=?,FECHA_LIMITE=?, OBSERVACIONES=?, RESPONSABLE=?,PRIORIDAD=?,ASIGNADO_POR=?,ESTADO=? WHERE ID=?");
            actualizar.setString(1, Campo_Tarea.getText());
            
//                if(Campo_Fecha_Asig.getText().trim().isEmpty()){
//                    actualizar.setNull(2, java.sql.Types.DATE);
//                }else{
//                    actualizar.setString(2, Campo_Fecha_Asig.getText());
//                }
                if(Campo_Fecha_Limit.getText().trim().isEmpty()){
                    actualizar.setNull(2, java.sql.Types.DATE);
                }else{
                    actualizar.setString(2, Campo_Fecha_Limit.getText());
                }
            actualizar.setString(3, Campo_Observ.getText());
            actualizar.setString(4, Combo_Responsable.getSelectedItem().toString());
            actualizar.setString(5, Combo_Prioridad.getSelectedItem().toString());
            actualizar.setString(6, Combo_AsignadoPor.getSelectedItem().toString());
            actualizar.setString(7, Combo_Estado.getSelectedItem().toString());
            actualizar.setString(8, Campo_Id.getText());
            int actualizar1 = JOptionPane.showConfirmDialog(null, "¿DESEA ACTUALIZAR LA TAREA?");
            if(actualizar1 == 0){
                int filasAfectadas = actualizar.executeUpdate();
            if(filasAfectadas != 0){
                actualizar.executeUpdate();
                Campo_Tarea.setText("");
//                Campo_Fecha_Asig.setText("");
                Campo_Fecha_Limit.setText("");
                Campo_Observ.setText("");
                Campo_Id.setText("");
                }
            JOptionPane.showMessageDialog(null, "TAREA ACTUALIZADA CON EXITO!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "NO SE ACTUALIZÓ LA TAREA");
        }
    }//GEN-LAST:event_BTN_Modificar_TareaActionPerformed

    private void Tabla_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_1MouseClicked

    private void BTN_OK_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OK_EstadoActionPerformed
        try {
            PreparedStatement ok = con1.prepareStatement("UPDATE ASIGNACION SET ESTADO=? WHERE ID = ?");
            ok.setString(1, Combo_Estado.getSelectedItem().toString());
            ok.setString(2, Campo_Id.getText());
            int actEstado = JOptionPane.showConfirmDialog(null,"¿DESEA ACTUALIZAR EL ESTADO?");
            if(actEstado == 0){
                int estado = ok.executeUpdate();
            if(estado > 0){
                ok.executeUpdate();
                Campo_Id.setText("");
            }
            JOptionPane.showMessageDialog(null, "ESTADO ACTUALIZADO CON EXITO!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "NO SE ACTUALIZÓ LA TAREA" );
        }
    }//GEN-LAST:event_BTN_OK_EstadoActionPerformed

    private void BTN_Eliminar_Tarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Eliminar_Tarea1ActionPerformed
        try {
            PreparedStatement eliminar = con1.prepareStatement("DELETE FROM ASIGNACION WHERE ID=?");
            eliminar.setString(1, Campo_Id.getText());
            int elm = JOptionPane.showConfirmDialog(null, "¿DESEA ELIMINAR ESTA TAREA?");
            if(elm == 0){
                int elm2 = eliminar.executeUpdate();
            if(elm2 > 0){
                Campo_Id.setText("");
                JOptionPane.showMessageDialog(null, "TAREA ELIMINADA EXITOSAMENTE!!");

            }else{
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA TAREA CON ESE ID");
            }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
    }//GEN-LAST:event_BTN_Eliminar_Tarea1ActionPerformed

    private void Campo_Fecha_LimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Fecha_LimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Fecha_LimitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Asignar_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Asignar_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Asignar_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Asignar_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Asignar_Tarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Asignar_Tarea;
    private javax.swing.JButton BTN_BUSCAR;
    private javax.swing.JButton BTN_Eliminar_Tarea1;
    private javax.swing.JButton BTN_Modificar_Tarea;
    private javax.swing.JButton BTN_Mostrar_Tabla;
    private javax.swing.JButton BTN_OK_Estado;
    private javax.swing.JButton BTN_Salir_Ast;
    private javax.swing.JTextField Campo_Fecha_Limit;
    private javax.swing.JTextField Campo_Id;
    private javax.swing.JTextField Campo_Observ;
    private javax.swing.JTextField Campo_Tarea;
    private javax.swing.JComboBox<String> Combo_AsignadoPor;
    private javax.swing.JComboBox<String> Combo_Estado;
    private javax.swing.JComboBox<String> Combo_Prioridad;
    private javax.swing.JComboBox<String> Combo_Responsable;
    public javax.swing.JTable Tabla_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
