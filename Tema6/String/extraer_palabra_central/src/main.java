import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame una frase de tres palabras");
        String frase = sc.nextLine();
        int longitud = frase.length();
        int valor = frase.indexOf(" ");
        String subCadena1 = frase.substring(valor+1, longitud);
        int valor2 = subCadena1.indexOf(" ");
        String subCadena2 = subCadena1.substring(0, valor2);
        System.out.print(subCadena2);

    }

}
