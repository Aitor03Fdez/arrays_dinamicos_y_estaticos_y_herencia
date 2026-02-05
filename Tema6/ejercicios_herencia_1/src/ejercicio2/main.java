package ejercicio2;

public class main {
    public static void main(String[] args) {
        circulo objCirculo = new circulo("Azul", 6);
        rectangulo objRectangulo = new rectangulo("Rojo", 8, 9);
        objRectangulo.mostrarColor();
        objRectangulo.calcularArea();
        objCirculo.mostrarColor();
        objCirculo.calcularArea();
    }
}
