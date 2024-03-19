package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaCaliVegetariana extends PizzaProducto {

    public PizzaCaliVegetariana() {
        super();
        nombre = "Pizza vegetariana Cali";
        masa = "Masa integral vegana extra delgada";
        salsa = "Salsa de pepino";
        ingredientes.add("Pepino");
        ingredientes.add("Espinaca");
        ingredientes.add("Aguacate");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 18 min. a 135°C");
    }

    @Override
    public void cortar() {
        System.out.println("Contando la pizza en circulos");
    }
}
