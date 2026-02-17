package PROGRAMACION.UNIDAD5.Rel2.ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
        Cine Kineapolis = new Cine();
        Pelicula MAGIA = new Pelicula("HARRY", "MAGO TONTO", "EL PEPE", 1000);
        Pelicula Terror = new Pelicula("HARRY", "MAGO TONTO", "EL PEPE", 200);
        Kineapolis.agregarProducto(MAGIA);
        Kineapolis.agregarProducto(Terror);
        Kineapolis.mostrarPeliculas();
        Kineapolis.buscaPelicula("HARRY");
        Kineapolis.duracionMediaPelicula();
    }
}
