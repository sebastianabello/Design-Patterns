package designpatterns.structuralpatterns.adapter.redondo;

public class AgujeroRedondo {
    private double radio;

    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encaja(PiezaRedonda pieza) {
        boolean resultado;
        resultado = (this.getRadio() >= pieza.getRadio());
        return resultado;
    }
}
