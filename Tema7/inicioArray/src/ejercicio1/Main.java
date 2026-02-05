package ejercicio1;
import java.util.Arrays;
/**
 * Sumar uno a cada valor de un array en un metodo diferente
 * @author A.FM.S
 */
public class Main {

    public static int [] sumaUno(int [] array) {
        //int [] arrayMetodo = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        return array;

    }

    public static void main(String[] args) {

        int [] arrayBase = {1, 2, 3, 4};
        System.out.println("Inicio: " + Arrays.toString(arrayBase));

        int [] resultado = sumaUno(arrayBase);
        //System.out.println("Inicio: " + arrayBase[0] +  " " + arrayBase[1] +  " " + arrayBase[2] +   " " + arrayBase[3]);
        System.out.println("Resultado: " + Arrays.toString(resultado));


        /**
         * .sort ordena el array
         * .binarySearch te da el contenido de la posición dada
         */
        int [] arrayDesordenado = {4, 6, 3, 2, 1};
        Arrays.sort(arrayDesordenado);
        System.out.println("Desordenado: " + Arrays.toString(arrayDesordenado));
        System.out.println("Desordenado: " + Arrays.binarySearch(arrayDesordenado, 4));


    }


}
