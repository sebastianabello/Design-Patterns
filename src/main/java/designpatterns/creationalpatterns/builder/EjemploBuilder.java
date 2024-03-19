package designpatterns.creationalpatterns.builder;

import designpatterns.creationalpatterns.builder.builders.CarroBuilder;
import designpatterns.creationalpatterns.builder.builders.CarroManualBuilder;
import designpatterns.creationalpatterns.builder.carros.Carro;
import designpatterns.creationalpatterns.builder.carros.Manual;
import designpatterns.creationalpatterns.builder.director.Director;

public class EjemploBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        CarroBuilder builder = new CarroBuilder();
        director.construirCarroDeportivo(builder);

        Carro carro = builder.getResultado();
        System.out.println(carro.getTipo());
        CarroManualBuilder manualBuilder = new CarroManualBuilder();

        director.construirCarroCiudad(manualBuilder);
        Manual carroManual = manualBuilder.getResultado();
        System.out.println(carroManual.print());




    }
}
