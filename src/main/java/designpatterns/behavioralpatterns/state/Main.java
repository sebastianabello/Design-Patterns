package designpatterns.behavioralpatterns.state;

public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();

        // Encender la bombilla
        bombilla.encender();

        // Cambiar a estado parpadeando
        bombilla.setEstado(new Parpadeando());
        bombilla.parpadear();

        // Apagar la bombilla
        bombilla.apagar();
    }
}
