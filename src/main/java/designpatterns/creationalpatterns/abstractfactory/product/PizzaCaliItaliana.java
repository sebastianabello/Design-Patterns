package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaCaliItaliana extends PizzaProducto {

    public PizzaCaliItaliana() {
        super();
        nombre = "Pizza pepperoni Cali";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate picante";
        ingredientes.add("Pepperoni");
        ingredientes.add("Quezo 4 cueros");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 20 min. a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Contando la pizza en triangulos");
    }
}
