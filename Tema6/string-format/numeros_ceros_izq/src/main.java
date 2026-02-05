

public class main {
    public static void main(String[] args) {
        String salida;
        for  (int i = 1; i <= 10; i++) {
            salida = String.format("%03d", i);
            System.out.println(salida);
        }
    }
}
