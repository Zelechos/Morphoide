/**
 * Class to execute all the methods of the Morphoide library
 * @author: Pragmatic Coder
 * @repository: https://github.com/Zelechos/PragmaticMorphoide
 */

package testmorphoide;

import morphoide.Morphoide;

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
        
        System.out.println(" texto de entrada => " + testText + 
                "\n longitud del array : " + array.length + 
                "\n primer valor : " + array[0] + 
                "\n segundo valor : "+array[1]);
        
        
        /**
         * @function el metodo nos devolvera un String con sus caracteres 
         * invertidos.
         * @param testText1
         * @return String
         */
        
        System.out.println("----------------- reverseString(); --------------------");
        String testText1 = "Morphoide";
        String response = Morphoide.reverseString(testText1);
        
        System.out.println(" texto de entrada => " + testText1 +
                "\n texto invertido : " + response);
        
        
        
        System.out.println("----------------- returnValueString(); --------------------");
        /**
         * @function el metodo nos devolvera el valor de una cadena separada por dos puntos
         * de manera que ese valor sera recuperado ("key : value") en este caso solo sera 
         * recuperado "value"
         * @param testText2
         * @return String
         */
        
        String testText2 = "name : Morphoide";
        String response1  = Morphoide.returnValueString(testText2);
        System.out.println(" texto de entrada => " + testText2 +
                "\n recuperamos su valor : " + response1);
        
        
    }
    
}
