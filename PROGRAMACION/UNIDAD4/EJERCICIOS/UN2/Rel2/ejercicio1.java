package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel2;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> temperaturas = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int temperaturaSolicitada;
        int opcion = 0;
        int temperaturaMaxima;
        int temperaturaMinima;
        int sumatorioTemperaturas = 0;
        int temperaturaMedia;
        final String mensaje = "\"1. Mostrar la temperatura más alta registrada.\n 2. Mostrar la temperatura más baja registrada.\n 3. Calcular la temperatura promedio de la semana.\n"
                + "4. Salir del programa.\"";

        for (int i = 1; i <= 7; i++) {
            while (true) {
                try {
                    System.out.print("Inserte la temperatura del día " + i + ": ");
                    temperaturaSolicitada = Integer.parseInt(scanner.nextLine());
                    temperaturas.add(temperaturaSolicitada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: debes introducir un número entero válido.");
                }
            }
        }

        // Menú de opciones
        while (opcion != 4) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();

            if (opcion == 1) {
                temperaturaMaxima = temperaturas.get(0);
                for (int i = 1; i < temperaturas.size(); i++) {
                    if (temperaturas.get(i) > temperaturaMaxima) {
                        temperaturaMaxima = temperaturas.get(i);
                    }
                }
                System.out.println("La temperatura máxima es de " + temperaturaMaxima + " ºC");
            } else if (opcion == 2) {
                temperaturaMinima = temperaturas.get(0);
                for (int i = 1; i < temperaturas.size(); i++) {
                    if (temperaturas.get(i) < temperaturaMinima) {
                        temperaturaMinima = temperaturas.get(i);
                    }
                }
                System.out.println("La temperatura mínima es de " + temperaturaMinima + " ºC");
            } else if (opcion == 3) {
                for (int i = 0; i < temperaturas.size(); i++) {
                    sumatorioTemperaturas += temperaturas.get(i);
                }
                temperaturaMedia = sumatorioTemperaturas / temperaturas.size();
                System.out.println("La temperatura media es de " + temperaturaMedia + " ºC");
            }
        }

        scanner.close();
    }
}
