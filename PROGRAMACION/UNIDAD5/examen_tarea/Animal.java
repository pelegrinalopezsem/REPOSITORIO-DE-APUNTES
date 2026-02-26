package PROGRAMACION.UNIDAD5.examen_tarea;

public class Animal {
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;
    
    public Animal(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        setCodigo(codigo);
        setCantidad(cantidad);
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = "STEM-" + codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad > 0){
            this.cantidad = cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

@Override
public String toString() {
    return "El animal " + getNombre() + "tiene código " + getCodigo() + ", hay " + getCantidad() + " en stock y su precio es $" + getPrecio() + ".";
}
    
}
