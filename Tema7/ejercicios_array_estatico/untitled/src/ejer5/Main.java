package ejer5;
import java.util.Arrays;

/**
 * Práctica de clase 5
 * Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matriz));
    }
}
