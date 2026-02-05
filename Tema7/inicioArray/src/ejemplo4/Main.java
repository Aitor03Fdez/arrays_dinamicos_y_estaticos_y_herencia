package ejemplo4;

import java.util.Arrays;

/**
 * Recorrer array multidimensional
 * @author A.FM.S
 */

public class Main {
    public static void main(String[] args) {
        int [][] sumaMulti = {
                {1 , 2},
                {3 , 4}
        };
        System.out.println("Inicio: " + Arrays.deepToString(sumaMulti));
        for (int i = 0; i < sumaMulti.length; i++) {
            for (int j = 0; j < sumaMulti.length; j++) {
                System.out.print(sumaMulti[i][j] + " ");
            }

        }
    }
}
