package designpatterns.behavioralpatterns.visitor;

public class Fotografia extends ObraDeArte{
    public void aceptar(Visitor visitor) {
        visitor.visitarFotografia(this);
    }
}
