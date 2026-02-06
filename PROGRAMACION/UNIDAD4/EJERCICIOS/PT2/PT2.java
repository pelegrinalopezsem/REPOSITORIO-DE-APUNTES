package PROGRAMACION.UNIDAD4.EJERCICIOS.PT2;

import java.util.Scanner;
import java.util.ArrayList;

public class PT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tableroInterno = new ArrayList<Integer>();
        ArrayList<String> tableroVisible = new ArrayList<String>();
        // Definimos constantes
        final String DIENTE = "D";
        final int NUMDIENTES = 10;
        final int MAXDIENTESPICADOS = 5;
        final String DIENTESANO = "S";
        final String DIENTEDANIADO = "R";
        final int DIENTESPICADOS = (int) Math.floor(Math.random() * MAXDIENTESPICADOS) + 1;
        final int DIENTESNOPICADOS = NUMDIENTES - DIENTESPICADOS;
        final String JUGADOR1 = "Jugador 1";
        final String JUGADOR2 = "Jugador 2";
        // Definimos variables
        boolean juegoPerdido = false;
        String jugadorActual = JUGADOR1;
        String mensajeFinPrograma = "Enhorabuena, ambos ganan";
        int posicionSeleccionada = 0;
        int posicionDienteIntroducir = 0;

        // Creamos el tablero interno del juego
        for (int i = 0; i < NUMDIENTES; i++) {
            tableroInterno.add(0);
        }
        while (tableroInterno.get(posicionDienteIntroducir) == 0) {
            posicionDienteIntroducir = (int) Math.floor(Math.random() * NUMDIENTES);
            if (tableroInterno.get(posicionDienteIntroducir) == 0) {
                tableroInterno.set(posicionDienteIntroducir, 1);
            }
        }
        // Ahora creamos el tablero visible
        for (int i = 0; i < NUMDIENTES; i++) {
            tableroVisible.add(DIENTE);
        }
        for (int i = 0; i < DIENTESNOPICADOS && !juegoPerdido; i++) {
            do {
                try {
                    System.out.print(jugadorActual + " elige: ");
                    posicionSeleccionada = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: debes introducir un número entero válido.");
                }
            } while (posicionSeleccionada < 0 ||
                    posicionSeleccionada >= NUMDIENTES ||
                    !tableroVisible.get(posicionSeleccionada).equals(DIENTE));
            {
                if (tableroInterno.get(posicionSeleccionada) == 0) {
                    tableroVisible.set(posicionSeleccionada, DIENTESANO);
                } else {
                    tableroVisible.set(posicionSeleccionada, DIENTEDANIADO);
                    System.out.println("¡El cocodrilo mordió! " + jugadorActual + " pierde.");
                    juegoPerdido = true;
                }
                System.out.println(tableroVisible);
                if (jugadorActual.equals(JUGADOR1)) {
                    jugadorActual = JUGADOR2;
                } else {
                    jugadorActual = JUGADOR1;
                }
            }
        }
        if (juegoPerdido == false) {
            System.out.println(mensajeFinPrograma);
        }
        scanner.close();
    }
}
