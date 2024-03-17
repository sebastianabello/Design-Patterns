package designpatterns.creationalpatterns.factorymethod;

// La clase Auto implementa la interfaz Vehiculo y sobreescribe el método conducir
public class Auto implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto");
    }
}
