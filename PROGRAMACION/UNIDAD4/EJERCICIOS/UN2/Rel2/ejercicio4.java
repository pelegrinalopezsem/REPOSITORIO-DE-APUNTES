package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> libros = new ArrayList<>(
                Arrays.asList("El quijote", "La Biblia", "Manual de resistencia", "La criada"));
        ArrayList<Integer> cantidades = new ArrayList<>(
                Arrays.asList(5, 3, 1, 7));
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String libroNuevo;
        int cantidadLibroNuevo;
        String libroActualizado;
        int cantidadLibroActualizado;
        boolean encontrado = false;
        String mensaje = " 1. Añadir un nuevo libro. \n2. Actualizar cantidad. \n3. Ver inventario. \n4. Salir.";
        while (opcion != 4) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Introduzca el nombre del libro:");
                libroNuevo = scanner.next();
                System.out.print("Cantidad disponible:");
                cantidadLibroNuevo = scanner.nextInt();
                libros.add(libroNuevo);
                cantidades.add(cantidadLibroNuevo);
            } else if (opcion == 2) {
                System.out.print("Nombre del libro a actualizar:");
                libroActualizado = scanner.next();
                System.out.println("Nueva cantidad:");
                cantidadLibroActualizado = scanner.nextInt();
                for (int i = 0; i < libros.size() && !encontrado; i++) {
                    if (libros.get(i).equals(libroActualizado)) {
                        encontrado = true;
                        cantidades.set(i, cantidadLibroActualizado);
                    }
                }
                if (!encontrado) {
                    System.out.println("Libro no encontrado");
                }
            } else if (opcion == 3) {
                System.out.println("Inventario:");
                for (int i = 0; i < libros.size(); i++) {
                    System.out.println(libros.get(i) + " - " + cantidades.get(i) + " unidades");
                }
            }
        }
        scanner.close();
    }
}
