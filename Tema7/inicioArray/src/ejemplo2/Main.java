package ejemplo2;

/**
 * Maneras de declarar arrays
 * @author A.FM.S
 */
public class Main {
    public static void main(String[] args) {
        //1
        String [] diasSemana = new String[7];
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sabado";
        diasSemana[6] = "Domingo";
        System.out.println("Ejemplo 2: " + diasSemana[6]);

        //2
        String[] diasSemana2 = new String[]{"L", "M", "X", "J", "V", "S", "D"};
        System.out.println("Ejemplo 2: " + diasSemana2[6]);

        //3
        String[] diasSemana3 = {"L", "M", "X", "J", "V", "S", "Dom"};
        System.out.println("Ejemplo 2: " + diasSemana3[6]);
    }
}
