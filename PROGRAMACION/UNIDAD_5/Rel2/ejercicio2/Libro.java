package PROGRAMACION.UNIDAD_5.Rel2.ejercicio2;

public class Libro {
    private String titulo;
    private int id;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    // Constructor
    public Libro(int id, String titulo, String autor, String sinopsis, boolean disponible) {
        setId(id);        // Cambié setid por setId, para seguir la convención de Java
        setTitulo(titulo);
        setAutor(autor);
        setSinopsis(sinopsis);
        setDisponible(disponible);
    }

    // Getter y Setter para 'titulo'
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Getter y Setter para 'id'
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    // Getter y Setter para 'autor'
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    // Getter y Setter para 'sinopsis'
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    // Getter y Setter para 'disponible'
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "LIBRO [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", sinopsis=" + sinopsis + ", disponible=" + disponible + "]";
    }
}
