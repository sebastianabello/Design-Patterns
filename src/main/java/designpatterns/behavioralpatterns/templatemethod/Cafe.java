package designpatterns.behavioralpatterns.templatemethod;

public class Cafe extends BebidaCaliente{
    protected void calentarAgua() {
        System.out.println("Calentando agua para café");
    }

    protected void agregarIngredientes() {
        System.out.println("Agregando café al agua caliente");
    }

    protected void servir() {
        System.out.println("Sirviendo café caliente");
    }

    protected boolean adicionarCondimentos() {
        return true;
    }

    protected void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche al café");
    }
}
