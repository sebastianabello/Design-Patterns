package designpatterns.behavioralpatterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        ManejadorReembolso manejadorViaje = new ManejadorViaje();
        ManejadorReembolso manejadorMedico = new ManejadorMedico();
        ManejadorReembolso manejadorComida = new ManejadorComida();

        // Configurar la cadena de responsabilidad
        // Establecer el siguiente manejador para cada uno
        ((ManejadorBase) manejadorViaje).setSiguiente(manejadorMedico);
        ((ManejadorBase) manejadorMedico).setSiguiente(manejadorComida);

        // Simulación de envío de solicitudes de reembolso
        manejadorViaje.manejarReembolso(new Reembolso("Viaje", 200));
        manejadorViaje.manejarReembolso(new Reembolso("Medico", 100));
        manejadorViaje.manejarReembolso(new Reembolso("Comida", 50));
    }
}
