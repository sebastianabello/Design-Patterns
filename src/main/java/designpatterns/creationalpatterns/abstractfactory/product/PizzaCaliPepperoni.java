package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaCaliPepperoni extends PizzaProducto {
    public PizzaCaliPepperoni() {
        super();
        nombre = "Pizza Italiana Cali";
        masa = "Masa de la casa";
        salsa = "Salsa de ajo";
        ingredientes.add("carne");
        ingredientes.add("pollo");
        ingredientes.add("maiz");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 20 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Contando la pizza en cuadrados");
    }
}
