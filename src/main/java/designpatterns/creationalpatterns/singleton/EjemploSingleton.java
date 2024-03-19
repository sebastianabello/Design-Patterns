package designpatterns.creationalpatterns.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            ConexionDB con = ConexionDB.getInstancia();
            System.out.println("con = " + con);
        }

    }
}
