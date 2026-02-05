package ejercicio2;

public class rectangulo extends figura {

    protected double ancho;
    protected double alto;
    public rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void calcularArea() {
        System.out.println("Area del rectangulo es: " + ancho*alto);
    }
}
