package ejercicio1;

public class tambor extends instrumento {
    protected int diametro;

    public tambor(String nombre, String tipo, int numeroCuerdas) {
        super(nombre, tipo);
        this.diametro = numeroCuerdas;
    }

    @Override
    public void tocar(){
        System.out.println("Es un: "+ this.nombre + " de tipo " + this.tipo + " con " + this.diametro + " de diametro");
    }
}