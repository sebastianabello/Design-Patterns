package designpatterns.creationalpatterns.abstractfactory.ejemplo;

import designpatterns.creationalpatterns.abstractfactory.PizzaProducto;
import designpatterns.creationalpatterns.abstractfactory.PizzeriaBogotaFactory;
import designpatterns.creationalpatterns.abstractfactory.PizzeriaCaliFactory;
import designpatterns.creationalpatterns.abstractfactory.PizzeriaZona;

public class EjemploFactory {

    public static void main(String[] args) {
        PizzeriaZona b = new PizzeriaBogotaFactory();
        PizzeriaZona c = new PizzeriaCaliFactory();

        System.out.println("========================================");
        PizzaProducto pizza = c.ordenarPizza("pepperoni");
        System.out.println("Maria ordeno la pizza " + pizza.getNombre());

        System.out.println("========================================");
        pizza = b.ordenarPizza("italiana");
        System.out.println("Andres ordeno la pizza " + pizza.getNombre());

        System.out.println("========================================");
        pizza = c.ordenarPizza("vegetariana");
        System.out.println("Sebastian ordeno la pizza " + pizza.getNombre());

        System.out.println("========================================");
        pizza = b.ordenarPizza("pepperoni");
        System.out.println("Juan ordeno la pizza " + pizza.getNombre());

        System.out.println("========================================");
        pizza = c.ordenarPizza("italiana");
        System.out.println("Jorge ordeno la pizza " + pizza.getNombre());

        System.out.println("========================================");
        pizza = b.ordenarPizza("vegetariana");
        System.out.println("Sofia ordeno la pizza " + pizza.getNombre());

    }

}
