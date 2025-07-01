
package IFG;

import gestor_tareas.BD_CONEXION;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio_Sesion extends javax.swing.JFrame {
    
    
    BD_CONEXION con = new BD_CONEXION();
    Connection cn = con.conectar();
    
    public Inicio_Sesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Contraseña_In = new javax.swing.JLabel();
        Campo_InicioSesion = new javax.swing.JTextField();
        Txt_Usuario_In = new javax.swing.JLabel();
        Campo_Contraseña_In = new javax.swing.JPasswordField();
        BTN_Salir_In = new javax.swing.JButton();
        BTN_Confirmar_In = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1264, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setText("BIENVENIDO AL INICIO DE SESION");

        Txt_Contraseña_In.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Txt_Contraseña_In.setText("CONTRASEÑA");

        Txt_Usuario_In.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Txt_Usuario_In.setText("USUARIO");

        BTN_Salir_In.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Salir_In.setText("SALIR");
        BTN_Salir_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_InActionPerformed(evt);
            }
        });

        BTN_Confirmar_In.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        BTN_Confirmar_In.setText("CONFIRMAR");
        BTN_Confirmar_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Confirmar_InActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Txt_Contraseña_In)
                        .addGap(549, 549, 549))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Campo_Contraseña_In, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(522, 522, 522))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Confirmar_In)
                        .addGap(560, 560, 560))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Salir_In)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(533, Short.MAX_VALUE)
                    .addComponent(Campo_InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(526, 526, 526)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(588, Short.MAX_VALUE)
                    .addComponent(Txt_Usuario_In)
                    .addGap(573, 573, 573)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(230, 230, 230)
                .addComponent(Txt_Contraseña_In)
                .addGap(18, 18, 18)
                .addComponent(Campo_Contraseña_In, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(BTN_Confirmar_In)
                .addGap(233, 233, 233)
                .addComponent(BTN_Salir_In)
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(Campo_InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(581, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(Txt_Usuario_In)
                    .addContainerGap(634, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Salir_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_InActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_Salir_InActionPerformed

    private void BTN_Confirmar_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Confirmar_InActionPerformed
        try {
            String usuario = Campo_InicioSesion.getText();
            String pass = Campo_Contraseña_In.getText();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM registro WHERE USUARIO = '"+usuario+"' AND CONTRASEÑA = '"+pass+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Menu1 mn1 = new Menu1();
                mn1.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "USUARIO NO REGISTRADO");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Inicio_Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_Confirmar_InActionPerformed


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
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Confirmar_In;
    private javax.swing.JButton BTN_Salir_In;
    private javax.swing.JPasswordField Campo_Contraseña_In;
    private javax.swing.JTextField Campo_InicioSesion;
    private javax.swing.JLabel Txt_Contraseña_In;
    private javax.swing.JLabel Txt_Usuario_In;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
