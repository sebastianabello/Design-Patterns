package designpatterns.structuralpatterns.decorator.decorador;

import designpatterns.structuralpatterns.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
