package designpatterns.structuralpatterns.adapter.cuadrado;

public class PiezaCuadrada {
    private double ancho;

    public PiezaCuadrada(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }
    public double getCuadrado() {
        double resultado;
        resultado = Math.pow(this.ancho,2);
        return resultado;
    }
}
