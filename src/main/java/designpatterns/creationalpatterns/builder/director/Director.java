package designpatterns.creationalpatterns.builder.director;

import designpatterns.creationalpatterns.builder.builders.Builder;
import designpatterns.creationalpatterns.builder.carros.TipoCarros;
import designpatterns.creationalpatterns.builder.componetes.Computadora;
import designpatterns.creationalpatterns.builder.componetes.Motor;
import designpatterns.creationalpatterns.builder.componetes.NavegadorGPS;
import designpatterns.creationalpatterns.builder.componetes.Transmision;

public class Director {

    public void construirCarroDeportivo(Builder builder){
        builder.setTipoCarro(TipoCarros.DEPORTIVO);
        builder.setAsientos(2);
        builder.setMotor(new Motor(3.0,0));
        builder.setTransmision(Transmision.SEMI_AUTOMATICO);
        builder.setComputadora(new Computadora());
        builder.setNavegadorGPS(new NavegadorGPS());
    }
    public void construirCarroCiudad(Builder builder){
        builder.setTipoCarro(TipoCarros.CIUDAD);
        builder.setAsientos(4);
        builder.setMotor(new Motor(1.2,0));
        builder.setTransmision(Transmision.AUTOMATICO);
        builder.setComputadora(new Computadora());
        builder.setNavegadorGPS(new NavegadorGPS());
    }


}
