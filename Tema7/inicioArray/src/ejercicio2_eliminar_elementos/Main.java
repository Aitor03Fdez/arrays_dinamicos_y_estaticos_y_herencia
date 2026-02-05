package ejercicio2_eliminar_elementos;

import java.util.Arrays;

public class Main {
    public static String [] eliminarElementos(String[] array, int posicion) {
        String [] resultado = new String[array.length-2];
        System.arraycopy(array, 0, resultado, 0, posicion);
        System.arraycopy(array, posicion+2, resultado, posicion, resultado.length-posicion);
        return resultado;
    }

    public static void main(String[] args) {
        String [] arraySemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int posicion = 2;

        System.out.println("Array original: " + Arrays.toString(arraySemana));
        arraySemana = eliminarElementos(arraySemana, posicion);
        System.out.println("Nuevo array: " + Arrays.toString(arraySemana));

    }
}
