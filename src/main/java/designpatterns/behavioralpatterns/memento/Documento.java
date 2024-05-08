package designpatterns.behavioralpatterns.memento;

public class Documento {
    private String contenido;

    public void escribir(String texto) {
        contenido = texto;
    }

    public String leer() {
        return contenido;
    }

    public Memento guardarEstado() {
        return new Memento(contenido);
    }

    public void restaurarEstado(Memento memento) {
        contenido = memento.getEstado();
    }

}
