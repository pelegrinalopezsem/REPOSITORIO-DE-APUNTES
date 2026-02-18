package PROGRAMACION.UNIDAD5.Rel2.ejercicio5;

/**
 * Representa una película con su título, sinopsis, director y duración.
 *
 * Esta clase proporciona métodos para obtener y modificar los atributos de la película,
 * así como una representación en texto de la película.
 *
 * @author Alumno
 * @version 1.0
 * @since 1.0
 */
public class Pelicula {

    private String titulo;
    private String sinopsis;
    private String director;
    private int duracion;

    /**
     * Constructor para crear una película con todos sus atributos.
     *
     * @param titulo    Título de la película.
     * @param sinopsis  Sinopsis de la película.
     * @param director  Director de la película.
     * @param duracion  Duración de la película en segundos.
     */
    public Pelicula(String titulo, String sinopsis, String director, int duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.duracion = duracion;
    }

    /**
     * Obtiene el título de la película.
     *
     * @return Título de la película.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Modifica el título de la película.
     *
     * @param titulo Nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la sinopsis de la película.
     *
     * @return Sinopsis de la película.
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Modifica la sinopsis de la película.
     *
     * @param sinopsis Nueva sinopsis.
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * Obtiene el nombre del director.
     *
     * @return Director de la película.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Modifica el director de la película.
     *
     * @param director Nuevo director.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene la duración de la película en segundos.
     *
     * @return Duración en segundos.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Modifica la duración de la película.
     * La duración debe ser mayor que 0.
     *
     * @param duracion Nueva duración en segundos.
     */
    public void setDuracion(int duracion) {
        if (duracion > 0) {
            this.duracion = duracion;
        } else {
            System.out.println("La duración no puede ser negativa.");
        }
    }

    /**
     * Devuelve una representación en texto de la película.
     *
     * @return Cadena con todos los datos de la película.
     */
    @Override
    public String toString() {
        return "PELICULA = TITULO: " + titulo +
               " SINOPSIS: " + sinopsis +
               " DIRECTOR: " + director +
               " DURACION: " + duracion + " SEGUNDOS";
    }
}

