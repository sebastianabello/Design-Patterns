package designpatterns.creationalpatterns.prototype;

public interface Prototype<T extends Prototype> extends Cloneable {


    //Clonacion simple
    public T clone();

    //Clonacion compuesta
    public T deepClone();


}
