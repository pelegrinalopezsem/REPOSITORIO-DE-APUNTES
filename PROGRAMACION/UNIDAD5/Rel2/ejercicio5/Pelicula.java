package PROGRAMACION.UNIDAD5.Rel2.ejercicio5;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String director;
    private int duracion;

    public Pelicula(String titulo,String sinopsis,String director,int duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion > 0) {
            this.duracion = duracion;
        } else {
            System.out.println("COMO VA A SER UN TIEMPO NEGATIVO");
        }
    }

    @Override
    public String toString() {
        return "PELICULA = TITULO: " + titulo + " SINOPSIS: " + sinopsis + " DIRECTOR: " + director + " DURACION: " + duracion + " SEGUNDOS";
    }
    
    
    
    
}
