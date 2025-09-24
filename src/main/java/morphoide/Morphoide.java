package morphoide;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;

/**
 * Morphoide it is a static class to handle the instance in a more accessible way
 * that works with static methods easy to instantiate and use with different
 * functionalities, routine, transformations, mathematical operations and more
 *
 * @author Alex T. H.
 * @version v0.2.4
 * @see <a href="https://github.com/Zelechos/Morphoide">Morphoide</a>
 * @since 20.0.0 2023-09-04
 */
public class Morphoide {

//---------------------------------------------------------------
//|                                                             |
//|                       MORPH FIELDS                          |
//|                                                             |
//---------------------------------------------------------------
    private final static int ONE_TO_AOS = 1;
    private final static int ZERO_TO_AOS = 0;
    private final static Pattern specialCharacter = Pattern.compile("[,:.;!@#$%&*()_+=|<>?{}\\[\\]~-]");
    private static Object responseMorph;

    private Morphoide(Object responseMorph) {
        Morphoide.responseMorph = responseMorph;
    }

    public static <E> Morphoide meta() {
        return new Morphoide(responseMorph);
    }

    @SuppressWarnings("unchecked")
    public <T> T morph(Class<T> type) {
        return (T) responseMorph;
    }

    @SuppressWarnings("unchecked")
    public <T> T morph() {
        return (T) responseMorph;
    }

//---------------------------------------------------------------
//|                       MORPH STRINGS                         |
//---------------------------------------------------------------

    /**
     * Subrutina para invertir los caracteres de un Morphoide
     *
     * @return String "rehte"
     */
    public Morphoide reverseString() {
        StringBuilder reverse = new StringBuilder();
        for (int lyrics = realLength(Morphoide.responseMorph.toString()); lyrics >= ZERO_TO_AOS; lyrics--) {
            reverse.append(Morphoide.responseMorph.toString().charAt(lyrics));
        }
        this.responseMorph = reverse.toString();
        return this;
    }

    /**
     * Subrutina para invertir los caracteres de un String
     *
     * @param text "ether"
     * @return String "rehte"
     */
    public Morphoide reverseString(String text) {
        StringBuilder reverse = new StringBuilder();
        for (int lyrics = realLength(text); lyrics >= ZERO_TO_AOS; lyrics--) {
            reverse.append(text.charAt(lyrics));
        }
        this.responseMorph = reverse.toString();
        return this;
    }

    /**
     * Subrutina obtener el valor de una tupla separada
     * por caracter especial y devolver el valor
     *
     * @param text "key : value"
     * @return String "value"
     */
    public Morphoide returnValueString(String text, String symbol) {
        this.responseMorph = Morphoide.meta()
                .separationBySymbolToList(text, symbol)
                .returnValueString()
                .morph();
        return this;
    }

    /**
     * Subrutina obtener el valor de una tupla separada
     * por caracter especial y devolver el valor
     *
     * @return String "value"
     */
    public Morphoide returnValueString() {
        this.responseMorph = Morphoide.meta()
                .morph(List.class)
                .get(ONE_TO_AOS);
        return this;
    }


    /**
     * Subrutina obtener la llave de una tupla separada
     * por caractar especial y devolver la llave
     *
     * @param text "key : value"
     * @return String "key"
     */
    public Morphoide returnKeyString(String text, String symbol) {
        this.responseMorph = Morphoide.meta()
                .separationBySymbolToList(text, symbol)
                .returnKeyString()
                .morph();
        return this;
    }


