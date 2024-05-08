package designpatterns.creationalpatterns.factorymethod;

// Se define un metodo para crear objetos, pero se deja a las subclases decidir que clase de objeto crear
public abstract class FabricaVehiculo {
    public abstract Vehiculo crearVehiculo();
}
