package PROGRAMACION.UNIDAD5.Rel2.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        producto champuPantene = new producto("Campu Pantene", "Olor a menta", 3.49, 100);
        producto champuHS = new producto("Campu Pantene", "Olor a menta", 3.49, 100);
        System.out.println(champuPantene.getId());
        System.out.println(champuHS);
        champuHS.setNombre("don calvo");
        System.out.println(champuHS.getNombre());
    }
}
