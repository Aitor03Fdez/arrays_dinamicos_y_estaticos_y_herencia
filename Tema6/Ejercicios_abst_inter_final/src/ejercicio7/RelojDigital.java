package ejercicio7;

public class RelojDigital extends RelojBase {

    public RelojDigital(int horas, int minuto, int segundo) {
        super(horas, minuto, segundo);
    }

    public void incrementoSec() {
        if (segundos == 59) {
            segundos = 0;
            minutos++;
        }
    }

    public void mostrarHoras() {
        for (int i = segundos; i <= 60; i++) {
            System.out.print("\r" + horas + ":" + minutos + ":"  + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

    }

}
