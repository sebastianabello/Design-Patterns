package designpatterns.behavioralpatterns.mediator;
import java.util.List;
import java.util.ArrayList;
public class SalaDeChat implements SalaDeChatMediator{
    private List<Participante> participantes;

    public SalaDeChat() {
        this.participantes = new ArrayList<>();
    }

    // Método para registrar participantes en la sala de chat
    public void registrarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void enviarMensaje(String mensaje, Participante participante) {
        for (Participante p : participantes) {
            // Excluir al participante que envía el mensaje
            if (p != participante) {
                p.recibirMensaje(mensaje);
            }
        }
    }
}
