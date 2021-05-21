package Interface;

import Interactividad.Teclas;
import java.applet.AudioClip;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class Login extends javax.swing.JFrame {

    private AudioClip Morgan;
    private int c0n = 0;
    private KeyboardFocusManager Escape = KeyboardFocusManager.getCurrentKeyboardFocusManager();

    
    public Login() {
        initComponents();
        Teclas();
        EstiloForms();
    }
    
    public void Inicio(){

    }
    
    //Para salir del Programa Con Un doble Escape Investigar mas TODO EL CONTENIDO DE ESTE METODO
    public void Teclas() {
        Escape.addKeyEventPostProcessor(new KeyEventPostProcessor() {
            
            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    c0n++;
                    
                    if (c0n == 3) {
                        System.exit(0);
                    }
                    
                }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                            c0n++;
                    if (c0n == 2) {
                        
                        String Login = "ether";
                        String ContraseñaValida = "ether";
                        String Contraseña = "";

                        for (int Letra = 0; Letra < PasswordCaja.getPassword().length; Letra++) {
                            Contraseña += PasswordCaja.getPassword()[Letra];
                        }

                            if (Login.equals(LoginCaja.getText()) && ContraseñaValida.equals(Contraseña)) {
                                PaginaPricipal VentanaPrincipal = new PaginaPricipal();
                                VentanaPrincipal.setVisible(true);
                                Morgan = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Bienvenida.wav"));
                                Morgan.play();

                                dispose();

                            } else {
                                AcesoDenegado Ventana = new AcesoDenegado();
                                Ventana.setVisible(true);
                                c0n = 0;
                            }
                    }
                }
            
                return true;
            }
        });
    }
    
    
    
    private void EstiloForms(){
        //Codigo para poner transparente un JTextField ;)
        LoginCaja.setBackground(new java.awt.Color(0, 0, 0, 1));
        PasswordCaja.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Diseño = new java.awt.Panel();
        Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Contenedor = new javax.swing.JLabel();
        Contactos = new java.awt.Panel();
        Titulo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SALIR = new javax.swing.JLabel();
        ContenedorConttactos = new javax.swing.JLabel();
        Autenticacion = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordCaja = new javax.swing.JPasswordField();
        LoginCaja = new javax.swing.JTextField();
        IconoLogin = new javax.swing.JLabel();
        IconoPassword = new javax.swing.JLabel();
        RecordarContraseña = new javax.swing.JCheckBox();
        enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Diseño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginLogo.png"))); // NOI18N
        Diseño.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 256, 256));

        Titulo.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pragmatic Morphoide");
        Diseño.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 380, 50));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoTransparente.png"))); // NOI18N
        Icono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMouseClicked(evt);
            }
        });
        Diseño.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 24, 24));

        Contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CajaFormulario.png"))); // NOI18N
        Diseño.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        getContentPane().add(Diseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        Contactos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setBackground(new java.awt.Color(102, 102, 102));
        Titulo1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo1.setText("Contactanos");
        Contactos.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/twitter.png"))); // NOI18N
        Contactos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 64, 64));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        Contactos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 64, 64));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instagram-bosquejado.png"))); // NOI18N
        Contactos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 64, 64));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsapp.png"))); // NOI18N
        Contactos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 64, 64));

        SALIR.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText(" X");
        SALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALIRMouseClicked(evt);
            }
        });
        Contactos.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 25));

        ContenedorConttactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mmm.png"))); // NOI18N
        Contactos.add(ContenedorConttactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 210));

        getContentPane().add(Contactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 210));

        Autenticacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Iniciar Sesion");
        Autenticacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cuenta");
        Autenticacion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña");
        Autenticacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));
        Autenticacion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, -1));
        Autenticacion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 330, -1));

        PasswordCaja.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        PasswordCaja.setForeground(new java.awt.Color(255, 255, 255));
        PasswordCaja.setText("xxxxx");
        PasswordCaja.setBorder(null);
        PasswordCaja.setOpaque(false);
        PasswordCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordCajaMouseClicked(evt);
            }
        });
        Autenticacion.add(PasswordCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 300, 30));

        LoginCaja.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        LoginCaja.setForeground(new java.awt.Color(255, 255, 255));
        LoginCaja.setText("Escribe aqui . . .");
        LoginCaja.setBorder(null);
        LoginCaja.setOpaque(false);
        LoginCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginCajaMouseClicked(evt);
            }
        });
        Autenticacion.add(LoginCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 300, 30));

        IconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        Autenticacion.add(IconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 24, 24));

        IconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        Autenticacion.add(IconoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 24, 24));

        RecordarContraseña.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        RecordarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        RecordarContraseña.setText("Recordar Contraseña");
        RecordarContraseña.setOpaque(false);
        Autenticacion.add(RecordarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, -1));

        enviar.setBackground(new java.awt.Color(51, 153, 255));
        enviar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Iniciar");
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
        Autenticacion.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        Autenticacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        getContentPane().add(Autenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 380, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconoMouseClicked

    private void LoginCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginCajaMouseClicked
        LoginCaja.setText("");
    }//GEN-LAST:event_LoginCajaMouseClicked

    private void PasswordCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordCajaMouseClicked
        PasswordCaja.setText("");
    }//GEN-LAST:event_PasswordCajaMouseClicked

    private void SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALIRMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SALIRMouseClicked

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        String Login = "ether";
        String ContraseñaValida = "ether";
        String Contraseña = "";

        for (int Letra = 0; Letra < PasswordCaja.getPassword().length; Letra++) {
            Contraseña += PasswordCaja.getPassword()[Letra];
        }

        if (Login.equals(LoginCaja.getText()) && ContraseñaValida.equals(Contraseña)) {
        
            PaginaPricipal VentanaPrincipal = new PaginaPricipal();
            VentanaPrincipal.setVisible(true);
            dispose();

            Morgan = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Bienvenida.wav"));
            Morgan.play();
        } else { 
            AcesoDenegado Ventana = new AcesoDenegado();
            Ventana.setVisible(true);
        }

    }//GEN-LAST:event_enviarActionPerformed

    private void enviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviarKeyPressed
        
    }//GEN-LAST:event_enviarKeyPressed

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        
        
    }//GEN-LAST:event_enviarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Autenticacion;
    private java.awt.Panel Contactos;
    private javax.swing.JLabel Contenedor;
    private javax.swing.JLabel ContenedorConttactos;
    private java.awt.Panel Diseño;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel IconoLogin;
    private javax.swing.JLabel IconoPassword;
    private javax.swing.JTextField LoginCaja;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField PasswordCaja;
    private javax.swing.JCheckBox RecordarContraseña;
    private javax.swing.JLabel SALIR;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
