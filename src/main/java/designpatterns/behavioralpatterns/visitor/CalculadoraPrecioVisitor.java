package designpatterns.behavioralpatterns.visitor;

public class CalculadoraPrecioVisitor implements Visitor{
    private double precioTotal = 0;

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void visitarPintura(Pintura pintura) {
        precioTotal += 10; // Precio de entrada para pinturas
    }

    public void visitarEscultura(Escultura escultura) {
        precioTotal += 15; // Precio de entrada para esculturas
    }

    public void visitarFotografia(Fotografia fotografia) {
        precioTotal += 5; // Precio de entrada para fotografías
    }
}
