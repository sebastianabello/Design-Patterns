package designpatterns.creationalpatterns.factorymethod;

public class FabricaCamion extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}
