package io.github.morphoide;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;

/**
 * Morphoide it is a static class to handle the instance in a more accessible way
 * that works with static methods easy to instantiate and use with different
 * functionalities, routine, transformations, mathematical operations and more
 *
 * @author Alex T. H.
 * @version v0.2.1
 * @see <a href="https://github.com/Zelechos/PragmaticMorphoide">PragmaticMorphoide</a>
 * @since 20.0.0 2023-24-03
 */
public final class Morphoide {

    //---------------------------------------------------------------
//|                                                             |
//|                       MORPH FIELDS                          |
//|                                                             |
//---------------------------------------------------------------
    private final static int ONE_TO_AOS = 1;
    private final static int ZERO_TO_AOS = 0;
    private final static Pattern specialCharacter = Pattern.compile("[,:.;!@#$%&*()_+=|<>?{}\\[\\]~-]");

    private Morphoide() {
    }
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
        StringBuilder reverse = new StringBuilder();
        for (int lyrics = realLength(text); lyrics >= ZERO_TO_AOS; lyrics--) {
            reverse.append(text.charAt(lyrics));
        }
        return reverse.toString();
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre (:) e introducirlos en una List
     *
     * @param text "key : value"
     * @return String[] ["key" , "value"]
     */
    public static String[] separationByTwoPoints(String text) {
        return text.split(":");
    }


