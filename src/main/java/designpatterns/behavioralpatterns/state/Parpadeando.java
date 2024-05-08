package designpatterns.behavioralpatterns.state;

public class Parpadeando implements Estado{
    public void encender() {
        System.out.println("La bombilla ya está encendida.");
    }

    public void apagar() {
        System.out.println("La bombilla ya está apagada.");
    }

    public void parpadear() {
        System.out.println("La bombilla ya está parpadeando.");
    }
}
