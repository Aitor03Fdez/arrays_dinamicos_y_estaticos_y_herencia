package prac_clase;
import java.util.Arrays;

/**
 * Práctica de clase, meter impares de un array a otro (sin que cuente los 0)
 * @author A.FM.S
 */
public class Prueba2 {
    public static void main(String[] args) {
        int [] array1 = {3,5,2,4,6,9};
        int contador = 0;
        /**
         * Saca el número de impares del arrray para hacer un array con esa longitud
         */
        for (int i = 0; i < array1.length; i++){

            if (!(array1[i] % 2 == 0)){
                contador++;
            }
        }
        int [] array2 = new int [contador];
        int j = 0;
        /**
         * Mete unicamente los impares del array1 en el array2
         */
        for (int i = 0; i < array1.length; i++){

            if (!(array1[i] % 2 == 0)){
                array2[j] = array1[i];
                j++;
            }

        }
        System.out.println("Array1" + Arrays.toString(array1));
        System.out.println("Array2" + Arrays.toString(array2));

    }
}
