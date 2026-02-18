package PROGRAMACION.UNIDAD5.Rel2.ejercicio5;

import java.util.ArrayList;

/**
 * Representa un cine que gestiona una lista de películas.
 *
 * Esta clase permite agregar películas, mostrar la lista de películas,
 * buscar una película por su título y calcular la duración media de las películas.
 *
 * @author Alumno
 * @version 1.0
 * @since 1.0
 */
public class Cine {

    /**
     * Lista de películas del cine.
     */
    private ArrayList<Pelicula> pelicula;

    /**
     * Constructor que inicializa la lista de películas vacía.
     */
    public Cine() {
        this.pelicula = new ArrayList<>();
    }

   /**
    * 
    * @param pelicula
    */
    public void agregarProducto(Pelicula pelicula) {
        this.pelicula.add(pelicula);
    }

    /**
     * Muestra por consola todas las películas almacenadas.
     */
    public void mostrarPeliculas() {
        for (Pelicula p : pelicula) {
            System.out.println(p);
        }
    }

    /**
     * Busca una película por su título.
     *
     * @param tituloBuscado Título de la película que se desea buscar.
     * @return La película encontrada si existe; en caso contrario, devuelve null.
     */
    public Pelicula buscaPelicula(String tituloBuscado) {
        if (tituloBuscado == null || pelicula == null) {
            System.out.println("Título o lista de películas no puede ser nula");
            return null;
        }

        String tituloLimpio = tituloBuscado.trim();

        for (Pelicula p : pelicula) {
            if (p.getTitulo().trim().equalsIgnoreCase(tituloLimpio)) {
                return p;
            }
        }

        return null;
    }

    /**
     * Calcula y muestra por consola la duración media de las películas.
     * Si no hay películas en la lista, puede producir una división por cero.
     */
    public void duracionMediaPelicula() {
        int totalPeliculas = 0;
        int totalTiempo = 0;

        for (Pelicula p : pelicula) {
            totalPeliculas++;
            totalTiempo += p.getDuracion();
        }

        int mediaTiempo = totalTiempo / totalPeliculas;
        System.out.println("La media de tiempo es: " + mediaTiempo);
    }
}
