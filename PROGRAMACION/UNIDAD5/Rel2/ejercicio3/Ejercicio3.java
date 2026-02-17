package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        supermercado miSuper = new supermercado();
        productos champuPantene = new productos("Campua Pantene", "Olor a menta", 3.49, 100);
        productos champuHS = new productos("Campu Pantene", "Olor a menta", 3.49, 0);
        System.out.println("QUE QUIERES HACER \n1.AGREGAR USUARIO\n2.VENDER UN PRODUCTO\n3.MOSTRAR EL INVENTARIO\n4.FIN");
        miSuper.agregarProducto(champuHS);
        miSuper.agregarProducto(champuPantene);
        System.out.println(champuPantene.getId());
        System.out.println(champuHS);
        champuHS.setNombre("don calvo");
        System.out.println(champuHS.getNombre());
        miSuper.venderProducto(champuPantene);
}
}

