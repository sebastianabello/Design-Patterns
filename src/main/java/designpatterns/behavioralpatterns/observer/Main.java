package designpatterns.behavioralpatterns.observer;

public class Main {
    public static void main(String[] args) {
        SujetoObservable redSocial = new SujetoObservable();

        Usuario usuario1 = new Usuario("Usuario1");
        Usuario usuario2 = new Usuario("Usuario2");
        Usuario usuario3 = new Usuario("Usuario3");

        redSocial.agregarObservador(usuario1);
        redSocial.agregarObservador(usuario2);
        redSocial.agregarObservador(usuario3);

        redSocial.publicarMensaje("¡Hola a todos!");

        redSocial.eliminarObservador(usuario2);

        redSocial.publicarMensaje("Mensaje importante!");
    }
}
