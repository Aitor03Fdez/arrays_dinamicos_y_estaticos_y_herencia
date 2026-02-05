package ejercicio1;

public class guitarra extends instrumento {
    protected int numeroCuerdas;

    public guitarra(String nombre, String tipo, int numeroCuerdas) {
        super(nombre, tipo);
        this.numeroCuerdas = numeroCuerdas;
    }
    @Override
    public void tocar(){
        System.out.println("Es un: "+ this.nombre + " de tipo " + tipo + " con " +  this.numeroCuerdas + " cuerdas");
    }

}
