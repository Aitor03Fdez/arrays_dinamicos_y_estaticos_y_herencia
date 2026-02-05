package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Lavadora objLava = new Lavadora("Bosh", 30, 10);
        Nevera objNeve = new Nevera("Bosh", 5, 10);

        objLava.info();
        objNeve.info();
    }
}
