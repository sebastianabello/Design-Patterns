package designpatterns.behavioralpatterns.strategy;

public class PagoConTransferencia implements MetodoDePago{
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con transferencia bancaria por $" + monto);
        // Lógica para procesar el pago con transferencia bancaria
    }
}
