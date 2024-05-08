package designpatterns.behavioralpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        GestorHistorial gestorHistorial = new GestorHistorial();

        // Escribir contenido al documento
        documento.escribir("Este es el contenido inicial del documento.");
        System.out.println("Contenido actual del documento: " + documento.leer());

        // Guardar el estado actual del documento
        gestorHistorial.guardarMemento(documento.guardarEstado());

        // Modificar el contenido del documento
        documento.escribir("Este es el contenido modificado del documento.");
        System.out.println("Contenido actual del documento: " + documento.leer());

        // Restaurar el estado anterior del documento
        documento.restaurarEstado(gestorHistorial.getMemento());
        System.out.println("Contenido restaurado del documento: " + documento.leer());
    }
}
