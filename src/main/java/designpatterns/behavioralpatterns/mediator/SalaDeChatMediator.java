package designpatterns.behavioralpatterns.mediator;

public interface SalaDeChatMediator {
    void enviarMensaje(String mensaje, Participante participante);
    void registrarParticipante(Participante participante);
}
