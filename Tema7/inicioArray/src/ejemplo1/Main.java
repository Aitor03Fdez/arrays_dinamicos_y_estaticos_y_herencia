package ejemplo1;

public class Main {
    public  static void main(String[] args) {
        int [] ejemploArray = new int [3];

        /**
         * asigno
         */
        ejemploArray[0] = 1;
        ejemploArray[1] = 3;
        ejemploArray[2] = 5;

        /**
         * Acceder
         */
        int valor1 = ejemploArray[0];
        System.out.println("Ejemplo 1: " + valor1);
        System.out.println("Ejemplo 1: " + ejemploArray[0]);

    }
}
