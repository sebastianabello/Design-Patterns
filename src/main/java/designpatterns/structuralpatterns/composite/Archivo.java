package designpatterns.structuralpatterns.composite;

public class Archivo extends Componente {
    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel) + nombre;
    }
}
