package ejer1;
/**
 *
 * @author A.FM.S
 */
public final class Vehiculo {
     protected String marca;

     public Vehiculo(String marca){
         this.marca=marca;
     }

     public final void mostrarInfo(){
         System.out.println("La marca es: " + marca);
     }
}
