package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DECLARAMOS ARRAY
        ArrayList<String> nombreReservas = new ArrayList<>(
                Arrays.asList("Laura", "Victoria", "Pedro", "Alejandro"));
        ArrayList<Integer> cantidadPersonas = new ArrayList<>(
                Arrays.asList(2, 5, 3, 7));
        // DECLARAMOS VARIABLES
        int opcion = 0;
        String mensaje = "1. Añadir reserva. \n2. Ver reservas. \n3. Total personas. \n4. Cancelar. \n5. Salir.";
        String nombre;
        int personas;
        int total;
        boolean encontrado = false;
        // CREAMOS EL MENU
        while (opcion != 5) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Nombre:");
                nombre = scanner.next();
                System.out.println("Número de personas:");
                personas = scanner.nextInt();
                nombreReservas.add(nombre);
                cantidadPersonas.add(personas);
            } else if (opcion == 2) {
                System.out.println("Reservas: ");
                for (int i = 0; i < nombreReservas.size(); i++) {
                    System.out.println(nombreReservas.get(i) + " - " + cantidadPersonas.get(i));
                }
            } else if (opcion == 3) {
                total = 0;
                for (int i = 0; i < cantidadPersonas.size(); i++)
                    total += cantidadPersonas.get(i);
                System.out.println("Total personas: " + total);
            } else if (opcion == 4) {
                System.out.println("Nombre a cancelar:");
                nombre = scanner.next();
                for (int i = 0; i < nombreReservas.size() && !encontrado; i++) {
                    if (nombreReservas.get(i).equals(nombre)) {
                        encontrado = true;
                        nombreReservas.remove(nombreReservas.size() - 1);
                        cantidadPersonas.remove(cantidadPersonas.size() - 1);
                    }
                }
            }
        }
        scanner.close();
    }
}
