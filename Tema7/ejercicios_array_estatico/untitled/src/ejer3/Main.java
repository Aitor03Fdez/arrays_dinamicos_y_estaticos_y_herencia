package ejer3;
import java.util.Arrays;

/**
 * Practica de clase 3
 * Escribe un programa que el primero en introducirse es el ultimo en mostrarse
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        int [] array = {3, 5, 7, 9, 3, 0};
        int [] array2 = new int[array.length];
        int suma = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            array2[suma] = array[i];
            suma--;
        }

        System.out.println(Arrays.toString(array2));
    }


}

