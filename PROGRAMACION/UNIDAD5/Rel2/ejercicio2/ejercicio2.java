package PROGRAMACION.UNIDAD5.Rel2.ejercicio2;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblo = new Biblioteca();

        // Crear libros y agregarlos a la biblioteca
        Libro libro1 = new Libro(1, "Harry Potter", "J.K. Rowling", "Un niño con magia", false); // Inicialmente no disponible
        Libro libro2 = new Libro(2, "El Hobbit", "J.R.R. Tolkien", "Una aventura épica", true);

        biblo.agregarLibro(libro1);
        biblo.agregarLibro(libro2);

        // Intentar devolver un libro
        boolean exitoDevolucion = biblo.devolverLibro("Harry Potter");

        // Imprimir el resultado de la devolución
        if (exitoDevolucion) {
            System.out.println("El libro ha sido devuelto con éxito.");
        } else {
            System.out.println("El libro no se encontró o ya estaba disponible.");
        }

        // Mostrar el estado actual de los libros
        System.out.println("Estado actual de los libros:");
        for (Libro libro : biblo.libros) {
            System.out.println(libro); // Imprime el libro, invocando el toString()
        }
    }
}


