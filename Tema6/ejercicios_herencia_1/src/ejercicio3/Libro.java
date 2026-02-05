package ejercicio3;

public class Libro extends Productos {

    protected String autor;

    public Libro(String nombre, double precio, String autor) {
        super(nombre, precio);
        this.autor = autor;
    }


    public void mostrarInfo() {
        System.out.println("Autor: " + autor);
    }
}
