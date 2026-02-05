import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Dame otra palabra: ");
        String palabra2 = sc.nextLine();

        int longPalabra = palabra1.length();
        int longPalabra2 = palabra2.length();

        int longitud = 0;

        if (longPalabra == longPalabra2) {
            longitud = longPalabra;
        } else if (longPalabra < longPalabra2) {
            longitud = longPalabra;
        } else {
            longitud = longPalabra2;
        }
        System.out.println(longitud);
        for (int i=0; i<longitud; i++) {
            if  (palabra1.charAt(i) != palabra2.charAt(i)) {
                System.out.println(palabra1.charAt(i));
                System.out.println(palabra2.charAt(i));
            }
        }

    }
}
