
package IFG;
import java.sql.Connection;
import gestor_tareas.BD_CONEXION;
import java.sql.*;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {

    BD_CONEXION enlace = new BD_CONEXION();
    Connection con = enlace.conectar();
    
    
    public Registro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_contraseña = new javax.swing.JLabel();
        Txt_Registro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_Usuario = new javax.swing.JTextField();
        BTN_OCNFIRMAR = new javax.swing.JButton();
        BTN_Guardar = new javax.swing.JButton();
        Campo_contraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Combo_Tipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setText("REGISTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Txt_contraseña.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Txt_contraseña.setText("CONTRASEÑA");

        Txt_Registro.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Txt_Registro.setText("REGISTRO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel3.setText("USUARIO");

        Campo_Usuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Campo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_UsuarioActionPerformed(evt);
            }
        });

        BTN_OCNFIRMAR.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BTN_OCNFIRMAR.setText("CONFIRMAR");
        BTN_OCNFIRMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OCNFIRMARActionPerformed(evt);
            }
        });

        BTN_Guardar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BTN_Guardar.setText("GUARDAR");
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("CARGO:");

        Combo_Tipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Combo_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANALISTA", "AUXILIAR", "COORDINADOR" }));
        Combo_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_TipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(521, 521, 521)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(494, 494, 494)
                            .addComponent(Txt_contraseña)))
                    .addComponent(Campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(579, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_OCNFIRMAR))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(532, 532, 532))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(515, 515, 515)
                    .addComponent(Txt_Registro)
                    .addContainerGap(606, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(483, 483, 483)
                    .addComponent(Campo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(142, 142, 142)
                .addComponent(Txt_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Combo_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Guardar)
                    .addComponent(BTN_OCNFIRMAR))
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(Txt_Registro)
                    .addContainerGap(717, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(199, 199, 199)
                    .addComponent(Campo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(559, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_UsuarioActionPerformed

    private void BTN_OCNFIRMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OCNFIRMARActionPerformed
        Inicio in2 = new Inicio();
        in2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_OCNFIRMARActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
            try {
            PreparedStatement guardar = con.prepareStatement("INSERT INTO REGISTRO (USUARIO,CONTRASEÑA,CARGO) VALUES (?,?,?)");
            guardar.setString(1, Campo_Usuario.getText());
            guardar.setString(2, Campo_contraseña.getText());
            guardar.setString(3, Combo_Tipo.getSelectedItem().toString());
            guardar.executeUpdate();
                JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "NO SE REGISTRO EL USUARIO");
        }
    }//GEN-LAST:event_BTN_GuardarActionPerformed

    private void Combo_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_TipoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_OCNFIRMAR;
    private javax.swing.JTextField Campo_Usuario;
    private javax.swing.JPasswordField Campo_contraseña;
    private javax.swing.JComboBox<String> Combo_Tipo;
    private javax.swing.JLabel Txt_Registro;
    private javax.swing.JLabel Txt_contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
