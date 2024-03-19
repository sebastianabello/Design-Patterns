package designpatterns.structuralpatterns.facade.facade;

import designpatterns.structuralpatterns.facade.api.AvionAPI;
import designpatterns.structuralpatterns.facade.api.HotelAPi;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPi hotelAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPi();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
