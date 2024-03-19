package designpatterns.creationalpatterns.abstractfactory;

import designpatterns.creationalpatterns.abstractfactory.product.PizzaBogotaItaliana;
import designpatterns.creationalpatterns.abstractfactory.product.PizzaBogotaPepperoni;
import designpatterns.creationalpatterns.abstractfactory.product.PizzaBogotaVegetariana;

public class PizzeriaBogotaFactory extends PizzeriaZona {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaBogotaVegetariana();
            case "pepperoni" -> new PizzaBogotaPepperoni();
            case "italiana" -> new PizzaBogotaItaliana();
            default -> null;
        };
    }
}
