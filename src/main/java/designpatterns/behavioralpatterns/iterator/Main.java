package designpatterns.behavioralpatterns.iterator;

public class Main {
    public static void main(String[] args) {
        Lista<String> listaDeReproduccion = new Lista<>();
        listaDeReproduccion.agregar("Canción 1");
        listaDeReproduccion.agregar("Canción 2");
        listaDeReproduccion.agregar("Canción 3");

        for (String cancion : listaDeReproduccion) {
            System.out.println("Reproduciendo: " + cancion);
        }
    }
}
