package Interface;

import java.util.ArrayList;

public class Texto {

    private ArrayList<String> Para_Tema1;
    private ArrayList<String> Para_Tema2;
    private ArrayList<String> Para_Tema3;
    private ArrayList<String> Para_Tema4;
    private ArrayList<String> Para_Tema5;
    private ArrayList<String> Para_Tema6;
    private ArrayList<String> Para_Tema7;
    private ArrayList<String> Para_Tema8;
    private ArrayList<String> Para_Tema9;
    private ArrayList<String> Para_Tema10;
    private ArrayList<String> Para_Tema11;
    private ArrayList<String> Para_Tema12;

    private ArrayList<String> Contenido_Protocolos_Tema1;
    

    public ArrayList getETIQUETA1() {
        String T1_Protocolos = "1 . Introduccion";
        String T1_Html = "1 . Introduccion a HTML";

        Para_Tema1 = new ArrayList<>();
        Para_Tema1.add(T1_Protocolos);
        Para_Tema1.add(T1_Html);

        return Para_Tema1;
    }

    public ArrayList getETIQUETA2() {
        String T2_Protocolos = "2 . Modelo TCP/IP";
        String T2_Html = "2 . Meta Tags basicos";

        Para_Tema2 = new ArrayList<>();
        Para_Tema2.add(T2_Protocolos);
        Para_Tema2.add(T2_Html);

        return Para_Tema2;
    }

    public ArrayList getETIQUETA3() {
        String T3_Protocolos = "3 . Capa de Aplicacion";
        String T3_Html = "3 . Etiquetas de Texto";

        Para_Tema3 = new ArrayList<>();
        Para_Tema3.add(T3_Protocolos);
        Para_Tema3.add(T3_Html);

        return Para_Tema3;
    }

    public ArrayList getETIQUETA4() {
        String T4_Protocolos = "4 . Capa de Transporte";
        String T4_Html = "4 . Caracteres Especiales";

        Para_Tema4 = new ArrayList<>();
        Para_Tema4.add(T4_Protocolos);
        Para_Tema4.add(T4_Html);

        return Para_Tema4;
    }

    public ArrayList getETIQUETA5() {
        String T5_Protocolos = "5 . Capa de Internet";
        String T5_Html = "5 . Tablas";

        Para_Tema5 = new ArrayList<>();
        Para_Tema5.add(T5_Protocolos);
        Para_Tema5.add(T5_Html);

        return Para_Tema5;
    }

    public ArrayList getETIQUETA6() {
        String T6_Protocolos = "6 . Capa de Interfaz de Red";
        String T6_Html = "6 . Listas";

        Para_Tema6 = new ArrayList<>();
        Para_Tema6.add(T6_Protocolos);
        Para_Tema6.add(T6_Html);

        return Para_Tema6;
    }

    public ArrayList getETIQUETA7() {
        String T7_Protocolos = "7 . Redes Informaticas";
        String T7_Html = "7 . Imagenes";

        Para_Tema7 = new ArrayList<>();
        Para_Tema7.add(T7_Protocolos);
        Para_Tema7.add(T7_Html);

        return Para_Tema7;
    }

    public ArrayList getETIQUETA8() {
        String T8_Protocolos = "8 . Tipos de Redes";
        String T8_Html = "8 . Enlaces";

        Para_Tema8 = new ArrayList<>();
        Para_Tema8.add(T8_Protocolos);
        Para_Tema8.add(T8_Html);

        return Para_Tema8;
    }

    public ArrayList getETIQUETA9() {
        String T9_Protocolos = "9 . Elementos de una Red";
        String T9_Html = "9 . Formularios";

        Para_Tema9 = new ArrayList<>();
        Para_Tema9.add(T9_Protocolos);
        Para_Tema9.add(T9_Html);

        return Para_Tema9;
    }

    public ArrayList getETIQUETA10() {
        String T10_Protocolos = "10 . Topologia de la Red";
        String T10_Html = "10 . Frames";

        Para_Tema10 = new ArrayList<>();
        Para_Tema10.add(T10_Protocolos);
        Para_Tema10.add(T10_Html);

        return Para_Tema10;
    }

    public ArrayList getETIQUETA11() {
        String T11_Protocolos = "11 . Modelo OSI";
        String T11_Html = "11 . JavaScript y HTML";

        Para_Tema11 = new ArrayList<>();
        Para_Tema11.add(T11_Protocolos);
        Para_Tema11.add(T11_Html);

        return Para_Tema11;
    }

    public ArrayList getETIQUETA12() {
        String T12_Protocolos = "12 . Firewall";
        String T12_Html = "12 . Manual";
        Para_Tema12 = new ArrayList<>();
        Para_Tema12.add(T12_Protocolos);
        Para_Tema12.add(T12_Html);

        return Para_Tema12;
    }
    
   public ArrayList getContenidoProtocolosTema1(){
        
        String Pagina0 = "<html>"
                + "<body>"
                + "<h1><FONT SIZE=9><b>Introduccion a Protocolos de Internet</b></font></h1>"
                + "<h2><FONT SIZE=6><b>¿ Que es un Protocolo?</b></font></h2>"
                + "<p>"
                + "En informática, un protocolo es un conjunto de reglas usadas por computadoras<br>"
                + "unas con otras a través de una red.<br>"
                + "Es una regla o estandar que controla o permite la conexion, comunicacion <br>"
                + "y transferencia de datos entre dos puntos finales.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6><b>¿Que es el Protocolo de Internet?</b></font></h2>"
                + "<p>"
                + "El Protocolo de Internet (en ingles Internet Protocol o IP) es un protocolo <br>"
                + "de comunicacion de datos digitales clasificado funcionalmente en la capa de Red<br>"
                + "segun el modelo internacional OSI.<br>"
                + "Su funcion principal es el uso bidireccional en origen o destino de comunicacion<br>"
                + "para transmitir datos mediante un <strong>protocolo no orientado a conexion</strong> que <br>"
                + "transfiere <strong>paquetes conmutados</strong> a traves de distintas redes físicas previamente<br>"
                + "enlazadas según la norma OSI de enlace de datos.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6>Descripcion Funcional</font></h2>"
                + "<p>"
                + "El protocolo <strong>IP</strong> se realizó presuponiendo que la entrega de los paquetes de datos<br>"
                + "sería no confiable. Por ello, <strong>IP</strong> tratará de realizarla del mejor modo posible mediante<br>"
                + "técnicas de enrutamiento, sin garantías de alcanzar el destino final pero tratando <br>"
                + "de buscar la mejor ruta entre las conocidas por la máquina que esté usando <strong>IP</strong>.<br><br>"
                + "</p>"
                 +"<p>"
                + "Los datos en una red basada en <strong>IP</strong> son enviados en bloques conocidos como <br>"
                + "paquetes o datagramas (en el protocolo IP ambos terminos se suelen usar).<br>"
                + "En particular, en IP no se necesita ningún intercambio de información de control<br>"
                + "previa a la carga útil (datos), como si ocurre en TCP.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";
        
        Contenido_Protocolos_Tema1 = new ArrayList<>();
        Contenido_Protocolos_Tema1.add(Pagina0);
        
        return  Contenido_Protocolos_Tema1;
    }

}
