package designpatterns.creationalpatterns.prototype;

public class Producto implements Prototype {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Prototype clone() {
        Producto clone = new Producto(this.nombre, this.precio);
        return clone;
    }

    @Override
    public Prototype deepClone() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
