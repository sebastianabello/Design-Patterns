package designpatterns.creationalpatterns.builder.componetes;

public class Motor {
    private final double volumen;
    private double kilometraje;
    private boolean arrancar;

    public Motor(double volumen, double kilometraje) {
        this.volumen = volumen;
        this.kilometraje = kilometraje;
    }

    public void encendido(){
        arrancar = true;
    }
    public void apagado(){
        arrancar = false;
    }
    public boolean estaArrancado(){
        return arrancar;
    }
    public void ir(double kilometraje) {
        if (arrancar) {
            this.kilometraje += kilometraje;
        } else {
            System.err.println("primero debes arrancar el motor");
        }
    }

    public double getVolumen() {
        return volumen;
    }

    public double getKilometraje() {
        return kilometraje;
    }
}
