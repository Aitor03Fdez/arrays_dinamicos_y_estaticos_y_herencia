package ejercicio7;

public class Main {
    public static void main(String[] args) {
        RelojBase objReloj = new RelojDigital(12, 45, 50);

        objReloj.incrementoSec();
        objReloj.mostrarHoras();
    }
}
