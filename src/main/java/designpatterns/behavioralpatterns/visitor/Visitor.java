package designpatterns.behavioralpatterns.visitor;

public interface Visitor {
    void visitarPintura(Pintura pintura);
    void visitarEscultura(Escultura escultura);
    void visitarFotografia(Fotografia fotografia);
}
