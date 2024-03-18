package designpatterns.behavioralpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        TiendaEnLinea tienda = new TiendaEnLinea();

        // Procesar compra con tarjeta de crédito
        tienda.setMetodoDePago(new PagoConTarjeta());
        tienda.procesarCompra(100.0);

        // Procesar compra con transferencia bancaria
        tienda.setMetodoDePago(new PagoConTransferencia());
        tienda.procesarCompra(150.0);

        // Procesar compra con PayPal
        tienda.setMetodoDePago(new PagoConPayPal());
        tienda.procesarCompra(200.0);
    }
}
