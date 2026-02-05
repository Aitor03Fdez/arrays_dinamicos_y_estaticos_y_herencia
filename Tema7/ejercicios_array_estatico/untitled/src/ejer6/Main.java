package ejer6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Práctica de clase 6
 * Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y
 * 10.
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la opcion: ");
        int n = sc.nextInt();
        int [][] array = new int[5][n];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int)(Math.random() * 100) + 1;
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
