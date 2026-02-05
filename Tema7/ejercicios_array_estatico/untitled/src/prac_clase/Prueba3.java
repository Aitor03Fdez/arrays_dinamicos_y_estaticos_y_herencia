package prac_clase;
import java.util.Arrays;

/**
 * Prueba de clase
 * busqueda lineal y binaria
 * @author A.FM.S
 */
public class Prueba3 {
    /**
     * Si devuelve -1 esq no lo ha encontrado
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int numero = 9;

        int posicion = busquedaLineal(array, numero);
        int posicion2 = busquedaBinaria(array, numero);

        System.out.println(posicion);
        System.out.println(posicion2);

    }

    /**
     * Búsqueda lineal con un for, recorre uno a uno
     * @param array
     * @param numero
     * @return
     */
    public static int busquedaLineal(int [] array,int numero){

        for  (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Búsqueda binaria, se usa un while.
     * En esta búsqueda es importante q el array este ordenado
     * @param array
     * @param numero
     * @return
     */
    public static int busquedaBinaria(int [] array,int numero){
        int izq = 0;
        int der = array.length - 1;

        while (izq <= der) {
            int medio =  (izq + der) / 2;
            if (array[medio] == numero) {
                return medio;
            }
            if (array[medio] < numero) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }

        return -1;
    }
}
