package ejer9;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Práctica de clase 8
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[101];
        /**
         * recoje los numeroas aleatorios
         */
        for (int i = 0; i <= 100; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nDime el numero que quieras cambiar:");
        int numBuscar = sc.nextInt();

        System.out.println("Dime por cual deseas cambiarlo:");
        int numNuevo = sc.nextInt();
        /**
         * Intercambia los numeros
         */
        for  (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar) {
                numeros[i] = numNuevo;
            }
        }
        System.out.print(Arrays.toString(numeros));
    }
}
