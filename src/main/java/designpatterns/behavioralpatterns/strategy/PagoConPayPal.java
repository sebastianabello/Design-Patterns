package designpatterns.behavioralpatterns.strategy;

public class PagoConPayPal implements MetodoDePago{
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por $" + monto);
        // Lógica para procesar el pago con PayPal
    }
}
