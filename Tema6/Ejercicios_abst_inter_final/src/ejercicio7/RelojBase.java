package ejercicio7;

public abstract class RelojBase implements RelojAcciones {

    protected int horas;
    protected int minutos;
    protected int segundos;

    protected final int max = 60;

    public RelojBase(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public abstract void incrementoSec();
    public abstract void mostrarHoras();


}
