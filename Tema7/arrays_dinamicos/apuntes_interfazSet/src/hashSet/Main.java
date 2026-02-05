package hashSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Tdoo va desordenado, de manera aleatoria
 */
public class Main {
    public static void main (String[] args) {
        // Crear un HashSet para almacenar nombres
        HashSet<String> arrNombres = new HashSet<>();
        // Agregar nombres al HashSet
        arrNombres.add("Juan");
        arrNombres.add("Ana");
        arrNombres.add(null);
        arrNombres.add("Luis");
        arrNombres.add("Ana"); // Nombre repetido, no se añadirá de nuevo

        System.out.println(arrNombres);

        // Mostrar los nombres únicos almacenados
        Iterator<String> itr = arrNombres.iterator();
        //hasnext() dice si hay siguiente y next imprime en el q estes
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //recorre los arrays dinamicos (es lo mismo q to la paranoia del estatico)
        for (String s : arrNombres) {
            System.out.println(s);
        }

    }
}
