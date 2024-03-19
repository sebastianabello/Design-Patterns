package designpatterns.behavioralpatterns.state;

public class Bombilla {
    private Estado estado;

    public Bombilla() {
        estado = new Apagado(); // Estado inicial: apagado
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void encender() {
        estado.encender();
    }

    public void apagar() {
        estado.apagar();
    }

    public void parpadear() {
        estado.parpadear();
    }
}
