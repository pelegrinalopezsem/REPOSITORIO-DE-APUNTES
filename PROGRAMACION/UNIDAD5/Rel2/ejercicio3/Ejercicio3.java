package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        supermercado miSuper = new supermercado();
        productos champuPantene = new productos("Campu Pantene", "Olor a menta", 3.49, 100);
        productos champuHS = new productos("Campu Pantene", "Olor a menta", 3.49, 100);
        miSuper.agregarProducto(champuHS);
        System.out.println(champuPantene.getId());
        System.out.println(champuHS);
        champuHS.setNombre("don calvo");
        System.out.println(champuHS.getNombre());
    }
}
