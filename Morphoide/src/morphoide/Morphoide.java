/**
 * @author: Pragmatic Coder
 * @repository: https://github.com/Zelechos/PragmaticMorphoide
 */
package morphoide;

import java.util.ArrayList;
import java.util.List;


/**
 * Morphoide it is a static class to handle the instance in a more accessible way
 * that works with static methods easy to instantiate and use with different 
 * functionalities, routine, transformations, mathematical operations and more ...
 */

public final class Morphoide{

//---------------------------------------------------------------
//                     PREPROCESSING STRINGS     
//---------------------------------------------------------------
    
    /**
     * @method reverseString
     * @function Sirve para invertir los caracteres de un String
     * @example "ethernet"
     * @param text
     * @return String
     */
    public static String reverseString(String text) {
        int limit = text.length() - 1;
        String reverse = "";
        for (int letra = limit; letra >= 0; letra--) {
            reverse += text.charAt(letra);
        }
        return reverse;
    }
    
    
    /**
     * @method separationByTwoPoints 
     * @function Sirve para separar dos valores y introducirlos en un List
     * @example "string : number"
     * @param text
     * @return String[]
     */
    public static String[] separationByTwoPoints(String text) {
        String[] values = text.split("\\:");
        return values;
    }
    
    
    /**
     * @method returnValueString
     * @function Sirve obtener el valor de una Tupla separa por ":"
     * y devolvemos este valor
     * @example "key : value"
     * @param text
     * @return String
     */
    public static String returnValueString(String text) {
        String[] values = text.split("\\:");
        return values[1].trim();
    }
    
    
//---------------------------------------------------------------
//                     production up to here    
//---------------------------------------------------------------    
    
    
    // Subrutina CopiaCadena Sirve para generar una copia y devuelve la copia osea una List
    public static List CopiaCadena(String Mensaje) {
        List CopiaCadenas = new ArrayList();
        String Cadena = ReturnCadena(Mensaje);
        CopiaCadenas.add(Cadena);
        return CopiaCadenas;
    }

    //Subrutina ReturnFactorial realiza el Factorial de una Numero y lo retorna com Un string
    public static String ReturnFactorial(int Mensaje) {
        int factorial = Factorial(Mensaje);
        return "resultado : " + factorial;
    }

    /*Subrutina ReturnFibonacci realiza la sucesion Fibonacci en 
     base a un string obtiene el valor numerico del string y 
     realiza el calculo de la seria fibonacci en base a ese numero
     */
    public static String ReturnFibonacci(String Mensaje) {
        int Valor = ReturnValue(Mensaje);
        String respuesta = Fibonacci(Valor);
        if (Valor > 0) {
            return "resultado : " + respuesta;
        } else {
            return "resultado : no_n";
        }
    }

    /*
    Subrutina Oracion: 
    En base a un String y una ArrayList tipo Cadena
    verifiacamos si el ArrayList esta vacio y tambien
    recuperamos una cadena especifica y convertimos su Primera 
    Letra en mayuscula
     */
    public static String Oracion(String Mensaje, ArrayList Cadena) {
        int longitud = Cadena.size();
        if (longitud == 0) {
            return "resultado : no_n";
        } else {
            return "resultado : " + UpperCaseFirst(ReturnCadena(Mensaje));
        }
    }

    //Subrutina UpperCaseFirst sirve para convertir la primera letra de una string a mayuscula
    public static String UpperCaseFirst(String Texto) {
        char[] Caracteres = Texto.toCharArray();
        Caracteres[0] = Character.toUpperCase(Caracteres[0]);
        return new String(Caracteres);
    }

    //Subrutina que transforma de String a Entero
    public static int TextToNumber(String texto) {
        int Number = Integer.parseInt(texto);
        return Number;
    }

    //Subrutina que transforma de String a Entero
    public static String NumberToText(int numero) {
        String Texto = String.valueOf(numero);
        return Texto;
    }

    //Subrutina para Recuperar el comando donde "comando : valor"
    public static String ReturnComand(String comando) {
        String[] Separado = comando.split("\\:");
        return Separado[0].trim();
    }

    //Subrutina para Recuperar el valor de tipo entero donde "comando : valor"
    public static int ReturnValue(String valor) {
        String[] Separado = valor.split("\\:");
        int numero = TextToNumber(Separado[1].trim());
        return numero;
    }

    //Subrutina para Recuperar el valor de tipo string donde "comando : valor"
    public static String ReturnCadena(String cadena) {
        String[] Separado = cadena.split("\\:");
        return Separado[1].trim();
    }

    //Subrutina que Genera el Factorial
    public static int Factorial(int Number) {
        if (Number == 0 || Number == 1) {
            return 1;
        }
        return Number * Factorial(Number - 1);
    }

    //Subrutina que Genera la serie Fibonacci
    public static String Fibonacci(int Number) {
        int antecesor = 0, sucesor = 1, auxiliar;
        String Sucesion = " ";
        for (int i = 0; i < Number; i++) {
            auxiliar = antecesor;
            antecesor = sucesor + antecesor;
            sucesor = auxiliar;
            Sucesion += NumberToText(sucesor) + " -> ";
        }
        return Sucesion;
    }
    
    //Subrutina que Genera la Sumatoria de un Numero
    public int Sumatoria(int Number) {
        int Sumatoria = 0;
        for (int Iterador = 0; Iterador < Number; Iterador++) {
            Sumatoria += Number - Iterador;
        }
        return Sumatoria;
    }
    
}

