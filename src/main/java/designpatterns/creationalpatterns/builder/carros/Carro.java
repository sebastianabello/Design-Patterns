package designpatterns.creationalpatterns.builder.carros;

import designpatterns.creationalpatterns.builder.componetes.Computadora;
import designpatterns.creationalpatterns.builder.componetes.Motor;
import designpatterns.creationalpatterns.builder.componetes.NavegadorGPS;
import designpatterns.creationalpatterns.builder.componetes.Transmision;

public class Carro {
    private final TipoCarros tipo;
    private final int asientos;
    private final Motor motor;
    private final Transmision transmision;
    private final Computadora computadora;
    private final NavegadorGPS navegadorGPS;
    private double combustible = 0;

    public Carro(TipoCarros tipo, int asientos, Motor motor, Transmision transmision, Computadora computadora, NavegadorGPS navegadorGPS) {
        this.tipo = tipo;
        this.asientos = asientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadora = computadora;
        if (this.computadora != null) {
            this.computadora.setCarro(this);
        }
        this.navegadorGPS = navegadorGPS;
    }

    public TipoCarros getTipo() {
        return tipo;
    }

    public int getAsientos() {
        return asientos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public NavegadorGPS getNavegadorGPS() {
        return navegadorGPS;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
