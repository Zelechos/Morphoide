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
        
        System.out.println(" texto => " + testText + 
                "\n longitud : " + array.length + 
                "\n primer valor : " + array[0] + 
                "\n segundo valor : "+array[1]);
        
        
        /**
         * @function el metodo nos devolvera un String con sus caracteres 
         * invertidos.
         * @param testText1
         * @return String
         */
        
        System.out.println("----------------- reverseString(); --------------------");
        String testText1 = "java";
        String response = Morphoide.reverseString(testText1);
        
        System.out.println(" texto => " + testText1 +
                "\n texto invertido : " + response);
        
        
    }
    
}
