package designpatterns.creationalpatterns.builder.builders;

import designpatterns.creationalpatterns.builder.carros.Manual;
import designpatterns.creationalpatterns.builder.carros.TipoCarros;
import designpatterns.creationalpatterns.builder.componetes.Computadora;
import designpatterns.creationalpatterns.builder.componetes.Motor;
import designpatterns.creationalpatterns.builder.componetes.NavegadorGPS;
import designpatterns.creationalpatterns.builder.componetes.Transmision;

public class CarroManualBuilder implements Builder {
    private TipoCarros tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private NavegadorGPS navegadorGPS;

    @Override
    public void setTipoCarro(TipoCarros tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Manual getResultado(){
        return new Manual(tipo, asientos, motor, transmision, computadora, navegadorGPS);
    }
}
