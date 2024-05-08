package designpatterns.creationalpatterns.builder.builders;

import designpatterns.creationalpatterns.builder.carros.TipoCarros;
import designpatterns.creationalpatterns.builder.componetes.Computadora;
import designpatterns.creationalpatterns.builder.componetes.Motor;
import designpatterns.creationalpatterns.builder.componetes.NavegadorGPS;
import designpatterns.creationalpatterns.builder.componetes.Transmision;

public interface Builder {
    void setTipoCarro(TipoCarros tipo);
    void setAsientos(int asientos);
    void setMotor(Motor motor);
    void setTransmision(Transmision transmision);
    void setComputadora(Computadora computadora);
    void setNavegadorGPS(NavegadorGPS navegadorGPS);
}
