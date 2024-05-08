package designpatterns.behavioralpatterns.strategy;

public class PagoConTarjeta implements MetodoDePago{
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por $" + monto);
        // Lógica para procesar el pago con tarjeta de crédito
    }
}
