package ejercicio6;

public class Nevera extends Electrodomestico {

    private int horas;

    public Nevera(String nombre, int consumoHoras, int horas) {
        super(nombre, consumoHoras);
        this.horas = horas;
    }

    public double consumoTotal(int horas){
        return super.consumoPorHora * horas * 0.8;
    }
    @Override
    public void info(){
        double consumoTotal = consumoTotal(horas);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Consumo por horas: " + this.consumoPorHora + " kWh");
        System.out.println("Consumo en  "+ horas + " horas: " + consumoTotal + " kWh");
    }
}