    /**
     * Subrutina obtener la llave de una tupla separada
     * por caractar especial y devolver la llave
     *
     * @return String "key"
     */
    public Morphoide returnKeyString() {
        this.responseMorph = Morphoide.meta()
                .morph(List.class)
                .get(ZERO_TO_AOS);
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una String[]
     *
     * @param text "key : value"
     * @param symbol ":"
     * @return String[] ["key" , "value"]
     */
    public Morphoide separationBySymbol(String text, String symbol) {
        boolean validation = Morphoide.meta()
                .containsSpecialCharacter(text)
                .morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = Morphoide.meta()
                .cleanSpacesOfString(text)
                .morph(String.class)
                .split(symbol);
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una List
     *
     * @param text "key : value"
     * @param symbol ":"
     * @return List ["key" , "value"]
     */
    public Morphoide separationBySymbolToList(String text, String symbol) {

        boolean validation = Morphoide.meta()
                .containsSpecialCharacter(text)
                .morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = Arrays.asList(Morphoide.meta()
                .cleanSpacesOfString(text)
                .morph(String.class)
                .split(symbol));
        return this;
    }


    /**
     * Subrutina para eliminar el primer caracter de
     * un String
     *
     * @param text "java"
     * @return String "ava"
     */
    public static String removeInitialCharacter(String text) {
        return text.substring(1);
    }


    /**
     * Subrutina para eliminar el ultimo caracter de
     * un String
     *
     * @param text "java"
     * @return String "jav"
     */
    public static String removeFinalCharacter(String text) {
        return text.substring(0, text.length() - 1);
    }


    /**
     * Subrutina para eliminar el primer y ultimo caracter de
     * un String
     *
     * @param text "java"
     * @return String "av"
     */
    public static String removeInitialAndFinalCharacter(String text) {
        return removeFinalCharacter(removeInitialCharacter(text));
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @param text "java"
     * @return List ["j","a","v","a"]
     */
    public Morphoide stringDestruction(String text) {
        this.responseMorph = Arrays.asList(text.split(""));
        return this;
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @return List ["j","a","v","a"]
     */
    public Morphoide stringDestruction() {
        this.responseMorph = Arrays.asList(Morphoide.responseMorph.toString().split(""));
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List
     *
     * @param texts ["t", "e", "x", "t"]
     * @return String "text"
     */
    public Morphoide stringConstruction(String[] texts) {
        StringBuilder construction = new StringBuilder();
        for (String text : texts) {
            construction.append(text);
        }
        this.responseMorph  = construction.toString();
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List
     *
     * @return String "text"
     */
    public Morphoide stringConstruction() {
        StringBuilder construction = new StringBuilder();
        String [] texts = (String[]) Morphoide.responseMorph;
        for (String text : texts) {
            construction.append(text);
        }
        this.responseMorph  = construction.toString();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una List
     *
     * @param text "texto"
     * @return List ["o","t","x","e","t"]
     */
    public Morphoide stringReverseDestruction(String text) {
        Morphoide morphoide = this.reverseString(text);
        this.responseMorph = Morphoide.meta()
                .reverseString(text)
                .stringConstruction()
                .stringDestruction()
                .morph();
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List invertidos
     *
     * @param texts [t, e, x, t, o]
     * @return String "otxet"
     */
    public Morphoide listReverseConstruction(String[] texts) {
        this.responseMorph = Morphoide.meta()
                .stringConstruction()
                .reverseString()
                .morph();
        return this;
    }


    /**
     * Subrutina para obtener el caracter de un String
     * dependiendo el indice introducido
     *
     * @param text  "Hello"
     * @param index 0
     * @return String "H"
     */
    public static String getFirstCharacterFromString(String text, int index) {
        return String.valueOf(text.charAt(index));
    }


    /**
     * Subrutina para obtener el ultimo caracter de un String
     *
     * @param text "Hello"
     * @return String "o"
     */
    public static String getLastCharacterFromString(String text) {
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
        return text.equals(Morphoide.meta()
                .reverseString(text)
                .morph());
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @return boolean false
     */
    public Morphoide isCapicua() {
        this.responseMorph = Morphoide.responseMorph.equals(Morphoide.meta()
                .reverseString()
                .morph());
        return this;
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
            firstText.append(getFirstCharacterFromString(text, i));
            lastText.append(getFirstCharacterFromString(text, i + index));
        }

        list.add(firstText.toString());
        list.add(lastText.toString());
        return list;
    }


    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @return boolean true
     */
    public Morphoide containsLowerCase() {
        this.responseMorph = Morphoide.meta()
                .iterateString(Morphoide.responseMorph
                        .toString(), letter -> Character.isLetter(letter) && Character.isLowerCase(letter))
                .morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @param text "MOrPH"
     * @return boolean true
     */
    public Morphoide containsLowerCase(String text) {
        this.responseMorph = Morphoide.meta()
                .iterateString(text, letter -> Character.isLetter(letter) && Character.isLowerCase(letter))
                .morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @return boolean true
     */
    public Morphoide containsUpperCase() {
        this.responseMorph = Morphoide.meta()
                .iterateString(Morphoide.responseMorph
                        .toString(), letter -> Character.isLetter(letter) && Character.isUpperCase(letter))
                .morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @param text "morphoId"
     * @return boolean true
     */
    public Morphoide containsUpperCase(String text) {
         this.responseMorph = Morphoide.meta()
                 .iterateString(text, letter -> Character.isLetter(letter) && Character.isUpperCase(letter))
                 .morph(Boolean.class);
         return this;
    }


    /**
     * Subrutina para saber si el texto tiene un numero
     *
     * @param text "morphoid9"
     * @return boolean true
     */
    public Morphoide containsNumber(String text) {
        this.responseMorph = Morphoide.meta()
                .iterateString(text, Character::isDigit)
                .morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene un numero
     *
     * @return boolean true
     */
    public Morphoide containsNumber() {
        this.responseMorph = Morphoide.meta()
                .iterateString(Morphoide.responseMorph.toString(), Character::isDigit)
                .morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene un caracter especial
     *
     * @param text "morphoid!"
     * @return boolean true
     */
    public Morphoide containsSpecialCharacter(String text) {
        this.responseMorph = specialCharacter.matcher(text).find();
        return this;
    }

    /**
     * Subrutina para saber si el Morphoide tiene un caracter especial
     *
     * @return boolean true
     */
    public Morphoide containsSpecialCharacter() {
        this.responseMorph =  specialCharacter.matcher(Morphoide.responseMorph
                .toString()).find();
        return this;
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
    public Morphoide isBetweenRange(String text, int min, int max) {
        this.responseMorph = (text.length() >= min && text.length() <= max);
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un letra minuscula y
     * una letra mayuscula
     *
     * @return boolean true
     */
    public Morphoide isUppercaseAndLowercase() {
        this.responseMorph = Morphoide.meta()
                .containsUpperCase()
                .containsLowerCase()
                .morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula
     *
     * @param text "Morphoid"
     * @return boolean true
     */
    public Morphoide isUppercaseAndLowercase(String text) {
        this.responseMorph = Morphoide.meta()
                .containsUpperCase(text)
                .containsLowerCase()
                .morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercaseAndNumber() {
        this.responseMorph = Morphoide.meta()
                .containsLowerCase()
                .containsUpperCase()
                .containsNumber()
                .morph();
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @param text "Morphoid9"
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercaseAndNumber(String text) {
        this.responseMorph = Morphoide.meta()
                .containsLowerCase(text)
                .containsUpperCase()
                .containsNumber()
                .morph();
        return this;
    }


    /**
     * Subrutina para eliminas los espacios en un String
     *
     * @param text " Hola Java "
     * @return String "HolaJava"
     */
    public Morphoide cleanSpacesOfString(String text) {
        this.responseMorph = text.replaceAll("\\s+", "");
        return this;
    }

    /**
     * Subrutina para eliminas los espacios en un String
     *
     * @return String "HolaJava"
     */
    public Morphoide cleanSpacesOfString() {
        this.responseMorph = Morphoide.responseMorph
                .toString()
                .replaceAll("\\s+", "");
        return this;
    }

    /**
     * Subrutina para validar un password
     *
     * @param text "Morphoid!"
     * @param min  8
     * @param max  48
     * @return boolean true
     */
    public Morphoide isValidPassword(String text, int min, int max) {
        boolean validation = Morphoide.meta()
                .isBetweenRange(text, min, max)
                .morph(Boolean.class);
        if (!validation) {
            throw new Error("The password " + text + " don't have a the range between min " + min + " and max " + max);
        }

        this.responseMorph = Morphoide.meta()
                .containsNumber(text)
                .containsSpecialCharacter()
                .isUppercaseAndLowercase()
                .morph();
        return this;

    }


//---------------------------------------------------------------
//|                         MORPH LIST                          |
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
//|                         MORPH INT                           |
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
//|                       MORPHS HELPERS                        |
//---------------------------------------------------------------


    /**
     * Subrutina para recorrer un texto en base a una lambda
     *
     * @param text   "morphoid"
     * @param lambda ()->
     * @return boolean true
     */
    private Morphoide iterateString(String text, IntPredicate lambda) {
        this.responseMorph = text.chars().anyMatch(lambda);
        return this;
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