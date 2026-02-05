import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad");
        int edad = sc.nextInt();
        String salida = String.format("Mi nombre es %s y tengo %d años de edad", nombre, edad);
        System.out.print(salida);
    }
}
