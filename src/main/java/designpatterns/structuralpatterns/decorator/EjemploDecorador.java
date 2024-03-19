package designpatterns.structuralpatterns.decorator;

import designpatterns.structuralpatterns.decorator.decorador.MayusculaDecorador;
import designpatterns.structuralpatterns.decorator.decorador.ReversaDecorador;
import designpatterns.structuralpatterns.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal sebastian");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(mayuscula);

        System.out.println(subrayado.darFormato());

    }
}
