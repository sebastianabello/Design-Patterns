package designpatterns.creationalpatterns.abstractfactory;


import designpatterns.creationalpatterns.abstractfactory.product.PizzaCaliItaliana;
import designpatterns.creationalpatterns.abstractfactory.product.PizzaCaliPepperoni;
import designpatterns.creationalpatterns.abstractfactory.product.PizzaCaliVegetariana;

public class PizzeriaCaliFactory extends PizzeriaZona {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaCaliVegetariana();
            case "pepperoni" -> new PizzaCaliPepperoni();
            case "italiana" -> new PizzaCaliItaliana();
            default -> null;
        };
    }
}
