package ejercicio3;

public class main {
    public static void main(String[] args) {
        Libro objLibro = new Libro("El Quijote", 20, "Cervantes");
        Comida objComida = new Comida("Leche", 1, "10/03/2026");

        objComida.mostrarInfoProducto();
        objComida.mostrarInfo();
        objLibro.mostrarInfoProducto();
        objLibro.mostrarInfo();

    }
}
