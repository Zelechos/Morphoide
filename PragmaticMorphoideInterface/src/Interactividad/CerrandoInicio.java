package Interactividad;

import Interface.Inicio;
import Interface.Login;
import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CerrandoInicio {

    private Inicio VentanaPrimaria;
    private Login VentanaSecundaria;
    private AudioClip Morgan;
    public static void main(String[] args) {

        CerrandoInicio Cerrado = new CerrandoInicio();
        Cerrado.Cerrando();

    }

    public void Cerrando() {

        VentanaPrimaria = new Inicio();
        VentanaSecundaria = new Login();

        try {

            VentanaPrimaria.setVisible(true);
            Thread.sleep(3500);
            VentanaPrimaria.setVisible(false);
            VentanaSecundaria.setVisible(true);
            Morgan = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Welcome.wav"));
            Morgan.play();

        } catch (InterruptedException ex) {
            Logger.getLogger(CerrandoInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
