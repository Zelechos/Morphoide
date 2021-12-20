/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */

package Pragmatic;//NOTA : Cambiar el package dependiendo del entorno

import java.util.ArrayList;
import java.util.List;

public class Pragmatic {

    //Subrutinas para realizar diferentes funcionalidades
    /*
    Subrutina Introducir Sirve para en base a un ArrayList separe el numero de un String
    ejemplo:
    "introducir : 2"
    esta subrutina obtiene el numero 2 y la tranforma a entero 
    y lo introduce en una Arraylist de enteros
     */
    public static String Introducir(String Mensaje) {
        List ListaNumeros = new ArrayList();
        int Valor = ReturnValue(Mensaje);
        ListaNumeros.add(Valor);
        return "exito : " + true;
    }

    //Subrutina Invertir sirve para en reconocer si un Arraylist de tipo string tiene elementos
    public static String Invertir(ArrayList Cadena) {
        int longitud = Cadena.size();
        if (longitud == 0) {
            return "resultado : no_n";
        } else {
            return "resultado : " + Cadena.get(1);
        }
    }

    /*
    Subrutina Cadena Sirve para en base a un ArrayList separe una cadena de un String
    ejemplo:
    "introducir : cadena"
    esta subrutina obtiene la "cadena" 
    y la introduce en una Arraylist de Strings
     */
    public static String Cadena(String Mensaje) {
        List ListaCadenas = new ArrayList();
        String Cadena = ReturnCadena(Mensaje);
        ListaCadenas.add(Cadena);
        return "exito : " + true;
    }

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
