import java.time.*;

public class main {
    public static void main(String[] args) {
        LocalDate actual = LocalDate.now();
        LocalDate usuario = LocalDate.of(2003, 11, 02);

        Period periodo = Period.between(usuario, actual);

        System.out.println("Tienes " + periodo.getYears() + " años");
    }
}
