package designpatterns.creationalpatterns.builder.componetes;

import designpatterns.creationalpatterns.builder.carros.Carro;

public class Computadora {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void nivelCombustible() {
        System.out.println("Fuel level: " + carro.getCombustible());
    }
    public void verEstado() {
        if (this.carro.getMotor().estaArrancado()) {
            System.out.println("El carro esta encendido");
        } else {
            System.out.println("El carro esta apagado");
        }
    }
}
