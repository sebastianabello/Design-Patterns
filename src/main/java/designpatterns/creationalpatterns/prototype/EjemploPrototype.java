package designpatterns.creationalpatterns.prototype;

import java.util.List;

public class EjemploPrototype {
    public static void main(String[] args) {

        ListaPrecio listaPrecio = new ListaPrecio("Lista normal");
        List<Producto> productoList = List.of(new Producto("Teclado", 25000),
                new Producto("Audifonos", 15000),
                new Producto("Tablet", 1200000),
                new Producto("Raton", 21000),
                new Producto("Monitor", 260000));

        listaPrecio.setListaProducto(productoList);
        System.out.println(listaPrecio);

        //clona de forma simple es decir un nuevo objeto pero hace referencia sus mismo atributos
        ListaPrecio listaPrecio2 = (ListaPrecio) listaPrecio.clone();
        listaPrecio2.setNombre("LIsta prefer");
        System.out.println(listaPrecio2);

        ListaPrecio listaPrecio3 = (ListaPrecio) listaPrecio.deepClone();
        listaPrecio3.setNombre("Lista prefer2");
        System.out.println(listaPrecio3);

    }
}
