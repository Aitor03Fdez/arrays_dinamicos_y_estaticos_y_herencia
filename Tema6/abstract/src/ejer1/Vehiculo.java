package ejer1;

public abstract class Vehiculo {

    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract void mover();
    public void info(){
        System.out.println("La marca es: "+ marca);
    }
}
