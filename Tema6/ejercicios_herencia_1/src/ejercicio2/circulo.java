package ejercicio2;

public class circulo extends figura{

    protected double radio;
    public circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    public void calcularArea(){
        double area = Math.PI * (radio * radio);
        System.out.println("Area del circulos es: " + area);
    }
}
