package ejercicio3;

public class Productos {

    protected String nombre;
    protected double precio;

    public Productos(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfoProducto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + "€");
    }
}
