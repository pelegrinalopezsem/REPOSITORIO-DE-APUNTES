package PROGRAMACION.UNIDAD6.Rel1.ejercicio5;

public class MateriaalBibliografico {
    private String titulo;
    private String autor;
    
    public MateriaalBibliografico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "MateriaalBibliografico [titulo=" + titulo + ", autor=" + autor + "]";
    }

    
}
