package ejer4;

import java.util.Arrays;

/**
 * Práctica de clase 4
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
 *   * Carga el array número con valores aleatorios entre 0 y 100.
 *   * En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 *      número.
 *   * En el array cubo se deben almacenar los cubos de los valores que hay en numero.
 *   * A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numero[i]* numero[i];
        }

        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        System.out.println("Numero " + "Cuadrado" + " Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + " " + " " + " " + " " + " " + cuadrado[i] + " " + " " + " " + " " + " " + cubo[i] );
        }


    }
}
