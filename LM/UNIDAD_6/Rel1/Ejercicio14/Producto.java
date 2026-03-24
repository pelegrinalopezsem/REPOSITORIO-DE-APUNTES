package LM.UNIDAD_6.Rel1.Ejercicio14;

abstract class Producto {
    protected String nombre;
    private double  precio;
    public Producto(String nombre, double  precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String toString();
}
