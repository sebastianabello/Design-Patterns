package designpatterns.behavioralpatterns.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Lista<T> implements Iterable<T> {
    private List<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public java.util.Iterator<T> iterator() {
        return (Iterator<T>) new ListaIterador<>(elementos);
    }
}
