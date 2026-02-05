package ejercicio1;

public class instrumento {
    protected String nombre;
    protected String tipo;

    public instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void tocar(){
        System.out.println("Es un: "+ this.nombre + " de tipo " + this.tipo);
    }
}
