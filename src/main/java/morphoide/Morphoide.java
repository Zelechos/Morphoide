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
 * @since 20.0.0 2025-09-29
 */
public class Morphoide {

//---------------------------------------------------------------
//|                                                             |
//|                       MORPH FIELDS                          |
//|                                                             |
//---------------------------------------------------------------
    private final int ONE_TO_AOS = 1;
    private final int ZERO_TO_AOS = 0;
    private final Pattern specialCharacter = Pattern.compile("[\\s,:.;!@#$%&*()_+=|<>?{}\\[\\]~-]");
    private Object responseMorph;

    private Morphoide(Object responseMorph) {
        this.responseMorph = responseMorph;
    }

    public static <E> Morphoide meta() {
        return new Morphoide(null);
    }

    public static Morphoide meta(Object morph) {
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
     * @since v.0.3.8
     * @return String "rehte"
     */
    public Morphoide reverseString() {
        this.responseMorph = reverseString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para invertir los caracteres de un String
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @param text   "key : value"
     * @param symbol ":"
     * @return String[] ["key" , "value"]
     */
    public Morphoide separationBySymbol(String text, String symbol) {
        boolean validation = containsSpecialCharacter(text).morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = text.split(symbol);
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una List
     *
     * @since v.0.3.8
     * @param text   "key : value"
     * @param symbol ":"
     * @return List ["key" , "value"]
     */
    public Morphoide separationBySymbolToList(String text, String symbol) {

        boolean validation = containsSpecialCharacter(text).morph();

        if (!validation) {
            throw new Error("The text " + text + " don't have a Special Character like : ,:.;!@#$%&*()_+=|<>?{}[]~-");
        }

        this.responseMorph = Arrays.asList(text.split(symbol));
        return this;
    }


    /**
     * Subrutina para separar dos valores comprendidos
     * entre un caracter especial e introducirlos en una String[]
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "ava"
     */
    public Morphoide removeInitialCharacter() {
        this.responseMorph = removeInitialCharacter(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para eliminar el primer caracter de
     * un String
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "jav"
     */
    public Morphoide removeFinalCharacter() {
        this.responseMorph = removeFinalCharacter(this.responseMorph.toString())
                .morph();
        return this;
    }


    /**
     * Subrutina para eliminar el ultimo caracter de
     * un String
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "av"
     */
    public Morphoide removeInitialAndFinalCharacter() {
        this.responseMorph = removeInitialCharacter()
                .removeFinalCharacter()
                .morph();
        return this;
    }

    /**
     * Subrutina para eliminar el primer y ultimo caracter de
     * un String
     *
     * @since v.0.3.8
     * @param text "java"
     * @return String "av"
     */
    public Morphoide removeInitialAndFinalCharacter(String text) {
        this.responseMorph = removeInitialCharacter(text)
                .removeFinalCharacter()
                .morph();
        return this;
    }


    /**
     * Subrutina para guardar todas las letras de una
     * String en una List
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "H"
     */
    public Morphoide getFirstCharacterFromString() {
        this.responseMorph = getFirstCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para obtener el ultimo caracter de un String
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "H"
     */
    public Morphoide getLastCharacterFromString() {
        this.responseMorph = getLastCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @param text "morphoide"
     * @return String "Morphoide"
     */
    public Morphoide upperCaseFirstCharacter(String text) {
        String currentChar = getFirstCharacterFromString(text).morph();
        this.responseMorph = text.replaceFirst(currentChar, currentChar.toUpperCase());
        return this;
    }


    /**
     * Subrutina para convertir la primera letra de una
     * Morphoide a mayuscula
     *
     * @since v.0.3.8
     * @return String "Morphoide"
     */
    public Morphoide upperCaseFirstCharacter() {
        this.responseMorph = upperCaseFirstCharacter(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @since v.0.3.8
     * @param text "morphoide"
     * @return String "morphoidE"
     */
    public Morphoide upperCaseLastCharacter(String text) {
        int lastPosition = realLength(text).morph();
        String prefix = text.substring(0, lastPosition);
        String lastCharacter = text.substring(lastPosition).toUpperCase();
        this.responseMorph = prefix + lastCharacter;
        return this;
    }


    /**
     * Subrutina para convertir la ultima letra de una
     * string a mayuscula
     *
     * @since v.0.3.8
     * @return String "morphoidE"
     */
    public Morphoide upperCaseLastCharacter() {
        this.responseMorph = upperCaseLastCharacter(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para dividir a la mitad un String y devolver cada
     * parte en un List siempre y cuando la longitud sea Par
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return List ["morp","hoid"]
     */
    public Morphoide splitStringInTwo() {
        this.responseMorph = splitStringInTwo(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsLowerCase() {
        this.responseMorph = containsLowerCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsUpperCase() {
        this.responseMorph = containsUpperCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsNumber() {
        this.responseMorph = containsNumber(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene un caracter especial
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsUpperLowerAndNumber() {
        this.responseMorph = containsUpperLowerAndNumber(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @since v.0.3.8
     * @param text "Morphoid9"
     * @return boolean true
     */
    public Morphoide containsUpperLowerAndNumber(String text) {
        this.responseMorph = (containsUppercaseAndLowercase(text).morph(Boolean.class) && containsNumber(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsUpperLowerAndSpecial() {
        this.responseMorph = containsUpperLowerAndSpecial(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene almenos un letra minuscula y
     * una letra mayuscula y un numero
     *
     * @since v.0.3.8
     * @param text "Morphoid9"
     * @return boolean true
     */
    public Morphoide containsUpperLowerAndSpecial(String text) {
        this.responseMorph = (containsUppercaseAndLowercase(text).morph(Boolean.class) && containsSpecialCharacter(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un caracter especial y
     * un numero
     *
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide containsNumberAndSpecial() {
        this.responseMorph = containsNumberAndSpecial(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene almenos un caracter especial y
     * un numero
     *
     * @since v.0.3.8
     * @param text "morphoid9*"
     * @return boolean true
     */
    public Morphoide containsNumberAndSpecial(String text) {
        this.responseMorph = (containsSpecialCharacter(text).morph(Boolean.class) && containsNumber(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para saber si el Morphoide tiene almenos un caracter especial y
     * un numero, minusculas, mayusculas
     *
     * @since v.0.3.8
     * @return boolean true
     */
    public Morphoide hasUpperLowerNumberAndSpecial() {
        this.responseMorph = hasUpperLowerNumberAndSpecial(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene almenos un caracter especial y
     * un numero, minusculas, mayusculas
     *
     * @since v.0.3.8
     * @param text "Morphoid9*"
     * @return boolean true
     */
    public Morphoide hasUpperLowerNumberAndSpecial(String text) {
        this.responseMorph = (containsNumberAndSpecial(text).morph(Boolean.class) && containsUppercaseAndLowercase(text).morph(Boolean.class));
        return this;
    }


    /**
     * Subrutina para eliminas los espacios en un String
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
     * @return String "HolaJava"
     */
    public Morphoide cleanSpacesOfString() {
        this.responseMorph = cleanSpacesOfString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para validar un password
     *
     * @since v.0.3.8
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

        this.responseMorph = hasUpperLowerNumberAndSpecial(text).morph(Boolean.class);
        return this;

    }


//---------------------------------------------------------------
//|                         MORPH LIST                          |
//---------------------------------------------------------------


    /**
     * Subrutina para devolver una List con elementos unicos
     *
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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
     * @since v.0.3.8
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