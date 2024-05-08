package designpatterns.behavioralpatterns.visitor;

public class Pintura extends ObraDeArte{
    public void aceptar(Visitor visitor) {
        visitor.visitarPintura(this);
    }
}
