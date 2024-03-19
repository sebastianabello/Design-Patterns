package designpatterns.behavioralpatterns.chainofresponsibility;

public class ManejadorComida extends ManejadorBase{
    public void manejarReembolso(Reembolso solicitud) {
        if (solicitud.getTipo().equals("Comida")) {
            System.out.println("Reembolso de comida aprobado por $" + solicitud.getMonto());
        } else {
            super.manejarReembolso(solicitud);
        }
    }
}
