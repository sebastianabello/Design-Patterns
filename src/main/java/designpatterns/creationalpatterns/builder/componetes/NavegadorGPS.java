package designpatterns.creationalpatterns.builder.componetes;
public class NavegadorGPS {

    private String ruta;

    public NavegadorGPS() {
        this.ruta = "Avenida carracas, al exito de la 52";
    }

    public NavegadorGPS(String rutaManual) {
        this.ruta = rutaManual;
    }

    public String getRuta() {
        return ruta;
    }
}