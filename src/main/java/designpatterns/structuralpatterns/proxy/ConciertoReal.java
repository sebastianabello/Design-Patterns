package designpatterns.structuralpatterns.proxy;

public class ConciertoReal implements Concierto {
    @Override
    public void asistir() {
        System.out.println("Asistiendo al concierto!");
    }
}
