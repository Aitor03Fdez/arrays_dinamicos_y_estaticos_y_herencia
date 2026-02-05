package ejer12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Alumnos> list = new ArrayList();

        Alumnos obj = new Alumnos("Aitor", "Fernandez");

        list.add(obj);

        for (Alumnos var : list) {
            System.out.println(var.getNombre() +  " " + var.getApellido());
        }

        list.get(0).setNombre("Adam");
        list.get(0).setApellido("Labassi");
        System.out.println("Modificada: ");
        System.out.println(list.get(0).getNombre() + " " + list.get(0).getApellido());


    }
}
