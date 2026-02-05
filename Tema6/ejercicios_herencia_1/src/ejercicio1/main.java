package ejercicio1;

public class main {
    public static void main(String[] args) {
        guitarra objGuitarra = new guitarra("Guitarra", "Española", 5);
        tambor objTambor = new tambor("Tambor", "Militar", 40);

        objTambor.tocar();
        objGuitarra.tocar();
    }

}
