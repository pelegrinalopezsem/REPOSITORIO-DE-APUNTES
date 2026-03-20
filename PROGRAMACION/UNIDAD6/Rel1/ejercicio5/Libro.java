package PROGRAMACION.UNIDAD6.Rel1.ejercicio5;

class Libro extends MateriaalBibliografico {
    private int numPaginas;
    private String genero;

    public Libro(String titulo, String autor, int numPaginas, String genero) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

@Override
public String toString() {
    return super.toString() + ", Género: " + genero + ", Páginas: " + numPaginas + ".";
}
}
