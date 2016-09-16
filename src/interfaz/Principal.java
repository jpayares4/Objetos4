/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Password;
import javax.swing.JOptionPane;
/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {
String clave;
    String tamaño;
    Password pass1, pass2;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdVerificar.setEnabled(false);
        cmdCambiarContraseña.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPassContraseña = new javax.swing.JPasswordField();
        lblNivelDeSeguridad1 = new javax.swing.JLabel();
        lblNumeroDeCaracteres = new javax.swing.JLabel();
        cmdVerificar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCambiarContraseña = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel1.setText("Verificacion de password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 190, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su contraseña:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassContraseñaKeyReleased(evt);
            }
        });
        jPanel3.add(txtPassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, -1));

        lblNivelDeSeguridad1.setFont(new java.awt.Font("Corbel", 1, 11)); // NOI18N
        jPanel3.add(lblNivelDeSeguridad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 20));

        lblNumeroDeCaracteres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(lblNumeroDeCaracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 20));

        cmdVerificar.setBackground(new java.awt.Color(255, 255, 255));
        cmdVerificar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        cmdVerificar.setText("Verificar");
        cmdVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVerificarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 90, -1));

        cmdGuardar.setBackground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 160));

        cmdCambiarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        cmdCambiarContraseña.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        cmdCambiarContraseña.setText("Cambiar");
        cmdCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        cmdSalir.setBackground(new java.awt.Color(255, 255, 255));
        cmdSalir.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 271));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassContraseñaKeyReleased
        String contraseña, longitud;
        
        int aux;

        contraseña = txtPassContraseña.getText();
        aux = txtPassContraseña.getText().length();
        longitud = String.valueOf(aux);

        pass1 = new Password(longitud, contraseña);
        pass2 = pass1.NivelDeSeguridad();

        lblNivelDeSeguridad1.setText("" + pass1.getLongitud());
        lblNumeroDeCaracteres.setText("Número de Caracteres: " + aux);
    }//GEN-LAST:event_txtPassContraseñaKeyReleased

    private void cmdCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarContraseñaActionPerformed
        pass1.setContraseña(clave);
        lblNumeroDeCaracteres.setText("Ingrese Nueva Clave");
        cmdGuardar.setEnabled(true);
        cmdCambiarContraseña.setEnabled(false);
        cmdVerificar.setEnabled(false);
        txtPassContraseña.setEnabled(true);
        txtPassContraseña.requestFocusInWindow();
       
    }//GEN-LAST:event_cmdCambiarContraseñaActionPerformed

    private void cmdVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVerificarActionPerformed
       
        String aux;

        aux = "Contraseña:" + "\n" + clave + "\n\n"
        + "Numero de caracteres:" + "\n" + tamaño + "\n\n"
        + "Nivel de seguridad: " + "\n" + pass1.getLongitud();
        JOptionPane.showMessageDialog(this, aux);
        
        cmdCambiarContraseña.setEnabled(true);
        cmdGuardar.setEnabled(false);
    }//GEN-LAST:event_cmdVerificarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        int aux;

        if (txtPassContraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el campo CONTRASEÑA", "Error", JOptionPane.INFORMATION_MESSAGE);
            txtPassContraseña.requestFocusInWindow();
        } else if (txtPassContraseña.getText().length() > 8) {
            JOptionPane.showMessageDialog(this, "Por favor, Su Contraseña NO puede tener mas de 8 caracteres");
            txtPassContraseña.requestFocusInWindow();
            txtPassContraseña.selectAll();
        } else {
            cmdVerificar.setEnabled(true);
            cmdCambiarContraseña.setEnabled(true);
            

            clave = txtPassContraseña.getText();
            aux = txtPassContraseña.getText().length();
            tamaño = String.valueOf(aux);

            Password pass = new Password(tamaño, clave);
            JOptionPane.showMessageDialog(this, "Contraseña Guardada Exitosamente", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);

            txtPassContraseña.setText("");          
            lblNivelDeSeguridad1.setText("");
            lblNumeroDeCaracteres.setText("");
            txtPassContraseña.setEnabled(false);
            cmdGuardar.setEnabled(false);
            cmdCambiarContraseña.setEnabled(false);

        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCambiarContraseña;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JButton cmdVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNivelDeSeguridad1;
    private javax.swing.JLabel lblNumeroDeCaracteres;
    private javax.swing.JPasswordField txtPassContraseña;
    // End of variables declaration//GEN-END:variables
}
