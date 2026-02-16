package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

import java.util.ArrayList;

import PROGRAMACION.UNIDAD5.Rel2.ejercicio1.Estudiante;

public class supermercado {
    
    ArrayList<productos> productos;  
    
    public supermercado(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(productos producto) { 
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (productos p : productos) {
            System.out.println(p);
        }
    }
    public productos buscarProducto(String numeroId) {
    productos productoEncontrado = null;
    boolean encontrado = false;
    
    for (int i = 0; i < productos.size() && !encontrado; i++) {
        if (productos.get(i).getId().equals(numeroId)) {
            productoEncontrado = productos.get(i);
            encontrado = true;
        }
    }

    return productoEncontrado;
}
    public void venderProducto(String numeroId, int cantidad) {
        productos producto = buscarProducto(numeroId);  // Buscar el producto por su ID

        if (producto != null) {  // Si el producto existe
            if (producto.getCantidadEnStock() >= cantidad) {  // Si hay suficiente stock
                int nuevaCantidad = producto.getCantidadEnStock() - cantidad;
                producto.setCantidadEnStock(nuevaCantidad);  // Reducir la cantidad en stock
                System.out.println("Venta realizada: " + cantidad + " unidades de " + producto.getNombre());
                System.out.println("Cantidad restante en stock: " + producto.getCantidadEnStock());
            } else {
                System.out.println("No hay suficiente stock de " + producto.getNombre() + " para realizar la venta.");
            }
        } else {
            System.out.println("Producto no encontrado con el ID: " + numeroId);
        }
    }
}


