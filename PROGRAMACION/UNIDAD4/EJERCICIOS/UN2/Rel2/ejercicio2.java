package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> jugadores = new ArrayList<>(
                Arrays.asList("Jugador1", "Jugador2", "Jugador3", "Jugador4", "Jugador5"));
        ArrayList<Integer> puntuaciones = new ArrayList<>(Arrays.asList(120, 200, 150, 180, 220));
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String nombreJugadorNuevo;
        int puntuacionJugadorNuevo;
        final String MENSAJE = "1. Añadir jugador\n2. Ver jugadores \n3. Salir";
        while (opcion != 3) {
            System.out.println(MENSAJE);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Introduce el nombre del nuevo jugador: ");
                nombreJugadorNuevo = scanner.next();
                System.out.println("Introduce la puntuación del nuevo jugador:");
                puntuacionJugadorNuevo = scanner.nextInt();
                jugadores.add(nombreJugadorNuevo);
                puntuaciones.add(puntuacionJugadorNuevo);
            } else if (opcion == 2){
                System.out.println("Jugador - Puntuación");
                for (int i = 0; i < jugadores.size(); i++) {
                    System.out.println(jugadores.get(i) + " - " + puntuaciones.get(i));
                }
            }
        }
        scanner.close();
    }
}
