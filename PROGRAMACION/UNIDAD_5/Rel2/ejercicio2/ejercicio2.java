package PROGRAMACION.UNIDAD_5.Rel2.ejercicio2;

public class ejercicio2 {
        public static void main(String[] args) {
            Libro libro1 = new Libro(0, "harry potter", "pepe", "niño autista", false);
            Biblioteca biblo = new Biblioteca();
            biblo.agregarLibro(libro1);
        }
}
