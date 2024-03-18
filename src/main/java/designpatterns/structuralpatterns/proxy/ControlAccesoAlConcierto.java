package designpatterns.structuralpatterns.proxy;

public class ControlAccesoAlConcierto implements Concierto {
    private ConciertoReal concierto;

    @Override
    public void asistir() {
        if (concierto == null) {
            concierto = new ConciertoReal();
        }
        concierto.asistir();
    }

    private void verificarBoleto() {
        System.out.println("Verificando boleto...");
        // Verificar boleto
        System.out.println("Boleto verificado!");
    }

}
