package designpatterns.behavioralpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        ObraDeArte[] obrasDeArte = {
                new Pintura(),
                new Escultura(),
                new Fotografia()
        };

        CalculadoraPrecioVisitor calculadora = new CalculadoraPrecioVisitor();

        for (ObraDeArte obra : obrasDeArte) {
            obra.aceptar(calculadora);
        }

        System.out.println("Precio total de entrada: $" + calculadora.getPrecioTotal());
    }
}
