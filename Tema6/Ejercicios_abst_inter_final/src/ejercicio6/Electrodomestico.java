package ejercicio6;

public abstract class Electrodomestico {
    protected String nombre;
    protected double consumoPorHora;

    public Electrodomestico(String nombre, double consumoPorHora) {
        this.nombre = nombre;
        this.consumoPorHora = consumoPorHora;
    }

    public abstract double consumoTotal(int Horas);

    public void info(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Consumo por horas: " + this.consumoPorHora + " kWh");
    }
}
