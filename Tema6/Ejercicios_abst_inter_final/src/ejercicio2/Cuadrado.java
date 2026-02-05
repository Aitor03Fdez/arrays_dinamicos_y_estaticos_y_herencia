package ejercicio2;

public class Cuadrado extends Figura {
    private double lado;

    /**
     * constructor
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado*lado;
    }
}
