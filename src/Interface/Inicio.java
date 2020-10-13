package Interface;

import java.applet.AudioClip;


public class Inicio extends javax.swing.JFrame {

    private AudioClip Morgan;
            

    public Inicio() {
        initComponents();
        Music();
    }
    
    public void Music(){
        Morgan = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/in.wav"));
        Morgan.play();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new java.awt.Panel();
        Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoAzulado.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Inicio.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 24, 24));

        Titulo.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pragmatic Morphoide");
        Inicio.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 70, 310, 40));

        Marca.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Marca.setText("By Etherias Projects");
        Marca.setToolTipText("");
        Inicio.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, 20));

        Contenedor.setBackground(new java.awt.Color(102, 102, 102));
        Contenedor.setForeground(new java.awt.Color(255, 255, 255));
        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Royal.png"))); // NOI18N
        Inicio.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contenedor;
    private java.awt.Panel Inicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
