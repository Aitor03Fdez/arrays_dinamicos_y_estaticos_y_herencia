package herencia;

public class Perro extends Animal {
    private String raza;

    public  Perro(String nombre, String color, String raza) {
        super(nombre, color);
        this.raza = raza;
    }

    public void mostrarInfo() {
        System.out.println("El perro es: " + raza + " y se llama " + super.nombre + " y es de color " + color);
    }

}
