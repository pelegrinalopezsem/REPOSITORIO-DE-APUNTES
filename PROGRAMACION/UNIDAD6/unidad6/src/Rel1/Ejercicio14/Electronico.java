package src.Rel1.Ejercicio14;

public class Electronico extends Producto{
    private int garantia;

    public Electronico(int garantia, String nombre, double  precio) {
        super(nombre, precio);
        this.garantia = garantia;
    }
    
    @Override
    public String toString(){
        return "El producto: " + nombre + " tiene un precio de " + precio + "€ y una garantia de " + garantia;
    }
}
