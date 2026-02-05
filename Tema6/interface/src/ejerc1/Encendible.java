package ejerc1;

public interface Encendible {

    int numero = 5;

    default void prueba(){
       System.out.println("Soy el default");
    }
    void apagar();
    void encender();
}
