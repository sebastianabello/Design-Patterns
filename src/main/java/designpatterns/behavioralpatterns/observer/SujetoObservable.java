package designpatterns.behavioralpatterns.observer;
import java.util.ArrayList;
import java.util.List;

public class SujetoObservable {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void publicarMensaje(String mensaje) {
        System.out.println("Publicando mensaje: " + mensaje);
        notificarObservadores(mensaje);
    }
}
