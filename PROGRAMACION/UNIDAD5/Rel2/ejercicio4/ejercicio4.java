package PROGRAMACION.UNIDAD5.Rel2.ejercicio4;


public class ejercicio4 {
    public static void main(String[] args) {
        Playlist canciones = new Playlist();
        cancion TEVOTE = new cancion("Te Vote", "Ozuna", 300);
        canciones.agregarCancion(TEVOTE);
        System.out.println(canciones);
    }
}
