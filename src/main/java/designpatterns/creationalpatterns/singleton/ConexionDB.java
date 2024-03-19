package designpatterns.creationalpatterns.singleton;

public class ConexionDB {

    private static ConexionDB instancia;

    private ConexionDB(){
        System.out.println("Conectando algun motor de base de datos...");
    }

    public static ConexionDB getInstancia(){
        if(instancia == null){
            instancia = new ConexionDB();
        }
        return instancia;
    }




}
