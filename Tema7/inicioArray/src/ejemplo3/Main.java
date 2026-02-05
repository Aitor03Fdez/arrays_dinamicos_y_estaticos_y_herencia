package ejemplo3;

/**
 * Suma de numeros de valores de un array
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Suma de array unidimensional
         */

        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = num[2] + num[3] + num[5];

        System.out.println("Resultado: " + total);


        /**
         * Suma en array multidimensional
         */

        //1
        int [][] sumaBi = new int[2][2];
        sumaBi[0][0] = 1;
        sumaBi[0][1] = 2;
        sumaBi[1][0] = 3;
        sumaBi[1][1] = 4;

        System.out.println("Resultado: " + sumaBi[1][1]);

        //2
        int [][] sumaMulti = {
                {1 , 2},
                {3 , 4}
        };

        System.out.println("Resultado: " + sumaMulti[1][0]);
    }
}
