package designpatterns.behavioralpatterns.chainofresponsibility;

public class Reembolso {
    // Clase para representar una solicitud de reembolso
    private String tipo;
    private double monto;

    public Reembolso(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }


}
