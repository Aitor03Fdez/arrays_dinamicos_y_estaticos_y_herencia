import java.time.*;

public class main {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();
        ZonedDateTime madrid =  ahora.atZone(ZoneId.of("Europe/Madrid"));

        ZonedDateTime NewYork = madrid.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Hora en Madrid: " + madrid);
        System.out.println("Hora en Nueva York: " + NewYork);
    }

}
