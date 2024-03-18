package designpatterns.behavioralpatterns.chainofresponsibility;

public class ManejadorMedico extends ManejadorBase{
    public void manejarReembolso(Reembolso solicitud) {
        if (solicitud.getTipo().equals("Medico")) {
            System.out.println("Reembolso médico aprobado por $" + solicitud.getMonto());
        } else {
            super.manejarReembolso(solicitud);
        }
    }
}
