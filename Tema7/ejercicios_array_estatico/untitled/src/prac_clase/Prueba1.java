package prac_clase;
import java.util.Arrays;
/**
 * Práctica de clase, meter impares de un array a otro
 * @author A.FM.S
 */
public class Prueba1 {
    public static void main(String[] args) {
        int [] array1 = {3,5,2,4,6,9};
        int [] array2 = new int[array1.length];
        /**
         * Comprueba los impares del array1 y los mete en el segundo
         * Cuando no cumple añade un 0
         */
        for (int i = 0; i < array1.length; i++){

            if (!(array1[i] % 2 == 0)){
                array2[i] = array1[i];
            }
        }

        System.out.println("Array1" + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}
