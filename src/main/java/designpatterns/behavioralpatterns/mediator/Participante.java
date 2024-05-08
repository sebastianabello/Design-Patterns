package designpatterns.behavioralpatterns.mediator;

public class Participante {
    private String nombre;
    private SalaDeChatMediator mediador;

    public Participante(String nombre, SalaDeChatMediator mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        mediador.registrarParticipante(this);
    }

    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(nombre + ": " + mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("[" + nombre + " recibe mensaje]: " + mensaje);
    }
}
