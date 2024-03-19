package designpatterns.behavioralpatterns.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListaIterador<T> implements Iterador<T>{
    private List<T> lista;
    private int indice;

    public ListaIterador(List<T> lista) {
        this.lista = lista;
        this.indice = 0;
    }

    public boolean hasNext() {
        return indice < lista.size();
    }

    public T next() {
        if (!hasNext()) {
            throw new RuntimeException("No hay más elementos");
        }
        return lista.get(indice++);
    }
}
