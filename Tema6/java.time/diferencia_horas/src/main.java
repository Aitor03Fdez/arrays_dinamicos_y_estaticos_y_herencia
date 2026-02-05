import java.time.*;

public class main {
    public static void main(String[] args) {
        LocalTime primera = LocalTime.of(15,45);
        LocalTime segunda = LocalTime.of(10,30);

        Duration duracion = Duration.between(primera, segunda);

        System.out.println("Hay " + Math.abs(duracion.toHours()) + " horas " + (Math.abs(duracion.toMinutes())%60) + " minutos de diferencia");
    }
}
