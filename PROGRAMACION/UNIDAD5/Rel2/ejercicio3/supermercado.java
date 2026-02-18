package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

import java.util.ArrayList;

public class supermercado {
    
    ArrayList<productos> productos;  
    public supermercado(){
        this.productos = new ArrayList<>();
    }
    
/**
 * 
 * @param producto producto a agregar al supermercado
 */
//AGREGAR PRODUCTO
    public void agregarProducto(productos producto) { 
        productos.add(producto);
    }
/** 
 * @param producto
 */
//VENDER PRODUCTO
    public void venderProducto(productos producto){
        int cantidadComprar = 1;
        productos productoVender; 
        if (productos.contains(producto)){
            System.out.println("PRODUCTO ENCONTRADO");
            System.out.println(productos.get(productos.indexOf(producto))); 
            if (producto.getCantidadEnStock() - cantidadComprar >= 0){
                producto.setCantidadEnStock(producto.getCantidadEnStock() - cantidadComprar);
                System.out.println(producto);
            } else {
                System.out.println("NO HAY SUFICIENTE STOCK");
            }
        }
    }
/** 
 * @return String
 */
//MOSTRAR INVENTARIO
    @Override
    public String toString() {
        String inventario = "";
        int contador = 0;
        for (int i = 1; i <= productos.size(); i++){
            inventario += "Supermercado --> articulo " + i + ":" + productos.get(i) + "\n";
        }
        return super.toString();
    }

}


