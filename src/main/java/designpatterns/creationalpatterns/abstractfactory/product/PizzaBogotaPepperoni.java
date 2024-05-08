package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaBogotaPepperoni extends PizzaProducto {

    public PizzaBogotaPepperoni() {
        super();
        nombre = "Pizza Pepperoni Bogota";
        masa = "Masa delgada normal";
        salsa = "Salsa de tomate";
        ingredientes.add("Quezo mozzarella");
        ingredientes.add("Extra pepe");
        ingredientes.add("Pimienta");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 175°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortado en triangulos");
    }
}
