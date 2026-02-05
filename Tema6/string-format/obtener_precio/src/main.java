import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga el precio del producto");
        float precio = sc.nextInt();

        String salida = String.format("Precio: %.2f €", precio);
        System.out.println(salida);
    }
}
