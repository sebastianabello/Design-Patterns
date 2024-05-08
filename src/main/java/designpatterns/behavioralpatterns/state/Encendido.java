package designpatterns.behavioralpatterns.state;

public class Encendido implements Estado{
    public void encender() {
        System.out.println("La bombilla ya está encendida.");
    }

    public void apagar() {
        System.out.println("Apagando la bombilla.");
    }

    public void parpadear() {
        System.out.println("La bombilla está parpadeando.");
    }
}
