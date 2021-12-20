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
         * @function metodo nos devolvera un array de tipo de String 
         * con los valores que estan separados por los dos puntos ":"
         * @param testText
         * @return String[]
         * 
         */
        
        String testText = "Library : Morphoide";
        String[] array = Morphoide.separationByTwoPoints(testText);
        
        System.out.println(" texto => " + testText + 
                "\n longitud : " + array.length + 
                "\n primer valor : " + array[0] + 
                "\n segundo valor : "+array[1]);
        
        
    }
    
}
