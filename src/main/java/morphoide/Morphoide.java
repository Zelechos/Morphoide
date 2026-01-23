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
 * @version v0.3.9
 * @see <a href="https://github.com/Zelechos/Morphoide">Morphoide</a>
 * @since 20.0.0 2026-01-23
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
     * @since v.0.3.9
     * @return String "rehte"
     */
    public Morphoide reverseString() {
        this.responseMorph = reverseString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para invertir los caracteres de un String
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return String "H"
     */
    public Morphoide getFirstCharacterFromString() {
        this.responseMorph = getFirstCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para obtener el ultimo caracter de un String
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return String "H"
     */
    public Morphoide getLastCharacterFromString() {
        this.responseMorph = getLastCharacterFromString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si un String es Capicua
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return List ["morp","hoid"]
     */
    public Morphoide splitStringInTwo() {
        this.responseMorph = splitStringInTwo(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @since v.0.3.9
     * @return boolean true
     */
    public Morphoide containsLowerCase() {
        this.responseMorph = containsLowerCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra minuscula
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return boolean true
     */
    public Morphoide containsUpperCase() {
        this.responseMorph = containsUpperCase(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene una letra mayuscula
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return boolean true
     */
    public Morphoide containsNumber() {
        this.responseMorph = containsNumber(this.responseMorph.toString()).morph(Boolean.class);
        return this;
    }

    /**
     * Subrutina para saber si el texto tiene un caracter especial
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return String "HolaJava"
     */
    public Morphoide cleanSpacesOfString() {
        this.responseMorph = cleanSpacesOfString(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Subrutina para validar un password
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
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
//|                   MORPH SORTING ALGORITHMS                  |
//---------------------------------------------------------------


    /**
     * Subrutina para ordenar una lista usando el algoritmo Bubble Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide bubbleSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        int n = sortedList.size();
        for (int i = ZERO_TO_AOS; i < n - ONE_TO_AOS; i++) {
            for (int j = ZERO_TO_AOS; j < n - i - ONE_TO_AOS; j++) {
                if (sortedList.get(j) > sortedList.get(j + ONE_TO_AOS)) {
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + ONE_TO_AOS));
                    sortedList.set(j + ONE_TO_AOS, temp);
                }
            }
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Bubble Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide bubbleSort() {
        this.responseMorph = bubbleSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Quick Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide quickSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        quickSortHelper(sortedList, ZERO_TO_AOS, sortedList.size() - ONE_TO_AOS);
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Quick Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide quickSort() {
        this.responseMorph = quickSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Merge Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide mergeSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        if (sortedList.size() > ONE_TO_AOS) {
            mergeSortHelper(sortedList, ZERO_TO_AOS, sortedList.size() - ONE_TO_AOS);
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Merge Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide mergeSort() {
        this.responseMorph = mergeSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Insertion Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide insertionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        for (int i = ONE_TO_AOS; i < sortedList.size(); i++) {
            int key = sortedList.get(i);
            int j = i - ONE_TO_AOS;
            while (j >= ZERO_TO_AOS && sortedList.get(j) > key) {
                sortedList.set(j + ONE_TO_AOS, sortedList.get(j));
                j--;
            }
            sortedList.set(j + ONE_TO_AOS, key);
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Insertion Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide insertionSort() {
        this.responseMorph = insertionSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Selection Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide selectionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        int n = sortedList.size();
        for (int i = ZERO_TO_AOS; i < n - ONE_TO_AOS; i++) {
            int minIdx = i;
            for (int j = i + ONE_TO_AOS; j < n; j++) {
                if (sortedList.get(j) < sortedList.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = sortedList.get(minIdx);
            sortedList.set(minIdx, sortedList.get(i));
            sortedList.set(i, temp);
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Selection Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide selectionSort() {
        this.responseMorph = selectionSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Heap Sort
     *
     * @since v.0.3.9
     * @param list [5, 2, 8, 1, 9]
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide heapSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        int n = sortedList.size();
        for (int i = n / 2 - ONE_TO_AOS; i >= ZERO_TO_AOS; i--) {
            heapify(sortedList, n, i);
        }
        for (int i = n - ONE_TO_AOS; i > ZERO_TO_AOS; i--) {
            int temp = sortedList.get(ZERO_TO_AOS);
            sortedList.set(ZERO_TO_AOS, sortedList.get(i));
            sortedList.set(i, temp);
            heapify(sortedList, i, ZERO_TO_AOS);
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar una lista usando el algoritmo Heap Sort
     *
     * @since v.0.3.9
     * @return List [1, 2, 5, 8, 9]
     */
    public Morphoide heapSort() {
        this.responseMorph = heapSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


//---------------------------------------------------------------
//|                   MORPH SEARCH ALGORITHMS                   |
//---------------------------------------------------------------


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Binary Search
     *
     * @since v.0.3.9
     * @param list   [1, 2, 5, 8, 9]
     * @param target 5
     * @return int 2 (index del elemento, -1 si no existe)
     */
    public Morphoide binarySearch(List<Integer> list, int target) {
        int left = ZERO_TO_AOS;
        int right = list.size() - ONE_TO_AOS;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == target) {
                this.responseMorph = mid;
                return this;
            }
            if (list.get(mid) < target) {
                left = mid + ONE_TO_AOS;
            } else {
                right = mid - ONE_TO_AOS;
            }
        }
        this.responseMorph = -ONE_TO_AOS;
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Binary Search
     *
     * @since v.0.3.9
     * @param target 5
     * @return int 2 (index del elemento, -1 si no existe)
     */
    public Morphoide binarySearch(int target) {
        this.responseMorph = binarySearch((List<Integer>) this.responseMorph, target).morph();
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista usando Linear Search
     *
     * @since v.0.3.9
     * @param list   [5, 2, 8, 1, 9]
     * @param target 8
     * @return int 2 (index del elemento, -1 si no existe)
     */
    public Morphoide linearSearch(List<Integer> list, int target) {
        for (int i = ZERO_TO_AOS; i < list.size(); i++) {
            if (list.get(i) == target) {
                this.responseMorph = i;
                return this;
            }
        }
        this.responseMorph = -ONE_TO_AOS;
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista usando Linear Search
     *
     * @since v.0.3.9
     * @param target 8
     * @return int 2 (index del elemento, -1 si no existe)
     */
    public Morphoide linearSearch(int target) {
        this.responseMorph = linearSearch((List<Integer>) this.responseMorph, target).morph();
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Jump Search
     *
     * @since v.0.3.9
     * @param list   [1, 2, 5, 8, 9, 12, 15, 20]
     * @param target 9
     * @return int 4 (index del elemento, -1 si no existe)
     */
    public Morphoide jumpSearch(List<Integer> list, int target) {
        int n = list.size();
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = ZERO_TO_AOS;
        while (list.get(Math.min(step, n) - ONE_TO_AOS) < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                this.responseMorph = -ONE_TO_AOS;
                return this;
            }
        }
        while (list.get(prev) < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                this.responseMorph = -ONE_TO_AOS;
                return this;
            }
        }
        if (list.get(prev) == target) {
            this.responseMorph = prev;
            return this;
        }
        this.responseMorph = -ONE_TO_AOS;
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Jump Search
     *
     * @since v.0.3.9
     * @param target 9
     * @return int 4 (index del elemento, -1 si no existe)
     */
    public Morphoide jumpSearch(int target) {
        this.responseMorph = jumpSearch((List<Integer>) this.responseMorph, target).morph();
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Interpolation Search
     *
     * @since v.0.3.9
     * @param list   [1, 2, 5, 8, 9, 12, 15, 20]
     * @param target 12
     * @return int 5 (index del elemento, -1 si no existe)
     */
    public Morphoide interpolationSearch(List<Integer> list, int target) {
        int low = ZERO_TO_AOS;
        int high = list.size() - ONE_TO_AOS;
        while (low <= high && target >= list.get(low) && target <= list.get(high)) {
            if (low == high) {
                if (list.get(low) == target) {
                    this.responseMorph = low;
                    return this;
                }
                this.responseMorph = -ONE_TO_AOS;
                return this;
            }
            int pos = low + ((target - list.get(low)) * (high - low)) / (list.get(high) - list.get(low));
            if (list.get(pos) == target) {
                this.responseMorph = pos;
                return this;
            }
            if (list.get(pos) < target) {
                low = pos + ONE_TO_AOS;
            } else {
                high = pos - ONE_TO_AOS;
            }
        }
        this.responseMorph = -ONE_TO_AOS;
        return this;
    }


    /**
     * Subrutina para buscar un elemento en una lista ordenada usando Interpolation Search
     *
     * @since v.0.3.9
     * @param target 12
     * @return int 5 (index del elemento, -1 si no existe)
     */
    public Morphoide interpolationSearch(int target) {
        this.responseMorph = interpolationSearch((List<Integer>) this.responseMorph, target).morph();
        return this;
    }


//---------------------------------------------------------------
//|                MORPH MATHEMATICAL ALGORITHMS                |
//---------------------------------------------------------------


    /**
     * Subrutina para verificar si un numero es primo
     *
     * @since v.0.3.9
     * @param number 17
     * @return boolean true
     */
    public Morphoide isPrime(int number) {
        if (number <= ONE_TO_AOS) {
            this.responseMorph = false;
            return this;
        }
        if (number <= 3) {
            this.responseMorph = true;
            return this;
        }
        if (number % 2 == ZERO_TO_AOS || number % 3 == ZERO_TO_AOS) {
            this.responseMorph = false;
            return this;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == ZERO_TO_AOS || number % (i + 2) == ZERO_TO_AOS) {
                this.responseMorph = false;
                return this;
            }
        }
        this.responseMorph = true;
        return this;
    }


    /**
     * Subrutina para verificar si un numero es primo
     *
     * @since v.0.3.9
     * @return boolean true
     */
    public Morphoide isPrime() {
        this.responseMorph = isPrime((Integer) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para calcular el Maximo Comun Divisor usando el algoritmo de Euclides
     *
     * @since v.0.3.9
     * @param a 48
     * @param b 18
     * @return int 6
     */
    public Morphoide gcd(int a, int b) {
        while (b != ZERO_TO_AOS) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        this.responseMorph = a;
        return this;
    }


    /**
     * Subrutina para calcular el Minimo Comun Multiplo
     *
     * @since v.0.3.9
     * @param a 12
     * @param b 18
     * @return int 36
     */
    public Morphoide lcm(int a, int b) {
        this.responseMorph = (a * b) / gcd(a, b).morph(Integer.class);
        return this;
    }


    /**
     * Subrutina para calcular la exponenciacion modular (base^exp) % mod
     *
     * @since v.0.3.9
     * @param base 2
     * @param exp  10
     * @param mod  1000
     * @return int 24
     */
    public Morphoide powerMod(int base, int exp, int mod) {
        int result = ONE_TO_AOS;
        base = base % mod;
        while (exp > ZERO_TO_AOS) {
            if (exp % 2 == ONE_TO_AOS) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        this.responseMorph = result;
        return this;
    }


    /**
     * Subrutina para encontrar todos los numeros primos hasta n usando la Criba de Eratostenes
     *
     * @since v.0.3.9
     * @param n 30
     * @return List [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
     */
    public Morphoide sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + ONE_TO_AOS];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }
        this.responseMorph = primes;
        return this;
    }


//---------------------------------------------------------------
//|            MORPH NUMBER THEORY & SEQUENCE ALGORITHMS        |
//---------------------------------------------------------------


    /**
     * Subrutina para generar la secuencia de Collatz (3n+1 problem)
     *
     * @since v.0.3.9
     * @param number 10
     * @return List [10, 5, 16, 8, 4, 2, 1]
     */
    public Morphoide collatzSequence(int number) {
        List<Integer> sequence = new ArrayList<>();
        while (number != ONE_TO_AOS) {
            sequence.add(number);
            if (number % 2 == ZERO_TO_AOS) {
                number = number / 2;
            } else {
                number = 3 * number + ONE_TO_AOS;
            }
        }
        sequence.add(ONE_TO_AOS);
        this.responseMorph = sequence;
        return this;
    }


    /**
     * Subrutina para generar el Triangulo de Pascal hasta n filas
     *
     * @since v.0.3.9
     * @param rows 5
     * @return List [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
     */
    public Morphoide pascalTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = ZERO_TO_AOS; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = ZERO_TO_AOS; j <= i; j++) {
                if (j == ZERO_TO_AOS || j == i) {
                    row.add(ONE_TO_AOS);
                } else {
                    row.add(triangle.get(i - ONE_TO_AOS).get(j - ONE_TO_AOS) + 
                           triangle.get(i - ONE_TO_AOS).get(j));
                }
            }
            triangle.add(row);
        }
        this.responseMorph = triangle;
        return this;
    }


    /**
     * Subrutina para descomponer un numero en sus factores primos
     *
     * @since v.0.3.9
     * @param number 60
     * @return List [2, 2, 3, 5]
     */
    public Morphoide primeFactorization(int number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == ZERO_TO_AOS) {
            factors.add(2);
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == ZERO_TO_AOS) {
                factors.add(i);
                number /= i;
            }
        }
        if (number > 2) {
            factors.add(number);
        }
        this.responseMorph = factors;
        return this;
    }


//---------------------------------------------------------------
//|            MORPH ANALYSIS & STATISTICS ALGORITHMS           |
//---------------------------------------------------------------


    /**
     * Subrutina para encontrar la suma maxima de un subarray contiguo usando el algoritmo de Kadane
     *
     * @since v.0.3.9
     * @param list [-2, 1, -3, 4, -1, 2, 1, -5, 4]
     * @return int 6 (subarray: [4, -1, 2, 1])
     */
    public Morphoide kadaneAlgorithm(List<Integer> list) {
        int maxSoFar = list.get(ZERO_TO_AOS);
        int maxEndingHere = list.get(ZERO_TO_AOS);
        for (int i = ONE_TO_AOS; i < list.size(); i++) {
            maxEndingHere = Math.max(list.get(i), maxEndingHere + list.get(i));
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        this.responseMorph = maxSoFar;
        return this;
    }


    /**
     * Subrutina para encontrar la suma maxima de un subarray contiguo usando el algoritmo de Kadane
     *
     * @since v.0.3.9
     * @return int 6
     */
    public Morphoide kadaneAlgorithm() {
        this.responseMorph = kadaneAlgorithm((List<Integer>) this.responseMorph).morph();
        return this;
    }


    /**
     * Subrutina para ordenar un array con 3 valores distintos (0, 1, 2) usando Dutch National Flag
     *
     * @since v.0.3.9
     * @param list [2, 0, 2, 1, 1, 0]
     * @return List [0, 0, 1, 1, 2, 2]
     */
    public Morphoide dutchFlagSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        int low = ZERO_TO_AOS;
        int mid = ZERO_TO_AOS;
        int high = sortedList.size() - ONE_TO_AOS;
        while (mid <= high) {
            switch (sortedList.get(mid)) {
                case 0:
                    int temp0 = sortedList.get(low);
                    sortedList.set(low, sortedList.get(mid));
                    sortedList.set(mid, temp0);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = sortedList.get(mid);
                    sortedList.set(mid, sortedList.get(high));
                    sortedList.set(high, temp2);
                    high--;
                    break;
            }
        }
        this.responseMorph = sortedList;
        return this;
    }


    /**
     * Subrutina para ordenar un array con 3 valores distintos (0, 1, 2) usando Dutch National Flag
     *
     * @since v.0.3.9
     * @return List [0, 0, 1, 1, 2, 2]
     */
    public Morphoide dutchFlagSort() {
        this.responseMorph = dutchFlagSort((List<Integer>) this.responseMorph).morph();
        return this;
    }


//---------------------------------------------------------------
//|                       MORPHS HELPERS                        |
//---------------------------------------------------------------


    /**
     * Subrutina para recorrer un texto en base a una lambda
     *
     * @since v.0.3.9
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
     * @since v.0.3.9
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
     * @since v.0.3.9
     * @return int 7
     */
    private Morphoide realLength() {
        this.responseMorph = realLength(this.responseMorph.toString()).morph();
        return this;
    }


    /**
     * Helper para QuickSort - particiona la lista
     *
     * @since v.0.3.9
     * @param list lista a particionar
     * @param low  indice inicial
     * @param high indice final
     * @return int indice del pivote
     */
    private void quickSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSortHelper(list, low, pi - ONE_TO_AOS);
            quickSortHelper(list, pi + ONE_TO_AOS, high);
        }
    }


    /**
     * Helper para QuickSort - realiza la particion
     *
     * @since v.0.3.9
     * @param list lista a particionar
     * @param low  indice inicial
     * @param high indice final
     * @return int indice del pivote
     */
    private int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - ONE_TO_AOS;
        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp = list.get(i + ONE_TO_AOS);
        list.set(i + ONE_TO_AOS, list.get(high));
        list.set(high, temp);
        return i + ONE_TO_AOS;
    }


    /**
     * Helper para MergeSort - divide y ordena recursivamente
     *
     * @since v.0.3.9
     * @param list lista a ordenar
     * @param left indice izquierdo
     * @param right indice derecho
     */
    private void mergeSortHelper(List<Integer> list, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(list, left, mid);
            mergeSortHelper(list, mid + ONE_TO_AOS, right);
            merge(list, left, mid, right);
        }
    }


    /**
     * Helper para MergeSort - mezcla dos sublistas ordenadas
     *
     * @since v.0.3.9
     * @param list lista a ordenar
     * @param left indice izquierdo
     * @param mid indice medio
     * @param right indice derecho
     */
    private void merge(List<Integer> list, int left, int mid, int right) {
        int n1 = mid - left + ONE_TO_AOS;
        int n2 = right - mid;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i = ZERO_TO_AOS; i < n1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = ZERO_TO_AOS; j < n2; j++) {
            rightList.add(list.get(mid + ONE_TO_AOS + j));
        }
        int i = ZERO_TO_AOS;
        int j = ZERO_TO_AOS;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftList.get(i) <= rightList.get(j)) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }


    /**
     * Helper para HeapSort - mantiene la propiedad de heap
     *
     * @since v.0.3.9
     * @param list lista a heapificar
     * @param n tamanio del heap
     * @param i indice del nodo raiz
     */
    private void heapify(List<Integer> list, int n, int i) {
        int largest = i;
        int left = 2 * i + ONE_TO_AOS;
        int right = 2 * i + 2;
        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }
        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            int swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);
            heapify(list, n, largest);
        }
    }

//---------------------------------------------------------------
//                     production up to here
//---------------------------------------------------------------
}