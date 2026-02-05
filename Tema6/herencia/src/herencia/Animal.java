package herencia;

public class Animal {
    protected String nombre;
    protected String color;
    protected String numPatas;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public void hacerSonido() {
        System.out.println("Hacer sonido generico");
    }
}
