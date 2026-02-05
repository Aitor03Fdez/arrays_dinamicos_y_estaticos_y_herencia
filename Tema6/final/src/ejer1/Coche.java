package ejer1;

/**
 * No puede heredar pq vehiculo tiene final
 * @author A.FM.S
 */
public class Coche extends Vehiculo{

    private final String modelo = "PuraSangre";
    private int numPuertas;
    private String motor;

    public Coche(String marca, int numPuertas) {
        super(marca);
        this.numPuertas = numPuertas;
    }


    /**
     * No se puede sobre escribir pq esta el final en vehiculo
     *
     * No se puede modificar modelo pq final lo convierte en constante
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Puerta: " + numPuertas);
        this.motor="1400 cm3";
        this.modelo="Italian";
    }

}
