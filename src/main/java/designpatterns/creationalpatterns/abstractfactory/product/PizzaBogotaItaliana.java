package designpatterns.creationalpatterns.abstractfactory.product;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;

public class PizzaBogotaItaliana extends PizzaProducto {

    public PizzaBogotaItaliana() {
        super();
        nombre = "Pizza Italiana Bogota";
        masa = "Masa franchina gruesa";
        salsa = "Salsa de tomate con carne";
        ingredientes.add("Quezo mozzarella");
        ingredientes.add("Jamon");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 22 min. a 115°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortado en triangulos");
    }
}
