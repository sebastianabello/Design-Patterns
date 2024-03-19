package designpatterns.behavioralpatterns.command;

public class ControlRemoto {
    private Comando botonEncender;
    private Comando botonCambiarCanal;
    private Comando botonAjustarVolumen;

    public ControlRemoto(Comando botonEncender, Comando botonCambiarCanal, Comando botonAjustarVolumen) {
        this.botonEncender = botonEncender;
        this.botonCambiarCanal = botonCambiarCanal;
        this.botonAjustarVolumen = botonAjustarVolumen;
    }

    public void presionarBotonEncender() {
        botonEncender.ejecutar();
    }

    public void presionarBotonCambiarCanal() {
        botonCambiarCanal.ejecutar();
    }

    public void presionarBotonAjustarVolumen() {
        botonAjustarVolumen.ejecutar();
    }
}
