package designpatterns.behavioralpatterns.templatemethod;

public class Main {
    public static void main(String[] args) {
        BebidaCaliente cafe = new Cafe();
        BebidaCaliente te = new Te();

        System.out.println("Preparando café...");
        cafe.preparar();

        System.out.println("\nPreparando té...");
        te.preparar();
    }
}
