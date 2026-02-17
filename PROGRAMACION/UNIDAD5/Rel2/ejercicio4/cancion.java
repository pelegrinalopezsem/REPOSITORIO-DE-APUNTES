package PROGRAMACION.UNIDAD5.Rel2.ejercicio4;

public class cancion {
    private String titulo;
    private String artista;
    private double duracion;

    public cancion(String titulo,String artista,double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        setDuracion(duracion);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public double getDuracion() {
        return duracion;
    }
    public boolean setDuracion(double duracion) {
        boolean duracionCorrecto = false;
        if (duracion >= 0) {
            duracionCorrecto = true;
            this.duracion = duracion;
        }
        return duracionCorrecto;
    }

    @Override
    public String toString() {
        return "TITULO: " + titulo + " ARTISTA: " + artista + " DURACION: " + duracion;
    }
    
}
