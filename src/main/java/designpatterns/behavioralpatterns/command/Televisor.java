package designpatterns.behavioralpatterns.command;

public class Televisor {
    public void encender() {
        System.out.println("Televisor encendido");
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal);
    }

    public void ajustarVolumen(int nivel) {
        System.out.println("Ajustando volumen a " + nivel);
    }
}
