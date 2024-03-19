package designpatterns.behavioralpatterns.templatemethod;

abstract class BebidaCaliente {
    public final void preparar() {
        calentarAgua();
        agregarIngredientes();
        servir();
        if (adicionarCondimentos()) {
            agregarCondimentos();
        }
    }

    protected abstract void calentarAgua();
    protected abstract void agregarIngredientes();
    protected abstract void servir();
    protected abstract boolean adicionarCondimentos();

    // Método opcional que puede ser sobrescrito por las subclases
    protected void agregarCondimentos() {
        System.out.println("Agregando condimentos comunes...");
    }
}
