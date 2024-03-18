package designpatterns.behavioralpatterns.command;

public class AjustarVolumen implements Comando{
    private Televisor televisor;
    private int nivel;

    public AjustarVolumen(Televisor televisor, int nivel) {
        this.televisor = televisor;
        this.nivel = nivel;
    }

    public void ejecutar() {
        televisor.ajustarVolumen(nivel);
    }
}
