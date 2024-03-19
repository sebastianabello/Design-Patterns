package designpatterns.behavioralpatterns.visitor;

public class Escultura extends ObraDeArte{
    public void aceptar(Visitor visitor) {
        visitor.visitarEscultura(this);
    }
}
