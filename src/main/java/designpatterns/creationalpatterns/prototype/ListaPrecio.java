package designpatterns.creationalpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecio implements Prototype {

    private String nombre;
    private List<Producto> listaProducto = new ArrayList<>();


    public ListaPrecio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Prototype clone() {
        ListaPrecio clone = new ListaPrecio(nombre);
        clone.setListaProducto(listaProducto);
        return clone;
    }

    @Override
    public Prototype deepClone() {
        ListaPrecio clone = new ListaPrecio(nombre);
        List<Producto> cloneProductos = new ArrayList<>();

        for(Producto producto: listaProducto){
            Producto cloneProducto = (Producto) producto.clone();
            cloneProductos.add(cloneProducto);
        }
        clone.setListaProducto(cloneProductos);
        return clone;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +  " - ListaPrecio{" +
                "nombre='" + nombre + '\'' +
                ", listaProducto=" + listaProducto +
                '}';
    }
}
