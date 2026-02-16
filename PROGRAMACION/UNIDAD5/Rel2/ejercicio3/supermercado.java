package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

import java.util.ArrayList;



public class supermercado {
    
    ArrayList<supermercado> productos;
    
    public supermercado(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(supermercado producto) {
        productos.add(producto);
    }
}
