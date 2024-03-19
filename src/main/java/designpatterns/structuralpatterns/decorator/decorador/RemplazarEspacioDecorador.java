package designpatterns.structuralpatterns.decorator.decorador;

import designpatterns.structuralpatterns.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextoDecorador {

    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
