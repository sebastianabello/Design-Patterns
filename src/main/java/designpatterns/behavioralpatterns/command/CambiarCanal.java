package designpatterns.behavioralpatterns.command;

public class CambiarCanal implements Comando{
    private Televisor televisor;
    private int canal;

    public CambiarCanal(Televisor televisor, int canal) {
        this.televisor = televisor;
        this.canal = canal;
    }

    public void ejecutar() {
        televisor.cambiarCanal(canal);
    }
}
