

public class Ropa extends Producto{
        private String talla;

    public Ropa(String talla, String nombre, double  precio) {
        super(nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    
    
    @Override
    public String toString(){
        return "El producto: " + getNombre() + " tiene un precio de " + getPrecio() + "€ y una talla de " + getTalla();
    }
}
