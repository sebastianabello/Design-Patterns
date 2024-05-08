package designpatterns.structuralpatterns.facade;

import designpatterns.structuralpatterns.facade.facade.CheckFacade;

public class EjemploFacade {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2024", "08/07/2024", "Bogota", "Medellin");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2024", "08/07/2024", "Bogota", "Cali");
    }
}
