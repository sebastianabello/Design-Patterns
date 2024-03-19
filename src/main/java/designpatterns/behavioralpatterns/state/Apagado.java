package designpatterns.behavioralpatterns.state;

public class Apagado implements Estado{
    public void encender() {
        System.out.println("Encendiendo la bombilla.");
    }

    public void apagar() {
        System.out.println("La bombilla ya está apagada.");
    }

    public void parpadear() {
        System.out.println("La bombilla no puede parpadear si está apagada.");
    }
}
