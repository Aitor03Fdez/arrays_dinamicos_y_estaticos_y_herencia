package ejercicio3;

public class Comida extends Productos {

    protected String fechaCaducidad;

    public Comida(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public void mostrarInfo() {
        System.out.println("Caduca el dia: " + fechaCaducidad);
    }
}
