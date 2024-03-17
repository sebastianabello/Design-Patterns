package designpatterns.creationalpatterns.factorymethod;

public class Cliente {
    public static void main(String[] args) {

        FabricaVehiculo fabricaAuto = new FabricaAuto();
        Vehiculo auto = fabricaAuto.crearVehiculo();
        auto.conducir();

        FabricaVehiculo fabricaCamion = new FabricaCamion();
        Vehiculo camion = fabricaCamion.crearVehiculo();
        camion.conducir();
        
    }
}
