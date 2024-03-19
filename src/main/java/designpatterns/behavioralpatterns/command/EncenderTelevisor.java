package designpatterns.behavioralpatterns.command;

public class EncenderTelevisor implements Comando{
    private Televisor televisor;

    public EncenderTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }
    public void ejecutar() {
        televisor.encender();
    }
}
