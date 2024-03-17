package designpatterns.creationalpatterns.builder.carros;

import designpatterns.creationalpatterns.builder.componetes.Computadora;
import designpatterns.creationalpatterns.builder.componetes.Motor;
import designpatterns.creationalpatterns.builder.componetes.NavegadorGPS;
import designpatterns.creationalpatterns.builder.componetes.Transmision;

public class Manual {
    private final TipoCarros tipo;
    private final int asientos;
    private final Motor motor;
    private final Transmision transmision;
    private final Computadora computadora;
    private final NavegadorGPS navegadorGPS;

    public Manual(TipoCarros tipo, int asientos, Motor motor, Transmision transmision, Computadora computadora, NavegadorGPS navegadorGPS) {
        this.tipo = tipo;
        this.asientos = asientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadora = computadora;
        this.navegadorGPS = navegadorGPS;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + tipo + "\n";
        info += "Cantidad de asientos: " + asientos + "\n";
        info += "Motor: volumen - " + motor.getVolumen() + "; Kilometraje - " + motor.getKilometraje() + "\n";
        info += "Transmision: " + transmision + "\n";
        if (this.computadora != null) {
            info += "Computadora: Funcional" + "\n";
        } else {
            info += "Computadora: N/A" + "\n";
        }
        if (this.navegadorGPS != null) {
            info += "Navegador GPS: Funcional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}
