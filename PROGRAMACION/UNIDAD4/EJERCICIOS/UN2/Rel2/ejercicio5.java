package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel2;


import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> calificaciones = new ArrayList<Integer>();
        final int CERO = 0;
        int opcion = 0;
        String nombreNuevo;
        int NotaNueva;
        int max;
        String nombreMax;
        int min;
        String nombreMin;
        int suma = 0;
        int media;
        String mensaje = "1. Añadir estudiante.\n" + //
                "2. Ver media.\n" + //
                "3. Nota más alta.\n" + //
                "4. Nota más baja.\n" + "5. Salir.";
        while (opcion != 5) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Nombre del alumno:");
                nombreNuevo = scanner.next();
                System.out.print("Calificación del alumno:");
                NotaNueva = scanner.nextInt();
                nombres.add(nombreNuevo);
                calificaciones.add(NotaNueva);
            } else if (opcion == 2) {
                for (int i = 0; i < calificaciones.size(); i++) {
                    suma += calificaciones.get(i);
                }
                media = suma / calificaciones.size();
                System.out.println("La media es " + media);
            } else if (opcion == 3) {
                max = calificaciones.get(CERO);
                nombreMax = nombres.get(CERO);
                for (int i = 1; i < calificaciones.size(); i++) {
                    if (calificaciones.get(i) > max) {
                        max = calificaciones.get(i);
                        nombreMax = nombres.get(i);
                    }
                }
                System.out.println("Máxima calificación: " + nombreMax + " (" + max + ")");
            } else if (opcion == 4) {
                min = calificaciones.get(CERO);
                nombreMin = nombres.get(CERO);
                for (int i = 1; i < calificaciones.size(); i++) {
                    if (calificaciones.get(i) < min) {
                        min = calificaciones.get(i);
                        nombreMin = nombres.get(i);
                    }
                }
                System.out.println("Mínima calificación: " + nombreMin + " (" + min + ")");
            }
        }
        scanner.close();
    }
}