    /**
     * Subrutina obtener el valor de una tupla separada
     * por (:) y devolver el valor
     *
     * @param text "key : value"
     * @return String "value"
     */
    public static String returnValueString(String text) {
        String[] values = text.split(":");
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
        String[] Separado = text.split(":");
        return Separado[ZERO_TO_AOS].trim();
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @param text "java"
     * @return List ["j","a","v","a"]
     */
    public static List<String> stringDestruction(String text) {
        List<String> list = new ArrayList<>(Arrays.asList(text.split("")));
        return list;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List
     *
     * @param texts ["t", "e", "x", "t"]
     * @return String "text"
     */
    public static String stringConstruction(String[] texts) {
        StringBuilder construction = new StringBuilder();
        for (String text : texts) {
            construction.append(text);
        }
        return construction.toString();
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una List
     *
     * @param text "texto"
     * @return List ["o","t","x","e","t"]
     */
    public static List<String> stringReverseDestruction(String text) {
        return stringDestruction(reverseString(text));
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List invertidos
     *
     * @param texts [t, e, x, t, o]
     * @return String "otxet"
     */
    public static String stringReserveConstruction(String[] texts) {
        return reverseString(stringConstruction(texts));
    }


    /**
     * Subrutina para obtener el caracter de un String
     * dependiendo el indice introducido
     *
     * @param text  "Hello"
     * @param index 0
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
        return String.valueOf(text.charAt(realLength(text)));
    }


    /**
     * Subrutina para obtener el primer caracter de un String
     *
     * @param text "Hello"
     * @return String "H"
     */
    public static String getAFirstCharacterFromString(String text) {
        return String.valueOf(text.charAt(ZERO_TO_AOS));
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
        return text.length() % 2 == ZERO_TO_AOS;
    }


    /**
     * Subrutina para saber si la longitud de un String
     * es Impar
     *
     * @param text "Morphoide"
     * @return boolean true
     */
    public static boolean lengthIsOdd(String text) {
        return text.length() % 2 != ZERO_TO_AOS;
    }


    /**
     * Subrutina para convertir la primera letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "Morphoide"
     */
    public static String upperCaseFirstCharacter(String text) {
        return text.replaceFirst(getAFirstCharacterFromString(text), getAFirstCharacterFromString(text).toUpperCase());
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "morphoidE"
     */
    public static String upperCaseLastCharacter(String text) {
        char[] characters = text.toCharArray();
        characters[realLength(text)] = Character.toUpperCase(characters[realLength(text)]);
        return new String(characters);
    }

    /**
     * Subrutina para dividir a la mitad un String y devolver cada
     * parte en un List siempre y cuando la longitud sea Par
     *
     * @param text "morphoid"
     * @return List ["morp","hoid"]
     */
    public static List<String> splitStringInTwo(String text) {
        StringBuilder firstText = new StringBuilder();
        StringBuilder lastText = new StringBuilder();
        List<String> list = new ArrayList<>();
        int index = text.length() / 2;
        if (text.length() % 2 != ZERO_TO_AOS) {
            list.add("The text is odd");
            return list;
        }
        for (int i = ZERO_TO_AOS; i < index; i++) {
            firstText.append(getACharacterFromString(text, i));
            lastText.append(getACharacterFromString(text, i + index));
        }

        list.add(firstText.toString());
        list.add(lastText.toString());
        return list;
    }


    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @param text "MORPhOID"
     * @return boolean true
     */
    public static boolean containsLowerCase(String text) {
        return iterateString(text, letter -> Character.isLetter(letter) && Character.isLowerCase(letter));
    }


    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @param text "morphoId"
     * @return boolean true
     */
    public static boolean containsUpperCase(String text) {
        return iterateString(text, letter -> Character.isLetter(letter) && Character.isUpperCase(letter));
    }


    /**
     * Subrutina para saber si el texto tiene un numero
     *
     * @param text "morphoid9"
     * @return boolean true
     */
    public static boolean containsNumber(String text) {
        return iterateString(text, Character::isDigit);
    }


    /**
     * Subrutina para saber si el texto tiene un caracter especial
     *
     * @param text "morphoid!"
     * @return boolean true
     */
    public static boolean containsSpecialCharacter(String text) {
        return specialCharacter.matcher(text).find();
    }


    /**
     * Subrutina para saber si el texto esta comprendido entre
     * una longitud determinada definida por dos parametros
     *
     * @param text "morphoid!"
     * @param min  8
     * @param max  48
     * @return boolean true
     */
    public static boolean isBetweenRange(String text, int min, int max) {
        return (text.length() >= min && text.length() <= max);
    }


    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula
     *
     * @param text "Morphoid"
     * @return boolean true
     */
    public static boolean isUppercaseAndLowercase(String text) {
        return (containsLowerCase(text) && containsUpperCase(text));
    }


    /**
     * Subrutina para validar un password
     *
     * @param text "Morphoid!"
     * @param min  8
     * @param max  48
     * @return boolean true
     */
    public static boolean validatePassword(String text, int min, int max) {
        if (!isBetweenRange(text, min, max)) return false;
        return (containsNumber(text) || containsSpecialCharacter(text)) && isUppercaseAndLowercase(text);
    }


//---------------------------------------------------------------
//|                                                             |
//|                         MORPH LIST                          |
//|                                                             |
//---------------------------------------------------------------


    /**
     * Subrutina para devolver una List con elementos unicos
     *
     * @param list ["java", "java", "rust", "javascript", "javascript"]
     * @return List ["java", "rust", "javascript"]
     */
    public static List<String> getListOfUniqueElements(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }


//---------------------------------------------------------------
//|                                                             |
//|                         MORPH INT                           |
//|                                                             |
//---------------------------------------------------------------


    /**
     * Subrutina que genera el Factorial de un número
     *
     * @param number 3
     * @return int 6
     */
    public static int factorial(int number) {
        if (number == ZERO_TO_AOS || number == ONE_TO_AOS) return ONE_TO_AOS;
        return number * factorial(number - ONE_TO_AOS);
    }


    /**
     * Subrutina que genera la Sumatoria de un número
     *
     * @param number 9
     * @return int 45
     */
    public static int summation(int number) {
        int summation = ZERO_TO_AOS;
        for (int i = ZERO_TO_AOS; i < number; i++) {
            summation += number - i;
        }
        return summation;
    }


//---------------------------------------------------------------
//|                                                             |
//|                      MORPH ALGORITHMS                       |
//|                                                             |
//---------------------------------------------------------------

    /**
     * Subrutina que genera la serie Fibonacci en base
     * un numero
     *
     * @param number 5
     * @return String 0, 1, 1, 2, 3
     */
    public static String fibonacci(int number) {
        int predecessor = ZERO_TO_AOS;
        int successor = ONE_TO_AOS;
        int assistant;
        StringBuilder succession = new StringBuilder();
        for (int i = ZERO_TO_AOS; i < number; i++) {
            assistant = predecessor;
            predecessor = successor + predecessor;
            successor = assistant;
            succession.append(successor).append(" -> ");
        }
        return succession.toString();
    }

//---------------------------------------------------------------
//|                                                             |
//|                       MORPHS HELPERS                        |
//|                                                             |
//---------------------------------------------------------------


    /**
     * Subrutina para recorrer un texto en base a una lambda
     *
     * @param text   "morphoid"
     * @param lambda ()->
     * @return boolean true
     */
    private static boolean iterateString(String text, IntPredicate lambda) {
        return text.chars().anyMatch(lambda);
    }


    /**
     * Subrutina para obtener la longitud para iterar
     *
     * @param text "morphoid"
     * @return int 7
     */
    private static int realLength(String text) {
        return text.length() - ONE_TO_AOS;
    }

//---------------------------------------------------------------
//                     production up to here    
//---------------------------------------------------------------
}