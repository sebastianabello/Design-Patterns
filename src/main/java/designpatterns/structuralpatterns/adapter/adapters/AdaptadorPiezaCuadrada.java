package designpatterns.structuralpatterns.adapter.adapters;

import designpatterns.structuralpatterns.adapter.cuadrado.PiezaCuadrada;
import designpatterns.structuralpatterns.adapter.redondo.PiezaRedonda;

public class AdaptadorPiezaCuadrada extends PiezaRedonda {
    private PiezaCuadrada pieza;

    public AdaptadorPiezaCuadrada(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }

    @Override
    public double getRadio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((pieza.getAncho() / 2), 2) * 2));
        return resultado;
    }
}
