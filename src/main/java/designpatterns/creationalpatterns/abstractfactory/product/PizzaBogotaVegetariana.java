package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaBogotaVegetariana extends PizzaProducto {

    public PizzaBogotaVegetariana() {
        super();
        nombre = "Pizza vegetariana Bogota";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Tomate");
        ingredientes.add("Espinaca");
        ingredientes.add("Aguacate");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en cuadrados");
    }
}
