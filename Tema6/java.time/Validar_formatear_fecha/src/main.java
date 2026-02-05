import java.util.Scanner;
import  java.time.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha en este formato: yyyy/MM/dd ");
        String fecha = sc.nextLine();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int ano = Integer.parseInt(fecha.substring(6, 10));

        LocalDate actual = LocalDate.now();
        String actualString = actual.toString();
        LocalDate horaUser =  LocalDate.of(dia, mes, ano);

        String salida = String.format("Fecha del usuario es: %02d/%02d/%02d", dia, mes, ano);
        System.out.println(salida);

        if (horaUser.isEqual(actual)) {
            System.out.println("Las fechas coinciden");
        } else {
            System.out.println("Las fechas NO coinciden");
        }
    }
}
