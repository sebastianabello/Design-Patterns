package designpatterns.behavioralpatterns.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public interface Iterador<T> {
    boolean hasNext();
    T next();
}
