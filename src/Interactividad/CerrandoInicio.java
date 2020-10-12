package Interactividad;

import Interface.Inicio;
import Interface.Login;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CerrandoInicio {

    private Inicio VentanaPrimaria;
    private Login VentanaSecundaria;

    public static void main(String[] args) {

        CerrandoInicio Cerrado = new CerrandoInicio();
        Cerrado.Cerrando();

    }

    public void Cerrando() {

        VentanaPrimaria = new Inicio();
        VentanaSecundaria = new Login();

        try {

            VentanaPrimaria.setVisible(true);
            Thread.sleep(3000);
            VentanaPrimaria.setVisible(false);
            VentanaSecundaria.setVisible(true);

        } catch (InterruptedException ex) {
            Logger.getLogger(CerrandoInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
