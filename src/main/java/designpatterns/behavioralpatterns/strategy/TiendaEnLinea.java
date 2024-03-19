package designpatterns.behavioralpatterns.strategy;

public class TiendaEnLinea {
    private MetodoDePago metodoDePago;

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void procesarCompra(double monto) {
        if (metodoDePago != null) {
            metodoDePago.procesarPago(monto);
        } else {
            System.out.println("Error: Método de pago no especificado.");
        }
    }
}
