package ejercicio2;

public class Circulo extends Figura {

    private double radio;

    /**
     * Constructor
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
