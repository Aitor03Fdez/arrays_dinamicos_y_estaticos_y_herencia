package ejer7;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Práctica de clase 7
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto
 * con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
