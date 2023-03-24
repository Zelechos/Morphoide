/**
 * Morphoide it is a static class to handle the instance in a more accessible way
 * that works with static methods easy to instantiate and use with different
 * functionalities, routine, transformations, mathematical operations and more
 *
 * @author Alex T. H.
 * @version v0.1.9
 * @see <a href="https://github.com/Zelechos/PragmaticMorphoide">PragmaticMorphoide</a>
 * @since 20.0.0 2023-24-03
 */
package morphoide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Morphoide {

    private final static int ONE_TO_AOS = 1;

//---------------------------------------------------------------
//|                                                             |
//|                       MORPH STRINGS                         |
//|                                                             |
//---------------------------------------------------------------


    /**
     * Subrutina para invertir los caracteres de un String
     *
     * @param text "ether"
     * @return String "rehte"
     */
    public static String reverseString(String text) {
        int limit = text.length() - ONE_TO_AOS;
        String reverse = "";
        for (var lyrics = limit; lyrics >= 0; lyrics--) {
            reverse += text.charAt(lyrics);
        }
        return reverse;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre (:) e introducirlos en una List
     *
     * @param text "key : value"
     * @return String[] ["key" , "value"]
     */
    public static String[] separationByTwoPoints(String text) {
        String[] values = text.split("\\:");
        return values;
    }


    /**
     * Subrutina obtener el valor de una tupla separada
     * por (:) y devolver el valor
     *
     * @param text "key : value"
     * @return String "value"
     */
    public static String returnValueString(String text) {
        String[] values = text.split("\\:");
        return values[ONE_TO_AOS].trim();
    }


    /**
     * Subrutina obtener la llave de una tupla separada
     * por (:) y devolver la llave
     *
     * @param text "key : value"
     * @return String "key"
     */
    public static String returnKeyString(String text) {
        String[] Separado = text.split("\\:");
        return Separado[0].trim();
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @param text "java"
     * @return List ["j","a","v","a"]
     */
    public static List stringDestruction(String text) {
        List cloneList = new ArrayList();
        int limit = text.length();
        for (int lyrics = 0; lyrics < limit; lyrics++) {
            cloneList.add(text.charAt(lyrics));
        }
        return cloneList;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List
     *
     * @param texts ["t", "e", "x", "t"]
     * @return String "text"
     */
    public static String stringConstruction(String[] texts) {
        String construction = "";
        int limit = texts.length;
        for (int lyrics = 0; lyrics < limit; lyrics++) {
            construction += texts[lyrics];
        }
        return construction;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una List
     *
     * @param text "texto"
     * @return List<String> ["o","t","x","e","t"]
     */
    public static List<String> stringReverseDestruction(String text) {
        List<String> cloneList = new ArrayList<>();
        int limit = text.length() - ONE_TO_AOS;
        for (int lyrics = limit; lyrics >= 0; lyrics--) {
            cloneList.add(String.valueOf(text.charAt(lyrics)));
        }
        return cloneList;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List invertidos
     *
     * @param texts [t, e, x, t, o]
     * @return String "otxet"
     */
    public static String stringReserveConstruction(String[] texts) {
        String construction = "";
        int limit = texts.length - ONE_TO_AOS;
        for (int lyrics = limit; lyrics >= 0; lyrics--) {
            construction += texts[lyrics];
        }
        return construction;
    }


    /**
     * Subrutina para obtener el caracter de un String
     * dependiendo el indice introducido
     *
     * @param text "Hello", index 0
     * @return String "H"
     */
    public static String getACharacterFromString(String text, int index) {
        return String.valueOf(text.charAt(index));
    }


    /**
     * Subrutina para obtener el ultimo caracter de un String
     *
     * @param text "Hello"
     * @return String "o"
     */
    public static String getALastCharacterFromString(String text) {
        return String.valueOf(text.charAt(text.length() - ONE_TO_AOS));
    }


    /**
     * Subrutina para obtener el primer caracter de un String
     *
     * @param text "Hello"
     * @return String "H"
     */
    public static String getAFirstCharacterFromString(String text) {
        return String.valueOf(text.charAt(0));
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @param text "Morphoide"
     * @return boolean false
     */
    public static boolean isCapicua(String text) {
        return text.equals(reverseString(text));
    }


    /**
     * Subrutina para saber si la longitud de un String
     * es Par
     *
     * @param text "Morphoide"
     * @return boolean false
     */
    public static boolean lengthIsPair(String text) {
        return text.length() % 2 == 0;
    }


    /**
     * Subrutina para saber si la longitud de un String
     * es Impar
     *
     * @param text "Morphoide"
     * @return boolean true
     */
    public static boolean lengthIsOdd(String text) {
        return text.length() % 2 != 0;
    }


    /**
     * Subrutina para convertir la primera letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "Morphoide"
     */
    public static String upperCaseFirstCharacter(String text) {
        char[] Caracteres = text.toCharArray();
        Caracteres[0] = Character.toUpperCase(Caracteres[0]);
        return new String(Caracteres);
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "morphoidE"
     */
    public static String upperCaseLastCharacter(String text) {
        int index = text.length() - ONE_TO_AOS;
        char[] Caracteres = text.toCharArray();
        Caracteres[index] = Character.toUpperCase(Caracteres[index]);
        return new String(Caracteres);
    }

    /**
     * Subrutina para dividir a la mitad un String y devolver cada
     * parte en un List siempre y cuando la longitud sea Par
     *
     * @param text "morphoid"
     * @return List<String> ["morp","hoid"]
     */
    public static List<String> splitStringInTwo(String text) {
        StringBuilder firstText = new StringBuilder();
        StringBuilder lastText = new StringBuilder();
        int index = text.length() / 2;
        if (text.length() % 2 != 0) {
            return List.of("The text is odd");
        }
        for (var i = 0; i < index; i++) {
            firstText.append(getACharacterFromString(text, i));
            lastText.append(getACharacterFromString(text, i + index));
        }
        return List.of(firstText.toString(), lastText.toString());
    }

//---------------------------------------------------------------
//|                                                             |
//|                         MORPH LIST                          |
//|                                                             |
//---------------------------------------------------------------

    /**
     * Subrutina para devolver una List con elementos Unicos
     *
     * @param list ["java", "java", "rust", "javascript", "javascript"]
     * @return List<String> ["java", "rust", "javascript"]
     */
    public static List<String> getListOfUniqueElements(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return uniqueSet.stream().toList();
    }

//---------------------------------------------------------------
//                     production up to here    
//---------------------------------------------------------------    


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


    //Subrutina para Recuperar el valor de tipo entero donde "comando : valor"
    public static int ReturnValue(String valor) {
        String[] Separado = valor.split("\\:");
        int numero = TextToNumber(Separado[1].trim());
        return numero;
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