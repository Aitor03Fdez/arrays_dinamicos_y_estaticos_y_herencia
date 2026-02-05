package ejercicio5;

public class Pago {

    protected double cantidad;
     public Pago(double cantidad){
         this.cantidad=cantidad;
     }

     public void procesarPago(){
         System.out.println("Procesando pago generido de " +  cantidad + " euros");
     }

}
