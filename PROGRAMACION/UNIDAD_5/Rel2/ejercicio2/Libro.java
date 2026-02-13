package PROGRAMACION.UNIDAD_5.Rel2.ejercicio2;

public class Libro {
    private String titulo;
    private int id;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    public Libro(int id, String titulo, String autor, String sinopsis, boolean disponible) {
        setid(id);
        setTitulo(titulo);
        setAutor(autor);
        setSinopsis(sinopsis);
        setDisponible(disponible);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo (){
        return titulo;
    }

    public int getid(int id) {
        if (id >= 0) {
            this.id = id;
        }
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

        public String getAutor (){
        return autor;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

        public String getSinopsis (){
        return sinopsis;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String libroAñadido = "LIBRO [id= " + id + ", titulo= " + titulo + ", autor= " + autor + ", sinopsis= "
                + sinopsis + ", disponible= " + disponible + "]";
        return libroAñadido;
    }
}
