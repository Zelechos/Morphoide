package Interactividad;

import Interface.AcesoDenegado;
import Interface.Login;
import Interface.PaginaPricipal;
import java.applet.AudioClip;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Teclas {
    
    private int c0n = 0;
    private AudioClip Morgan;

    private static Teclas TeclaActual;

    public Teclas(){
        
    }
    
    public static Teclas getTeclaActual(){
        if(TeclaActual == null){
            TeclaActual = new Teclas();
        }
        
        return TeclaActual;
    }
    
    
    //Para salir del Programa Con Un doble Escape Investigar mas TODO EL CONTENIDO DE ESTE METODO
    public void Salir() {
        KeyboardFocusManager Escape = KeyboardFocusManager.getCurrentKeyboardFocusManager();

        Escape.addKeyEventPostProcessor(new KeyEventPostProcessor() {
            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    c0n++;
                    if (c0n == 3) {
                        
                        System.exit(0);
                    }
                }
                return true;
            }
        });
    }
    
    
     public void Salir1() {
        KeyboardFocusManager Escape = KeyboardFocusManager.getCurrentKeyboardFocusManager();

        Escape.addKeyEventPostProcessor(new KeyEventPostProcessor() {
            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    c0n++;
                    if (c0n == 2) {
                        AcesoDenegado ventana = new AcesoDenegado();
                        ventana.setVisible(false);
                    }
                }
                return true;
            }
        });
    }
}
