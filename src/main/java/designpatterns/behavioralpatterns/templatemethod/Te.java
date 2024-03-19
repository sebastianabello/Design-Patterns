package designpatterns.behavioralpatterns.templatemethod;

public class Te extends BebidaCaliente{
    protected void calentarAgua() {
        System.out.println("Calentando agua para té");
    }

    protected void agregarIngredientes() {
        System.out.println("Agregando té al agua caliente");
    }

    protected void servir() {
        System.out.println("Sirviendo té caliente");
    }

    protected boolean adicionarCondimentos() {
        return false;
    }
}
