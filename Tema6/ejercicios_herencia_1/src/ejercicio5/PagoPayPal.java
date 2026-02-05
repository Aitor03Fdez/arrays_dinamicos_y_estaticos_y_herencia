package ejercicio5;

public class PagoPayPal extends Pago{
    public PagoPayPal(double cantidad){
        super(cantidad);
    }

    public void procesarPago(){
        System.out.println("Procesando pago con PayPal de " +  cantidad + " euros");
    }
}
