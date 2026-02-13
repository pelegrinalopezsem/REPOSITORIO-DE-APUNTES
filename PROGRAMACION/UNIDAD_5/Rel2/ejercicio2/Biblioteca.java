package PROGRAMACION.UNIDAD_5.Rel2.ejercicio2;

import java.util.ArrayList;


public class Biblioteca {
    ArrayList<Biblioteca> libro;
 

    public Biblioteca() {
        this.libro = new ArrayList<>();
    }

    public void agregarLibro(Biblioteca tomo) {
        libro.add(tomo);
    }
}
