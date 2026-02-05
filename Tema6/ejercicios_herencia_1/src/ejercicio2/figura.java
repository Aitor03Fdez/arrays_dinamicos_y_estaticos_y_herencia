package ejercicio2;

public class figura {

    protected String color;

    public figura(String color) {
        this.color = color;
    }

    public void mostrarColor(){
        System.out.println("color: " + color);
    }

}
