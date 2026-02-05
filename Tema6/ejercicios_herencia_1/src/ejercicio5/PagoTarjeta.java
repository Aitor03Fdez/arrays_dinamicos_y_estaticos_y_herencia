package ejercicio5;

public class PagoTarjeta extends Pago{
    public PagoTarjeta(double cantidad){
        super(cantidad);
    }

    public void procesarPago(){
        System.out.println("Procesando pago con tarjeta de " +  cantidad + " euros");
    }
}
