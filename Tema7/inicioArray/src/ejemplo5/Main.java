package ejemplo5;

import java.util.Arrays;

public class Main {

    public static int [] insertarElemento (int [] array, int posicion, int elemento){
        int [] arrayNuevo = new int [array.length+1];
        System.arraycopy(array, 0, arrayNuevo, 0, posicion);
        arrayNuevo[posicion] = elemento;
        System.arraycopy(array, posicion+1, arrayNuevo, posicion+1, array.length-posicion);
        return  arrayNuevo;
    }

    public  static void main(String[] args) {
        int [] arrayEjem = {1,2,3,4,5,6};
        int posicion = 2;
        int elemento = 12;

        System.out.println("Array original: " + Arrays.toString(arrayEjem));
        arrayEjem = insertarElemento(arrayEjem, posicion, elemento);
        System.out.println("Nuevo array: " + Arrays.toString(arrayEjem));


    }
}
