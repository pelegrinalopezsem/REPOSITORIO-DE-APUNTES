package PROGRAMACION.UNIDAD_5.Rel2.ejercicio2;

import java.util.ArrayList;

public class Biblioteca {
    // Cambié el tipo de la lista para que almacene objetos de tipo Libro
    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        Libro libroEncontrado = null; // Variable para almacenar el libro encontrado
        boolean encontrado = false; // Bandera para indicar si se encontró el libro

        // Recorrer todos los libros en la biblioteca
        for (int i = 0; i < libros.size() && !encontrado; i++) {
            // Comparar el título del libro actual con el que se busca
            if (libros.get(i).getTitulo().equals(titulo)) {
                libroEncontrado = libros.get(i); // Si se encuentra, asignamos el libro encontrado
                encontrado = true; // Cambiar la bandera a true para salir del bucle
            }
        }
        return libroEncontrado; // Retorna el libro encontrado (o null si no se encuentra)
    }

    // Método para cambiar la disponibilidad del libro
    public boolean cambiarDisponibilidad(String titulo) {
        Libro libroEncontrado = buscarLibro(titulo);

        if (libroEncontrado != null) {
            if (libroEncontrado.isDisponible()) {
                libroEncontrado.setDisponible(false);
                return true; // Se hizo el cambio con éxito
            } else {
                return false; // El libro ya está no disponible
            }
        }
        return false; // El libro no se encontró
    }
    public boolean devolverLibro(String titulo) {
    // Buscar el libro en la biblioteca
    Libro libroEncontrado = buscarLibro(titulo);

    // Si el libro se encuentra
    if (libroEncontrado != null) {
        // Verificar si el libro está prestado (disponible es false)
        if (!libroEncontrado.isDisponible()) {
            libroEncontrado.setDisponible(true); // Devolver el libro, cambiando su disponibilidad a true
            return true; // Devolución exitosa
        } else {
            return false; // El libro ya estaba disponible, no se puede devolver
        }
    }
    return false; // El libro no se encontró en la biblioteca
}

}
