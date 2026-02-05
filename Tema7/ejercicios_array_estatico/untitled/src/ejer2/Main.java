package ejer2;
import java.util.Arrays;

/**
 * Práctica de clase 2
 * Comprueba lo mismo que el primero pero con caracteres
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        char [] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        /**
         * Pone un simbolo diferente haciendo referencia a vacio
         */
        System.out.println(Arrays.toString(simbolo));
    }
}
