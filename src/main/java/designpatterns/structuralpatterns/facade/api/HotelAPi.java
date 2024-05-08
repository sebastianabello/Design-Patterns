package designpatterns.structuralpatterns.facade.api;

public class HotelAPi {
    public void buscarHoteles(String fechaEntrada, String fechaSalida, String origen, String destino) {
        System.out.println("==============================");
        System.out.println("Hoteles encontrados");
        System.out.println("Entrada: " + fechaEntrada + " Salida: " + fechaSalida);
        System.out.println("Hotel A");
        System.out.println("Hotel B");
        System.out.println("Hotel C");
        System.out.println("==============================");
    }
}
