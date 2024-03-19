package designpatterns.behavioralpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        SalaDeChat salaDeChat = new SalaDeChat();

        Participante alice = new Participante("Alice", salaDeChat);
        Participante bob = new Participante("Bob", salaDeChat);
        Participante charlie = new Participante("Charlie", salaDeChat);

        alice.enviarMensaje("¡Hola a todos!");
        bob.enviarMensaje("¡Hola, Alice!");
        charlie.enviarMensaje("¡Hola, Bob!");
    }
}
