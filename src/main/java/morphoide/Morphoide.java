package morphoide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Morphoide it is a static class to handle the instance in a more accessible way
 * that works with static methods easy to instantiate and use with different
 * functionalities, routine, transformations, mathematical operations and more
 *
 * @author Alex T. H.
 * @version v0.3.8
 * @see <a href="https://github.com/Zelechos/Morphoide">Morphoide</a>
 * @since 20.0.0 2025-09-24
 */
public class Morphoide {

    //---------------------------------------------------------------
//|                                                             |
//|                       MORPH FIELDS                          |
//|                                                             |
//---------------------------------------------------------------
    private final int ONE_TO_AOS = 1;
    private final int ZERO_TO_AOS = 0;
    private final Pattern specialCharacter = Pattern.compile("[,:.;!@#$%&*()_+=|<>?{}\\[\\]~-]");
    private Object responseMorph;

    private Morphoide(Object responseMorph) {
        this.responseMorph = responseMorph;
    }

    public static <E> Morphoide meta() {
        return new Morphoide(null);
    }

    public static <E> Morphoide meta(Object morph) {
        return new Morphoide(morph);
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
        this.responseMorph = reverseString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para invertir los caracteres de un String
     *
     * @param text "ether"
     * @return String "rehte"
     */
    public Morphoide reverseString(String text) {
        this.responseMorph = new StringBuilder(text).reverse().toString();
        return this;
    }


    /**
     * Subrutina obtener el valor de una tupla separada
     * por caracter especial y devolver el valor
     *
     * @param text   "key : value"
     * @param symbol ":"
     * @return String "value"
     */
    public Morphoide returnValueString(String text, String symbol) {
        this.responseMorph = separationBySymbolToList(text, symbol)
                .morph(List.class)
                .get(ONE_TO_AOS);
        return this;
    }


    /**
     * Subrutina obtener la llave de una tupla separada
     * por caractar especial y devolver la llave
     *
     * @param text   "key : value"
     * @param symbol ":"
     * @return String "key"
     */
    public Morphoide returnKeyString(String text, String symbol) {
        this.responseMorph = separationBySymbolToList(text, symbol)
                .morph(List.class)
                .get(ZERO_TO_AOS);
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una String[]
     *
     * @param text   "key : value"
     * @param symbol ":"
     * @return String[] ["key" , "value"]
     */
    public Morphoide separationBySymbol(String text, String symbol) {
        boolean validation = containsSpecialCharacter(text).morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = cleanSpacesOfString(text)
                .morph(String.class)
                .split(symbol);
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una List
     *
     * @param text   "key : value"
     * @param symbol ":"
     * @return List ["key" , "value"]
     */
    public Morphoide separationBySymbolToList(String text, String symbol) {

        boolean validation = containsSpecialCharacter(text).morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = Arrays.asList(cleanSpacesOfString(text)
                .morph(String.class)
                .split(symbol));
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una String[]
     *
     * @param symbol ":"
     * @return String[] ["key" , "value"]
     */
    public Morphoide separationBySymbol(String symbol) {
        this.responseMorph = separationBySymbol(this.responseMorph.toString(), symbol).morph();
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una List
     *
     * @param symbol ":"
     * @return List ["key" , "value"]
     */
    public Morphoide separationBySymbolToList(String symbol) {
        this.responseMorph = separationBySymbolToList(this.responseMorph.toString(), symbol).morph();
        return this;
    }


    /**
     * Subrutina para eliminar el primer caracter de
     * un Morphoide
     *
     * @return String "ava"
     */
    public Morphoide removeInitialCharacter() {
        this.responseMorph = Morphoide.meta()
                .removeInitialCharacter(this.responseMorph.toString())
                .morph();
        return this;
    }


    /**
     * Subrutina para eliminar el primer caracter de
     * un String
     *
     * @param text "java"
     * @return String "ava"
     */
    public Morphoide removeInitialCharacter(String text) {
        this.responseMorph = text.substring(1);
        return this;
    }


    /**
     * Subrutina para eliminar el ultimo caracter de
     * un Morphoide
     *
     * @return String "jav"
     */
    public Morphoide removeFinalCharacter() {
        this.responseMorph = Morphoide.meta()
                .removeFinalCharacter(this.responseMorph.toString())
                .morph();
        return this;
    }


    /**
     * Subrutina para eliminar el ultimo caracter de
     * un String
     *
     * @param text "java"
     * @return String "jav"
     */
    public Morphoide removeFinalCharacter(String text) {
        this.responseMorph = text.substring(0, text.length() - 1);
        return this;
    }


    /**
     * Subrutina para eliminar el primer y ultimo caracter de
     * un Morphoide
     *
     * @return String "av"
     */
    public Morphoide removeInitialAndFinalCharacter() {
        this.responseMorph = Morphoide.meta()
                .removeInitialCharacter()
                .removeFinalCharacter()
                .morph();
        return this;
    }

    /**
     * Subrutina para eliminar el primer y ultimo caracter de
     * un String
     *
     * @param text "java"
     * @return String "av"
     */
    public Morphoide removeInitialAndFinalCharacter(String text) {
        this.responseMorph = Morphoide.meta()
                .removeInitialCharacter(text)
                .removeFinalCharacter()
                .morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @param text "java"
     * @return List ["j","a","v","a"]
     */
    public Morphoide stringDestructionToList(String text) {
        this.responseMorph = Arrays.asList(text.split(""));
        return this;
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @return List ["j","a","v","a"]
     */
    public Morphoide stringDestructionToList() {
        this.responseMorph = Morphoide.meta()
                .stringDestructionToList(this.responseMorph.toString())
                .morph();
        return this;
    }

    /**
     * Subrutina para guardar todas las letras de una
     * String en una String array
     *
     * @param text "java"
     * @return String [] ["j","a","v","a"]
     */
    public Morphoide stringDestruction(String text) {
        this.responseMorph = text.split("");
        return this;
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una String array
     *
     * @return String [] ["j","a","v","a"]
     */
    public Morphoide stringDestruction() {
        this.responseMorph = stringDestruction(this.responseMorph.toString()).morph();
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
        this.responseMorph = String.join("", texts);
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una List
     *
     * @param texts ["t", "e", "x", "t"]
     * @return String "text"
     */
    public Morphoide stringConstruction(List<String> texts) {
        this.responseMorph = String.join("", texts);
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una responseMorph[String[], List]
     *
     * @return String "text"
     */
    public Morphoide stringConstruction() {
        this.responseMorph = (this.responseMorph instanceof List)
                ? stringConstruction((List<String>) this.responseMorph).morph()
                : stringConstruction((String[]) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una List
     *
     * @param text "texto"
     * @return List ["o","t","x","e","t"]
     */
    public Morphoide stringReverseDestructionToList(String text) {
        this.responseMorph = reverseString(text)
                .stringDestructionToList()
                .morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una String[]
     *
     * @param text "texto"
     * @return String [] ["o","t","x","e","t"]
     */
    public Morphoide stringReverseDestruction(String text) {
        this.responseMorph = reverseString(text)
                .stringDestruction()
                .morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una List
     *
     * @return List ["o","t","x","e","t"]
     */
    public Morphoide stringReverseDestructionToList() {
        this.responseMorph = reverseString()
                .stringDestructionToList()
                .morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras invertidas
     * de un String en una String[]
     *
     * @return String [] ["o","t","x","e","t"]
     */
    public Morphoide stringReverseDestruction() {
        this.responseMorph = reverseString()
                .stringDestruction()
                .morph();
        return this;
    }


    /**
     * Subrutina para crear un String con los elementos
     * de una String [] invertidos
     *
     * @param texts [t, e, x, t, o]
     * @return String "otxet"
     */
    public Morphoide arrayReverseConstruction(String[] texts) {
        this.responseMorph = stringConstruction(texts)
                .reverseString()
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
    public Morphoide listReverseConstruction(List<String> texts) {
        this.responseMorph = stringConstruction(texts)
                .reverseString()
                .morph();
        return this;
    }


    /**
     * Subrutina para crear un String Invertido con los elementos
     * de una responseMorph de tipo List o String[].
     *
     * @return String "otxet"
     */
    public Morphoide reverseConstruction() {
        this.responseMorph = stringConstruction()
                .reverseString()
                .morph();
        return this;
    }


    /**
     * Subrutina para obtener el caracter de un Morphoide
     * dependiendo el indice introducido
     *
     * @param text "Hello"
     * @return String "H"
     */
    public Morphoide getFirstCharacterFromString(String text) {
        this.responseMorph = String.valueOf(text.charAt(ZERO_TO_AOS));
        return this;
    }


    /**
     * Subrutina para obtener el caracter de un String
     * dependiendo el indice introducido
     *
     * @return String "H"
     */
    public Morphoide getFirstCharacterFromString() {
        this.responseMorph = getFirstCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para obtener el ultimo caracter de un String
     *
     * @param text "Hello"
     * @return String "o"
     */
    public Morphoide getLastCharacterFromString(String text) {
        this.responseMorph = String.valueOf(text.charAt(realLength(text)
                .morph()));
        return this;
    }


    /**
     * Subrutina para obtener el primer caracter de un Morphoide
     *
     * @return String "H"
     */
    public Morphoide getLastCharacterFromString() {
        this.responseMorph = getLastCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @param text "Morphoide"
     * @return boolean false
     */
    public Morphoide isCapicua(String text) {
        this.responseMorph = text.equals(reverseString(text).morph());
        return this;
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @return boolean false
     */
    public Morphoide isCapicua() {
        this.responseMorph = isCapicua(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si la longitud de un String
     * es Par
     *
     * @param text "Morphoide"
     * @return boolean false
     */
    public Morphoide lengthIsPair(String text) {
        this.responseMorph = text.length() % 2 == ZERO_TO_AOS;
        return this;
    }


    /**
     * Subrutina para saber si la longitud de un Morphoide
     * es Par
     *
     * @return boolean
     */
    public Morphoide lengthIsPair() {
        this.responseMorph = lengthIsPair(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si la longitud de un String
     * es Impar
     *
     * @param text "Morphoide"
     * @return boolean true
     */
    public Morphoide lengthIsOdd(String text) {
        this.responseMorph = text.length() % 2 != ZERO_TO_AOS;
        return this;
    }


    /**
     * Subrutina para saber si la longitud de un Morphoide
     * es Impar
     *
     * @return boolean true
     */
    public Morphoide lengthIsOdd() {
        this.responseMorph = lengthIsOdd(this.responseMorph.toString()).morph();
        return this;
    }

    /**
     * Subrutina para convertir la primera letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "Morphoide"
     */
    public Morphoide upperCaseFirstCharacter(String text) {
        String currentChar = getFirstCharacterFromString(text)
                .morph();
        this.responseMorph = text.replaceFirst(currentChar, currentChar.toUpperCase());
        return this;
    }


    /**
     * Subrutina para convertir la primera letra de una
     * Morphoide a mayuscula
     *
     * @return String "Morphoide"
     */
    public Morphoide upperCaseFirstCharacter() {
        this.responseMorph = upperCaseFirstCharacter(this.responseMorph.toString());
        return this;
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @param text "morphoide"
     * @return String "morphoidE"
     */
    public Morphoide upperCaseLastCharacter(String text) {
        char[] characters = text.toCharArray();
        int lastPosition = realLength(text)
                .morph();

        characters[lastPosition] = Character.toUpperCase(getLastCharacterFromString(text)
                .morph());

        this.responseMorph = new String(characters);
        return this;
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @return String "morphoidE"
     */
    public Morphoide upperCaseLastCharacter() {
        this.responseMorph = upperCaseLastCharacter(this.responseMorph.toString());
        return this;
    }


    /**
     * Subrutina para dividir a la mitad un String y devolver cada
     * parte en un List siempre y cuando la longitud sea Par
     *
     * @param text "morphoid"
     * @return List ["morp","hoid"]
     */
    public Morphoide splitStringInTwo(String text) {
        List<String> list = new ArrayList<>();
        if (text.length() % 2 != ZERO_TO_AOS) {
            throw new Error("The length of " + text + " is odd");
        }
        int mid = text.length() / 2;
        list.add(text.substring(0, mid));
        list.add(text.substring(mid));
        this.responseMorph = list;
        return this;
    }


    /**
     * Subrutina para dividir a la mitad un String y devolver cada
     * parte en un List siempre y cuando la longitud sea Par
     *
     * @return List ["morp","hoid"]
     */
    public Morphoide splitStringInTwo() {
        this.responseMorph =  splitStringInTwo(this.responseMorph.toString());
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @return boolean true
     */
    public Morphoide containsLowerCase() {
        this.responseMorph = containsLowerCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @param text "MOrPH"
     * @return boolean true
     */
    public Morphoide containsLowerCase(String text) {
        this.responseMorph = iterateString(text, letter -> Character.isLetter(letter) && Character.isLowerCase(letter))
                .morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @return boolean true
     */
    public Morphoide containsUpperCase() {
        this.responseMorph = containsUpperCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @param text "morphoId"
     * @return boolean true
     */
    public Morphoide containsUpperCase(String text) {
        this.responseMorph = iterateString(text, letter -> Character.isLetter(letter) && Character.isUpperCase(letter))
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
        this.responseMorph = iterateString(text, Character::isDigit).morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene un numero
     *
     * @return boolean true
     */
    public Morphoide containsNumber() {
        this.responseMorph = containsNumber(this.responseMorph.toString()).morph(Boolean.class);
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
        this.responseMorph = containsSpecialCharacter(this.responseMorph.toString()).morph();
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
    public Morphoide containsUppercaseAndLowercase() {
        this.responseMorph = (containsUpperCase().morph(Boolean.class) && containsLowerCase().morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula
     *
     * @param text "Morphoid"
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercase(String text) {
        this.responseMorph = (containsUpperCase(text).morph(Boolean.class) && containsLowerCase(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercaseAndNumber() {
        this.responseMorph = (containsUppercaseAndLowercase().morph(Boolean.class) && containsNumber().morph(Boolean.class));
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
        this.responseMorph = (containsUppercaseAndLowercase(text).morph(Boolean.class) && containsNumber(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercaseAndSpecialCharacter() {
        this.responseMorph = (containsUppercaseAndLowercase().morph(Boolean.class) && containsSpecialCharacter().morph(Boolean.class));
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @param text "Morphoid9"
     * @return boolean true
     */
    public Morphoide containsUppercaseAndLowercaseAndSpecialCharacter(String text) {
        this.responseMorph = (containsUppercaseAndLowercase(text).morph(Boolean.class) && containsSpecialCharacter(text).morph(Boolean.class));
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
        this.responseMorph = cleanSpacesOfString(this.responseMorph.toString()).morph();
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
        boolean validation = isBetweenRange(text, min, max).morph(Boolean.class);

        if (!validation) {
            throw new Error("The password " + text + " don't have a the range between min " + min + " and max " + max);
        }

        this.responseMorph = (containsUppercaseAndLowercaseAndNumber(text).morph(Boolean.class) && containsSpecialCharacter(text).morph(Boolean.class));
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
    public Morphoide getListOfUniqueElements(List<String> list) {
        this.responseMorph = list.stream()
                .distinct()
                .collect(Collectors.toList());
        return this;
    }


    /**
     * Subrutina para devolver una Morphoide con elementos unicos
     *
     * @return List ["java", "rust", "javascript"]
     */
    public Morphoide getListOfUniqueElements() {
        this.responseMorph = getListOfUniqueElements((List<String>) this.responseMorph).morph();
        return this;
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
    public int factorial(int number) {
        if (number == ZERO_TO_AOS || number == ONE_TO_AOS) return ONE_TO_AOS;
        return number * factorial(number - ONE_TO_AOS);
    }

    /**
     * Subrutina que genera la Sumatoria de un número
     *
     * @param number 9
     * @return int 45
     */
    public int summation(int number) {
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
    public String fibonacci(int number) {
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
    private Morphoide realLength(String text) {
        this.responseMorph = text.length() - ONE_TO_AOS;
        return this;
    }

    /**
     * Subrutina para obtener la longitud para iterar
     *
     * @return int 7
     */
    private Morphoide realLength() {
        this.responseMorph = realLength(this.responseMorph.toString()).morph();
        return this;
    }

//---------------------------------------------------------------
//                     production up to here
//---------------------------------------------------------------
}