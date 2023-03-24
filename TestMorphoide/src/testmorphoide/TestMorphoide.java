package testmorphoide;

import morphoide.Morphoide;

import java.util.List;

/**
 * Class to test all the methods of the Morphoide library
 *
 * @author Alex T. H.
 * @version v0.1.5
 * @see <a href="https://github.com/Zelechos/PragmaticMorphoide">PragmaticMorphoide</a>
 * @since 19.0.1
 */
public class TestMorphoide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /**
         * @function el metodo nos devolvera un array de tipo de String 
         * con los valores que estan separados por los dos puntos ":"
         * @param testText
         * @return String[]
         */

        System.out.println("----------------- separationByTwoPoints(); --------------------");
        String testText = "Library : Morphoide";
        String[] array = Morphoide.separationByTwoPoints(testText);

        System.out.println(" texto de entrada => " + testText + "\n longitud del array : " + array.length + "\n primer valor : " + array[0] + "\n segundo valor : " + array[1]);


        /**
         * @function el metodo nos devolvera un String con sus caracteres 
         * invertidos.
         * @param testText1
         * @return String
         */

        System.out.println("----------------- reverseString(); --------------------");
        String testText1 = "Morphoide";
        String response = Morphoide.reverseString(testText1);

        System.out.println(" texto de entrada => " + testText1 + "\n texto invertido : " + response);


        System.out.println("----------------- returnValueString(); --------------------");
        /**
         * @function el metodo nos devolvera el valor de una cadena separada por dos puntos
         * de manera que ese valor sera recuperado ("key : value") en este caso solo sera 
         * recuperado "value"
         * @param testText2
         * @return String
         */

        String testText2 = "name : Morphoide";
        String response1 = Morphoide.returnValueString(testText2);
        System.out.println(" texto de entrada => " + testText2 + "\n recuperamos su valor : " + response1);


        System.out.println("----------------- returnKeyString(); --------------------");
        /**
         * @function el metodo nos devolvera la llave de una cadena separada por dos puntos
         * de manera que esa llave sera recuperada ("key : value") en este caso solo sera 
         * recuperado "key"
         * @param testText3
         * @return String
         */

        String testText3 = "library : Morphoide";
        String response2 = Morphoide.returnKeyString(testText3);
        System.out.println(" texto de entrada => " + testText3 + "\n recuperamos su llave : " + response2);


        System.out.println("----------------- stringDestruction(); --------------------");
        /**
         * @function el metodo nos devolvera las letras de la cadena 
         * introducida dentro de la list
         * recuperado "[t,e,x,t,o]"
         * @param testText4
         * @return List
         */
        String testText4 = "Pragmatic Coder";
        List response3 = Morphoide.stringDestruction(testText4);
        System.out.println(" texto de entrada => " + testText4 + "\n recuperamos las letras en un List : " + response3);


        System.out.println("----------------- stringConstruction(); --------------------");
        /**
         * @function el metodo nos devolvera una cadena con los elementos que estaban 
         * dentro de un List de Tipo String
         * recuperado "texto"
         * @param listText
         * @return String
         */

        // Creamos un array para realizar la prueba
        String[] listText = new String[]{"M", "o", "r", "p", "h", "o", "i", "d", "e"};

        // Creamos un string para mostrar los elementos del array        
        String showListText = "[";
        for (int letra = 0; letra < listText.length; letra++) {
            showListText += listText[letra] + ",";
        }
        showListText += "]";

        String response4 = Morphoide.stringConstruction(listText);
        System.out.println(" Array de entrada => " + showListText + "\n recuperamos la cadena : " + response4);


        System.out.println("----------------- stringReverseDestruction(); --------------------");
        /**
         * @function el metodo nos devolvera una cadena con los elementos invertidos que
         * estaban dentro de un List de Tipo String
         * recuperado "otxet" => [o,t,x,e,t]
         * @param testText5
         * @return String
         */

        String testText5 = "Pragmatic Coder";
        List response5 = Morphoide.stringReverseDestruction(testText5);
        System.out.println(" texto de entrada => " + testText5 + "\n recuperamos las letras invertidas en un List : " + response5);


        System.out.println("----------------- stringReverseConstruction(); --------------------");
        /**
         * @function el metodo nos devolvera una cadena con los elementos que estaban 
         * dentro de un List invertidos de Tipo String
         * recuperado [t,e,x,t,o] => "otxet"
         * @param listText1
         * @return String
         */

        // Creamos un array para realizar la prueba
        String[] listText1 = new String[]{"M", "o", "r", "p", "h", "o", "i", "d", "e"};

        // Creamos un string para mostrar los elementos del array        
        String showListText2 = "[";
        for (int letra = 0; letra < listText.length; letra++) {
            showListText2 += listText[letra] + ",";
        }
        showListText2 += "]";

        String response6 = Morphoide.stringReserveConstruction(listText1);
        System.out.println(" Array de entrada => " + showListText2 + "\n recuperamos la cadena con los elementos invertidos : " + response6);


        System.out.println("----------------- getACharacterFromString(); --------------------");
        String exampleString = "Hello";
        System.out.println(Morphoide.getACharacterFromString(exampleString, 4));


        System.out.println("----------------- getALastCharacterFromString(); --------------------");
        String exampleString1 = "Hellos";
        System.out.println(Morphoide.getALastCharacterFromString(exampleString1));

        System.out.println("----------------- getAFirstCharacterFromString(); --------------------");
        String exampleString2 = "Hello";
        System.out.println(Morphoide.getAFirstCharacterFromString(exampleString2));

        System.out.println("----------------- isCapicua(); --------------------");
        String exampleString3 = "solos";
        System.out.println(Morphoide.isCapicua(exampleString3));

        System.out.println("----------------- lengthIsPar(); --------------------");
        String exampleString4 = "Morphoid";
        System.out.println(exampleString4.length());
        System.out.println(Morphoide.lengthIsPair(exampleString4));

        System.out.println("----------------- lengthIsImpar(); --------------------");
        System.out.println(Morphoide.lengthIsOdd(exampleString4));

        System.out.println("----------------- upperCaseFirstCharacter(); --------------------");
        System.out.println(Morphoide.upperCaseFirstCharacter(exampleString3));

        System.out.println("----------------- upperCaseLastCharacter(); --------------------");
        System.out.println(Morphoide.upperCaseLastCharacter(exampleString3));

        System.out.println("----------------- splitStringInTwo(); --------------------");
        System.out.println(Morphoide.splitStringInTwo(exampleString3));
        System.out.println(Morphoide.splitStringInTwo(exampleString4));


//---------------------------------------------------------------
//|                                                             |
//|                         MORPH LIST                          |
//|                                                             |
//---------------------------------------------------------------
        List<String> list = List.of("java", "java", "rust", "javascript", "javascript");
        System.out.println("----------------- getListOfUniqueElements(); --------------------");
        System.out.println(Morphoide.getListOfUniqueElements(list));
        
    }

}
