package designpatterns.behavioralpatterns.memento;

public class GestorHistorial {
    private Memento memento;

    public void guardarMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
