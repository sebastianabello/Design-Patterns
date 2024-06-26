package designpatterns.structuralpatterns.decorator.decorador;

import designpatterns.structuralpatterns.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {
    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
