package designpatterns.creationalpatterns.factorymethod;

public class FabricaAuto extends FabricaVehiculo {

    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
