package designpatterns.creationalpatterns.factorymethod;

// La clase camion implementa la interfaz vehiculo y sobreescribe el método conducir
public class Camion implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un camion");
    }
}
