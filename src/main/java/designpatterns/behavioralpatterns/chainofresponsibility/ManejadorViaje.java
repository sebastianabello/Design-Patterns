package designpatterns.behavioralpatterns.chainofresponsibility;

public class ManejadorViaje extends ManejadorBase {
    public void manejarReembolso(Reembolso solicitud) {
        if (solicitud.getTipo().equals("Viaje")) {
            System.out.println("Reembolso de viaje aprobado por $" + solicitud.getMonto());
        } else {
            super.manejarReembolso(solicitud);
        }
    }
}
