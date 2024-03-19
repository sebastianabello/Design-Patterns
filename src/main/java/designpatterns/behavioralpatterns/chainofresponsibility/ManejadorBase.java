package designpatterns.behavioralpatterns.chainofresponsibility;

abstract class ManejadorBase implements ManejadorReembolso{
    private ManejadorReembolso siguiente;

    public void setSiguiente(ManejadorReembolso siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarReembolso(Reembolso solicitud) {
        if (siguiente != null) {
            siguiente.manejarReembolso(solicitud);
        }
    }
}
