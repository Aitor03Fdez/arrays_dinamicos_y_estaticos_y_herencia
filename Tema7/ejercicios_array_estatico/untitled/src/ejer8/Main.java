package ejer8;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Práctica de clase 8
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[15];
        int posicion = array.length-1;
        /**
         * Pido los numeros por pantalla
         */
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        /**
         * asigno el numero de la ultima posicion del array a esa variable
         */
        int ultimo = array[posicion];
        /**
         * aumento en una todas las posiciones
         */
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;

        System.out.print(Arrays.toString(array));

    }
}
