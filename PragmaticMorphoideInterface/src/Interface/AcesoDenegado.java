
package Interface;

import Interactividad.Teclas;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zelec
 */
public class AcesoDenegado extends javax.swing.JFrame {

    private int c0n=0;
    private String Mensaje = "<html><body>"
            + "<p style='text-align:'center';'>"
            + "Acceso Denengado<br>"
            + "Introduzca sus Datos de Nuevo<br>"
            + "</p>"
            + "</html></body>";
    
    public AcesoDenegado() {

        initComponents();
    }

    public void CerrandoMensaje() {
        
        try {
            Thread.sleep(500);
            this.setVisible(false);
        } catch (InterruptedException ex) {
            Logger.getLogger(AcesoDenegado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new java.awt.Panel();
        Logo = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        MEnsaje = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        Contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoAzulado.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Inicio.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 24, 24));

        Marca.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Marca.setText("By Etherias Projects");
        Marca.setToolTipText("");
        Inicio.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, 20));

        MEnsaje.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        MEnsaje.setForeground(new java.awt.Color(255, 255, 255));
        MEnsaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEnsaje.setText("Los Datos son Incorrectos");
        Inicio.add(MEnsaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 30));

        m.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m.setText(Mensaje);
        Inicio.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 70));

        enviar.setBackground(new java.awt.Color(51, 153, 255));
        enviar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Volver");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        enviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enviarKeyPressed(evt);
            }
        });
        Inicio.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 30));

        Contenedor.setBackground(new java.awt.Color(102, 102, 102));
        Contenedor.setForeground(new java.awt.Color(255, 255, 255));
        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Royal.png"))); // NOI18N
        Inicio.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        dispose();
    }//GEN-LAST:event_enviarActionPerformed

    private void enviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviarKeyPressed

    }//GEN-LAST:event_enviarKeyPressed

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        dispose();
    }//GEN-LAST:event_enviarMouseClicked

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
            java.util.logging.Logger.getLogger(AcesoDenegado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcesoDenegado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcesoDenegado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcesoDenegado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcesoDenegado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contenedor;
    private java.awt.Panel Inicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MEnsaje;
    private javax.swing.JLabel Marca;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel m;
    // End of variables declaration//GEN-END:variables
}
