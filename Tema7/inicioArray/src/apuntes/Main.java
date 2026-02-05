package apuntes;

import java.util.Arrays;

/**
 * Main con apuntes varios de arrays
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        /**
         * .sort ordena el array
         * .binarySearch te da el contenido de la posición dada
         */
        System.out.println("Metodo sort y binarySearch");
        int [] arrayDesordenado = {4, 6, 3, 2, 1};
        Arrays.sort(arrayDesordenado);
        System.out.println("Desordenado: " + Arrays.toString(arrayDesordenado));
        System.out.println("Desordenado: " + Arrays.binarySearch(arrayDesordenado, 4));

        /**
         * array clone
         */
        System.out.println("Metodo arrayClone");
        int [] array = {15, 30, 14, 25};
        int [] arrayClonado = array.clone();
        arrayClonado[0] = 0;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(arrayClonado[0]);

        /**
         * copy of
         * copy of range
         */
        System.out.println("Metodo copyOf y copyOfRange");
        int [] arrayBase = {3,7,9,4,2,5,7};
        //copia hasta la posición dada
        int [] arrayCopy = Arrays.copyOf(arrayBase, 3);
        //copia desde la dada hasta la dada, esta última no la cuenta
        int [] arrayCopyRange = Arrays.copyOfRange(arrayBase, 3, arrayBase.length);
        System.out.println(Arrays.toString(arrayCopy) + "\n" +  Arrays.toString(arrayCopyRange));

        /**
         * metodo system.arrayCopu
         */
        System.out.println("Metodo system.arrayCopy");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] array2 = new int[8];

        System.arraycopy(array1, 4, array2, 1, 3);
        System.out.println(Arrays.toString(array2));
    }
}
