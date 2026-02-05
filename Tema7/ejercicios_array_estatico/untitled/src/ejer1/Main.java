package ejer1;
import java.util.Arrays;

/**
 * Práctica de clase 1
 * Comprueba que sucede si hay valores sin una asignación
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        int [] num = new int [12];
        num[0] = 39;
        num[1] = 2;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        /**
         * Pone los valores no dados a 0
         */
        System.out.println(Arrays.toString(num));
    }
}
