package ejercicio2;

/**
 * @author A.FM.
 */
public class Main {
    public static void main(String[] args) {
        Figura objCuadrado = new Cuadrado(6);
        Figura objCirculo = new Circulo(23);


        double areaCirculo =  objCirculo.area();
        double areaCuadrado = objCuadrado.area();

        System.out.println("La area del Circulo es: " + areaCirculo);
        System.out.println("La area del Cuadrado es: " + areaCuadrado);
    }
}
