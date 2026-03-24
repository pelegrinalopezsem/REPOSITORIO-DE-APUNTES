package src.Rel1.Ejercicio14;

public class Ropa extends Producto{
        private String talla;

    public Ropa(String talla, String nombre, double  precio) {
        super(nombre, precio);
        this.talla = talla;
    }
    
    @Override
    public String toString(){
        return "El producto: " + nombre + " tiene un precio de " + precio + "€ y una talla de " + talla;
    }
}
