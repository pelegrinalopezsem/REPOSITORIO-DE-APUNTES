package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DECLARAMOS ARRAY
        ArrayList<String> tareas = new ArrayList<>(
                Arrays.asList("tarea1", "tarea2", "tarea3"));
        ArrayList<Boolean> completadas = new ArrayList<>(
                Arrays.asList(false, true, false));
        ArrayList<String> pendientes = new ArrayList<String>();
        ArrayList<String> hechas = new ArrayList<String>();
        // DECLARAMOS VARIABLES
        int opcion = 0;
        Boolean encontrado = false;
        String buscar;
        String nueva;
        String mensaje = "1. Añadir tarea.\n" + //
                "2. Marcar completada.\n" + //
                "3. Ver pendientes.\n" + //
                "4. Ver completadas.\n" + "5. Salir.";
        // EMPEZAMOS EL MENU
        while (opcion != 5) {
            System.out.print(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Nueva tarea:");
                nueva = scanner.next();
                tareas.add(nueva);
                completadas.add(false);
            } else if (opcion == 2) {
                System.out.println("Nombre de la tarea:");
                buscar = scanner.next();
                for (int i = 0; i < tareas.size() && !encontrado; i++) {
                    if (tareas.get(i).equals(buscar)) {
                        encontrado = true;
                        completadas.set(i, true);
                    }
                }
                if (!encontrado)
                    System.out.println("No encontrada");

            } else if (opcion == 3) {
                for (int i = 0; i < completadas.size(); i++) {
                    if (!completadas.get(i))
                        pendientes.add(tareas.get(i));
                }
                System.out.println("Pendientes: " + pendientes);
            } else if (opcion == 4) {
                for (int i = 0; i < completadas.size(); i++) {
                    if (completadas.get(i))
                        hechas.add(tareas.get(i));
                }
                System.out.println("Completadas: " + hechas);
            }
        }
        scanner.close();
    }
}
