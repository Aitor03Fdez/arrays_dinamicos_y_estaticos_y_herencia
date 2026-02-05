package ejercicio5;

public class main {
    public static void main(String[] args) {
        Pago objPago = new Pago(520);
        PagoTarjeta objTarjeta = new PagoTarjeta(20);
        PagoBizum objBizum = new PagoBizum(50);
        PagoPayPal objPayPal = new PagoPayPal(120);

        objTarjeta.procesarPago();
        objBizum.procesarPago();
        objPayPal.procesarPago();
        objPago.procesarPago();
    }
}
