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
    private ArrayList<String> Contenido_HTML_Tema1;

    public ArrayList getETIQUETA1() {
        String T1_Protocolos = "1 . Fundamentos Redes";
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

    
    //Cambiar la Manera de Introducir el Contenido
    //Cambiooooo es lo mejor
    public ArrayList getContenidoProtocolosTema1() {

        String Pagina0 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6><b>¿ Que es una Red?</b></font></h2>"
                + "<p>"
                + "Una red de Computadoras (Tambien llamada Red de Computadores o Red <br>"
                + "Informatica) es un conjunto de equipos (Computadoras y/o Dispositivos) conectados<br>"
                + "por medio de cables, señales, ondas o cualquier otro medio de transporte de datos,<br>"
                + "que comparten informacion (archivos), recursos (CD-ROM, Impresoras, etc)<br>"
                + "y servicios (acceso a internet, e-mail, Juegos, chats, etc).<br>"
                + "</p>"
                + "<h2 align = center><FONT SIZE=6 COLOR=#F00E3E><b>Componentes de una Red</b></font></h2>"
                + "<p>"
                + "Los Componentes de una Red tienen funciones específicas y se utilizan dependiendo<br>"
                + "de las características físicas(HARDWARE) que tienen. Para elegirlos se requiere <br>"
                + "considerar las necesidades y los recursos económicos de quien se desea conectar a <br>"
                + "la <strong>Red</strong>, por eso deben conocerse las características técnicas de cada componente<br>"
                + "de <strong>Red</strong> a continuacion conoceremos algunos.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C >1 . Servidor </font></h2>"
                + "<p>"
                + "Son computadoras que controlan las <strong>Redes</strong> y se encargan de permitir o no el acceso<br>"
                + "de los usuarios a los recursos, también controlan los permisos que determinan si un<br>"
                + "nodo puede o no pertenecer a una <strong>Red</strong>. La finalidad de los servidores es controlar<br>"
                + "el funcionamiento de una <strong>Red</strong> y los servicios que realice cada una de estas<br>"
                + "computadoras dependerán del diseño de la <strong>Red</strong>. <br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>2 . Estación de Trabajo </font></h2>"
                + "<p>"
                + "Es el nombre que reciben las computadoras conectadas a una <strong>Red</strong> pero estas no<br>"
                + "pueden controlarla, ni ninguno de sus nodos o recursos de la misma <strong>Red</strong> cualquier<br>"
                + "computadora puede ser una Estación de Trabajo, siempre que este conectada y se<br>"
                + "comunique a la <strong>Red</strong>.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";

        String Pagina1 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>3 . Nodo de Red</b></font></h2>"
                + "<p>"
                + "Nodo de <strong>Red</strong> es cualquier elemento que se encuentre conectado y comunicado<br>"
                + "a una <strong>Red</strong>; a los periféricos que se conectan a una computadora se convierte en<br>"
                + "nodos si están conectados a la red y pueden compartir sus servicios para ser utilizados<br>"
                + "por los usuarios, como impresoras, etc.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>4 . Tarjetas de Red</b></font></h2>"
                + "<p>"
                + "Son tarjetas de circuitos integrados que se insertan en unos órganos de expansión<br>"
                + "de la tarjeta Madre y cuya función es recibir el cable que conecta a la computadora<br>"
                + "con una <strong>Red</strong> informátíca; así todas las computadoras de <strong>Red</strong> podrán intercambiar<br>"
                + "información.<br>"
                + "</p>"
                + "<h2 align = center><FONT SIZE=6 COLOR =#F00E3E>Medios de Transmisión</font></h2>"
                + "<p>"
                + "Estos elementos hacen posible la comunicación entre dos computadoras, son cables<br>"
                + "que se conectan a las computadoras y a través de estos viaja la información.<br>"
                + "Los cables son un componente básico en la comunicación entre computadoras.<br>"
                + "Existen diferentes tipos de cable y su elección depende de las necesidades<br>"
                + "de la comunicación de <strong>Red</strong> a continuacion veremos algunos. <br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>1 . Cable Coaxial </font></h2>"
                + "<p>"
                + "Esta constituido por un hilo principal de cobre, cubierta por una capa plástica <br>"
                + "rodeada por una película reflejante que reduce las interferencias, alrededor de ella<br>"
                + "existe una malla de hilos metalícos y todo esto esta cubierto por una capa de hule<br>"
                + "que protege a los conductores de la intemperie.<br>"
                + "</p><br><br><br><br>"
                + "</body>"
                + "</html>";

        String Pagina2 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>2 . Cable Par Trenzado</b></font></h2>"
                + "<p>"
                + "Se utiliza para la conexión de <strong>Redes</strong>, es el que tiene 4 para de cables; <br>"
                + "pero existen 3 variaciones con esta característica y pueden utilizarse para comunicarse<br>"
                + "los nodos de una <strong>Red</strong> y son los siguientes.<br>"
                + "</p>"
                + "<ol>"
                + "<li>UTP (Unshuielded Twisted Pair / Par trenzado no Apantallado)</li>"
                + "<li>STP (Shielded Twisted Pair/ Par trenzado Apantallado)</li>"
                + "<li>FTP (Foiled Twisted Pair / Par trenzado con Pantalla Global)</li>"
                + "</ol>"
                + "<h2><FONT SIZE=6 COLOR=#03F4FB><b>1 . UTP (Par trenzado no Apantallado)</b></font></h2>"
                + "<p>"
                + "Es la variable que es mas utilizada para la conexión de <strong>Red</strong> por su bajo costo,<br>"
                + "porque permite maniobrar sin problemas y porque no requiere de herramientas<br>"
                + "especiales ni complicadas para la conexión de nodos en una <strong>Red</strong>.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#03F4FB>2 . STP (Par trenzado Apantallado)</font></h2>"
                + "<p>"
                + "Tiene una malla metálica que cubre cada uno de los pares de los cables, que además<br>"
                + "están cubiertos por una película reflejante que evita las interferencias.<br>"
                + "El inconveniente esta, en que es un cable robusto y caro y dificil de instalar.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#03F4FB>3 . FTP (Par trenzado con Pantalla Global)</font></h2>"
                + "<p>"
                + "Tiene una película reflejante que cubre cada uno de los pares de cables dispone<br>"
                + "de una apantalla global para mejorar su nivel de protección ante interferancias <br>"
                + "externas.<br>"
                + "</p><br><br><br><br><br>"
                + "</body>"
                + "</html>";

        String Pagina3 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>3 . Fibra òptica</b></font></h2>"
                + "<p>"
                + "La fibra òptica es resistente a la corrosiòn y a las altas temperaturas y gracias a<br>"
                + "la proteccion de la envoltura es capaz de soportar esfuerzos elevados de tensiòn en<br>"
                + "la instalacion. La desventaja de este cable es que su coste es elevado, ya que para<br>"
                + "su elavoracion se requiere vidrio de alta calidad ademas de ser sumamente fragil<br>"
                + "de manipular durante su frabricaciòn.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>4 . Conectores</b></font></h2>"
                + "<p>"
                + "Los conectores son aditamentados con lo que los cables se conectan a tarjetas de <br>"
                + "<strong>Red</strong> ubicadas en los nodos. La función de los conectores es muy importante, ya<br>"
                + "que sin ellos es imposible utilizar cables para conectar un nodo a la <strong>Red</strong>.<br>"
                + "Cada medio de transmisión tiene sus conectores correspondientes y gracias a ello se <br>"
                + "logra recibir o transmitir informacion con las caracteristicas que permite los cables.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>5 . USB (Universal Serial Bus)</font></h2>"
                + "<p>"
                + "Tambien llamado Bus Universal en Serie es un subsistema que transfiere datos o <br>"
                + "electricidad entre componentes del ordenador, o entre ordenadores.<br>"
                + "Un USB puede conectar varios perifericos utilizando el mismo conjunto de cables.<br>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>6 . Concentrador</font></h2>"
                + "<p>"
                + "El termino 'concentrador' se refiere a un repetidor de puerto multiple.Este tipo de<br>"
                + "dispositivo simplemente transmite toda la informacion que recibe, para que todos los<br>"
                + "dispositivos conectados a sus puertos reciban dicha información. Los concentradores <br>"
                + "repiten toda la informacion que reciben y se pueden utilizar para extender la <strong>Red</strong>.<br>"
                + "No obstante, debido a esta accion, puede ser que se envie gran cantidad de trafico <br>"
                + "innecesario a todos los dispositivos de la <strong>Red</strong>.<br> " 
                +"</p>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";

        String Pagina4 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>7 . Router</b></font></h2>"
                + "<p>"
                + "El termino de origen inglés router puede ser traducido al español como enrutador<br>"
                + "o ruteador, aunque en ocasiones tambien se lo menciona como direccionador.<br>"
                + "Se trata de un producto de hardware que permite interconectar computadoras<br>"
                + "que funcionan en el marco de una <strong>Red</strong>.<br>"
                + "Se encarga de establecer qué ruta se destinará a cada paquete de datos dentro de<br>"
                + "una <strong>Red Informatica</strong>.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>8 . Bridges(Puente)</font></h2>"
                + "<p>"
                + "Un Puente es un dispositivo de hardware utilizado para conectar dos <strong>Redes</strong><br>"
                + "que funcionan con el mismo protocolo. A diferencia de un repetidor, que funciona a<br>"
                + "nivel físico, el Puente(Bridges) funciona en el nivel lógico.<br>"
                + "Esto significa que puede filtrar tramas para permitir sólo el paso de aquellas cuyas<br>"
                + "direcciones de destino se correspondan con un equipo ubicado del otro lado del puente.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>9 . El Módem</font></h2>"
                + "<p>"
                + "Un módem (del inglés modem, acrónimo de modulator demodulator; pl. módems) <br>"
                + "Es un dispositivo que convierte las señales digitales en analógicas (modulación)<br>"
                + "y viceversa(desmodulacón) y permite así la comunicación entre computadoras a través<br>"
                + "de la línea telefónica o del cablemódem.<br>"
                + "Es otro de los periféricos que con el tiempo se ha convertido ya en inpresindible<br>"
                + "y pocos son los modelos de ordenador que no ésten conectados a una <strong>Red</strong> que no lo<br>"
                + "incorporen.<br>"
                + "Su gran utilización viene dada básicamente por dos motivos: Internet y el Fax . <br>"
                + "</p><br><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina5 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>10 . Comunicación Inalámbrica</b></font></h2>"
                + "<p>"
                + "La comunicación inalámbrica es la transferencia de información sin ninguna<br>"
                + "conexión física entre el emisor y receptor que utilizan el espectro de frecuencia<br>"
                + "de radio(aéreo) y hardware, software y diversas tecnologías para transmitir información.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>11 . WIFI(Red Inalámbrica)</font></h2>"
                + "<p>"
                + "WiFi es una abreviatura de Wireless Fidelity, tambien llamada <br>"
                + "WLAN(Wireless Lan , Red Inalámbrica). <br>"
                + "Para su funcionamiento, el wifi necesita de un equipo (enrutador o router) <br>"
                + "conectado a internet y dotado de una antena, para que a su vez redistribuya esta <br>"
                + "señal de manera inalámbrica dentro de un radio determinado. Los equipos receptores <br>"
                + "que se encuentren dentro del área de cobertura, al mismo tiempo, deben estar<br>"
                + "dotados con dispositivos compatibles con la tecnología wifi para que puedan tener<br>"
                + "acceso a internet. Mientras más cerca se encuentren los equipos de la fuente de la<br>"
                + "señal, mejor será la conexión. En este sentido, la tecnología wifi es una solución<br>"
                + "informática que comprende un conjunto de estándares para redes inalámbricas<br>"
                + "basados en las especificaciones <strong><em>IEEE 802.11.</em></strong><br>"
                + "Lo cual asegura la compatibilidad e interoperabilidad en los equipos certificados bajo <br>"
                + "esta denominación."
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>12. Infrarrojos</font></h2>"
                + "<p>"
                + "Una conexión de <strong>Red</strong> por Infrarrojos permite establecer una conexión directa entre<br>"
                + "dos dispositivos habilitados para infrarrojos sin sin necesidad de usar módems, cables o hardware de <strong>Red</strong>.<br>"
                + "En vez de ello, se alinean dos dispositivos para establecer un vínculo de infrarrojos.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina6 = "<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E ><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>13 . Bluetooth</b></font></h2>"
                + "<p>"
                + "Una tecnología de Red inalámbrica de corto alcance, que se utiliza para conectar<br>"
                + "dispositivos entre sí sin una conexión por cable. Los dispositivos Bluetooth no<br>"
                + "necesitan una línea de visualización directa para comunicarse. <br>"
                + "Esto hace que su uso sea más flexible y permita la comunicacion entre habitaciones<br>"
                + "en espacios pequeños. El objetivo de Bluetooth es transmitir voz o datos entre<br>"
                + "equipos con circuitos de radio de bajo costo, a traves de un rango aproximado de<br>"
                + "entre diez y cien metros, utilizando poca energía.<br>"
                + "</p>"
                + "<h2 align=center><FONT SIZE=6 COLOR = #F00E3E >Arquitectura de Red</font></h2>"
                + "<p>"
                + "La arquitectura de <strong>Red</strong> es el medio mas efectivo en cuanto a costos para desarrollar<br>"
                + "e implementar un conjunto coordinado de productos que se pueden interconectar.<br>"
                + "software. La Arquitectura es el plan con el que se conectan los protocolos y otros<br>"
                + "programas de software. Esto es benéfico tanto para los usuarios de la red  como para<br>"
                + "los  proveedores de programas de hardware y software. <br>"
                + "La arquitectura de una <strong>Red</strong> viene definida por su Topología, el metodo de acceso a<br>"
                + "la <strong>Red</strong> y los protocolos de comunicación. Antes de que cualquier estacion de trabajo<br>"
                + "pueda utilizar el sistema de cableado, debe definirse con cualquier nodo de la <strong>Red</strong>.<br>"
                + "</p>"
                + "<blockquote>"
                + "<h4 align = center><FONT SIZE=4 COLOR=#FCE502><em>Mensaje del Creador</em></font></h4>"
                + "<blockquote ><font size= 4 color=#FCE502><em>"
                + "Hola soy Alex El Creador de Pragmatic Morphoide quiero aclarar algo si llegaste hasta<br>"
                + "esta parte te diste cuenta que estos son solo simples fundamentos y conceptos muy <br>"
                + "generales de Redes Informaticas posteriormente profundizaremos mas cada concepto <br>"
                + "para una mejor comprension eso era todo Adios.<br>"
                + "descifra el mensaje : <br>"
                + "<p aling=center>9oY4Akjg/WYoI+dEN7l/UaDyPlA9qMCO44u+oiSDQiE= </p>"
                + "en : https://www.online-toolz.com/tools/text-encryption-decryption.php <br>"
                + "</em>"
                + "</font>"
                + "</blockquote>"
                + "</blockquote><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina7="<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2 align =center><FONT SIZE=6 COLOR=#F00E3E><b>Topología de Redes</b></font></h2>"
                + "<p>"
                + "Se llama topología de una Red al patrón de conexión entre sus nodos, es decir, a la<br> "
                + "forma en que están interconectados los distintos nodos que la forman. La topología <br>"
                + "de una red es el arreglo físico o lógico en el cual los dispositivos o nodos de una <strong>Red</strong><br>"
                + "(computadoras, impresoras, servidores, hubs, switches, enrutadores, etc.).<br>"
                + "se interconectan entre sí sobre un medio de comunicación. <br>"
                + "<p><FONT SIZE=5 COLOR=#03F4FB><b>a) Topología física:</b></font></p>"
                + "<blockquote>Se refiere a las conexiones físicas e identifica cómo se interconectan los dispositivos finales y de infraestructura, como los routers, los switches y los puntos de acceso inalámbrico. Las topologías físicas generalmente son punto a punto o en estrella.</blockquote>"
                + "<p><FONT SIZE=5 COLOR=#03F4FB><b>b) Topología lógica:</b></font></p>"
                + "<blockquote>Se refiere a la forma en que una red transfiere tramas de un nodo al siguiente. Esta disposición consta de conexiones virtuales entre los nodos de una red. Los protocolos de capa de enlace de datos definen estas rutas de señales lógicas. La topología lógica de los enlaces punto a punto es relativamente simple, mientras que los medios compartidos ofrecen métodos de control de acceso al medio deterministas y no deterministas.</blockquote>"
                + "<p><FONT SIZE=6 COLOR=#34F80C><b>1 . Topología en Bus</b></font></p>"
                + "<p>"
                + "Una Red en forma de Bus o Canal de difusión es un camino de comunicación <br>"
                + "bidireccional con puntos de terminación bien definidos. Cuando una estación <br>"
                + "transmite, la señal se propaga a ambos lados del emisor hacia todas las estaciones <br>"
                + "conectadas al Bus hasta llegar a las terminaciones del mismo. Así, cuando una  <br>"
                + "estación trasmite su mensaje alcanza a todas las estaciones, por esto el Bus recibe <br>"
                + "el nombre de canal de difusión.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";
        
        String Pagina8="<html>"
                + "<body>"
                + "<h1 align = center><FONT SIZE=9 COLOR = #F00E3E><b>Redes de Computadoras</b></font></h1>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C><b>10 . Comunicación Inalámbrica</b></font></h2>"
                + "<p>"
                + "La comunicación inalámbrica es la transferencia de información sin ninguna<br>"
                + "conexión física entre el emisor y receptor que utilizan el espectro de frecuencia<br>"
                + "de radio(aéreo) y hardware, software y diversas tecnologías para transmitir información.<br>"
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>11 . WIFI(Red Inalámbrica)</font></h2>"
                + "<p>"
                + "WiFi es una abreviatura de Wireless Fidelity, tambien llamada <br>"
                + "WLAN(Wireless Lan , Red Inalámbrica). <br>"
                + "Para su funcionamiento, el wifi necesita de un equipo (enrutador o router) <br>"
                + "conectado a internet y dotado de una antena, para que a su vez redistribuya esta <br>"
                + "señal de manera inalámbrica dentro de un radio determinado. Los equipos receptores <br>"
                + "que se encuentren dentro del área de cobertura, al mismo tiempo, deben estar<br>"
                + "dotados con dispositivos compatibles con la tecnología wifi para que puedan tener<br>"
                + "acceso a internet. Mientras más cerca se encuentren los equipos de la fuente de la<br>"
                + "señal, mejor será la conexión. En este sentido, la tecnología wifi es una solución<br>"
                + "informática que comprende un conjunto de estándares para redes inalámbricas<br>"
                + "basados en las especificaciones <strong><em>IEEE 802.11.</em></strong><br>"
                + "Lo cual asegura la compatibilidad e interoperabilidad en los equipos certificados bajo <br>"
                + "esta denominación."
                + "</p>"
                + "<h2><FONT SIZE=6 COLOR=#34F80C>12. Infrarrojos</font></h2>"
                + "<p>"
                + "Una conexión de <strong>Red</strong> por Infrarrojos permite establecer una conexión directa entre<br>"
                + "dos dispositivos habilitados para infrarrojos sin sin necesidad de usar módems, cables o hardware de <strong>Red</strong>.<br>"
                + "En vez de ello, se alinean dos dispositivos para establecer un vínculo de infrarrojos.<br>"
                + "</p><br><br>"
                + "</body>"
                + "</html>";

        Contenido_Protocolos_Tema1 = new ArrayList<>();
        Contenido_Protocolos_Tema1.add(Pagina0);
        Contenido_Protocolos_Tema1.add(Pagina1);
        Contenido_Protocolos_Tema1.add(Pagina2);
        Contenido_Protocolos_Tema1.add(Pagina3);
        Contenido_Protocolos_Tema1.add(Pagina4);
        Contenido_Protocolos_Tema1.add(Pagina5);
        Contenido_Protocolos_Tema1.add(Pagina6);
        Contenido_Protocolos_Tema1.add(Pagina7);
        Contenido_Protocolos_Tema1.add(Pagina8);

        return Contenido_Protocolos_Tema1;
    }

    public ArrayList getContenidoHTMLTema1() {
        String Pagina0 = "<html><body> cambiaste de pagina 0 html</body></html>";
        String Pagina1 = "<html><body> cambiaste de pagina 1 html</body></html>";
        String Pagina2 = "<html><body> cambiaste de pagina 2 html </body></html>";
        String Pagina3 = "<html><body> cambiaste de pagina 3 html</body></html>";
        String Pagina4 = "<html><body> cambiaste de pagina 4 html</body></html>";
        String Pagina5 = "<html><body> cambiaste de pagina 5 html</body></html>";

        Contenido_HTML_Tema1 = new ArrayList<>();
        Contenido_HTML_Tema1.add(Pagina0);
        Contenido_HTML_Tema1.add(Pagina1);
        Contenido_HTML_Tema1.add(Pagina2);
        Contenido_HTML_Tema1.add(Pagina3);
        Contenido_HTML_Tema1.add(Pagina4);
        Contenido_HTML_Tema1.add(Pagina5);

        return Contenido_HTML_Tema1;
    }
}
