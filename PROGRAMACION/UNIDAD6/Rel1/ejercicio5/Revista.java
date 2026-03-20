package PROGRAMACION.UNIDAD6.Rel1.ejercicio5;

public class Revista extends MateriaalBibliografico {

    private int edicion;
    private String periodicidad;

    public Revista(String titulo, String autor, int edicion, String periodicidad) {
        super(titulo, autor);
        this.edicion = edicion;
        this.periodicidad = periodicidad;
    }

    public int getedicion() {
        return edicion;
    }

    public void setedicion(int edicion) {
        this.edicion = edicion;
    }

    public String getperiodicidad() {
        return periodicidad;
    }

    public void setperiodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

@Override
public String toString() {
    return super.toString() + ", periodicidad: " + periodicidad + ", edicion: " + edicion + ".";
}
}

