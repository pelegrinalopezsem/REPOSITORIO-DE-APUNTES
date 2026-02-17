package PROGRAMACION.UNIDAD5.Rel2.ejercicio5;

import java.util.ArrayList;

public class Cine {
    ArrayList<Pelicula> pelicula;

    public Cine() {
        this.pelicula = new ArrayList<>();
    }

    // AGREGAR PRODUCTOS
    public void agregarProducto(Pelicula pelicula) {
        this.pelicula.add(pelicula);
    }

    //MOSTRAR PELICULAS
    public void mostrarPeliculas() {
        for (Pelicula p : pelicula) {
            System.out.println(p)  ;
        }
    }
    public Pelicula buscaPelicula(String tituloBuscado) {
    if (tituloBuscado == null || pelicula == null) {
        System.out.println("Título o lista de películas no puede ser nula");
        return null;
    }

    String tituloLimpio = tituloBuscado.trim();

    for (Pelicula p : pelicula) {
        System.out.println("Revisando: " + p.getTitulo()); // depuración
        if (p.getTitulo().trim().equalsIgnoreCase(tituloLimpio)) {
            System.out.println("Película encontrada: " + p.getTitulo());
            return p;
        }
    }

    System.out.println("No se encontró la película: " + tituloBuscado);
    return null;
}

public void duracionMediaPelicula(){
    int totalPeliculas = 0;
    int totalTiempo = 0;
    int mediaTiempo;
    for (Pelicula p : pelicula) {
        totalPeliculas++;
        totalTiempo += p.getDuracion();
    }
    mediaTiempo = totalTiempo / totalPeliculas; 
    System.out.println("La media de tiempo es: " + mediaTiempo);
}


}
