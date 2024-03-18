package designpatterns.behavioralpatterns.command;

public class Main {
    public static void main(String[] args) {
        Televisor miTelevisor = new Televisor();
        Comando encender = new EncenderTelevisor(miTelevisor);
        Comando cambiarCanal = new CambiarCanal(miTelevisor, 5);
        Comando ajustarVolumen = new AjustarVolumen(miTelevisor, 20);

        ControlRemoto controlRemoto = new ControlRemoto(encender, cambiarCanal, ajustarVolumen);

        controlRemoto.presionarBotonEncender();
        controlRemoto.presionarBotonCambiarCanal();
        controlRemoto.presionarBotonAjustarVolumen();
    }
}
