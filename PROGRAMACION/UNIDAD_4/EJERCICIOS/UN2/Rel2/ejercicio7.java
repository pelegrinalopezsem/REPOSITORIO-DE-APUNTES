package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DECLARAMOS ARRAY
        ArrayList<String> nombreGastos = new ArrayList<String>();
        ArrayList<Integer> cantidadGastos = new ArrayList<Integer>();
        // DECLARACION DE VARIABLES
        int opcion = 0;
        String nombre;
        int cantidad;
        int total;
        int posMax;
        int posMin;
        String mensaje = "1. Añadir gasto. \n2. Ver total. \n3. Ver máximo y mínimo. \n4. Promedio diario. \n5. Salir.";
        // CREACION DE MENU
        while (opcion != 5) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Nombre del gasto:");
                nombre = scanner.next();
                System.out.println("Cantidad:");
                cantidad = scanner.nextInt();
                nombreGastos.add(nombre);
                cantidadGastos.add(cantidad);
            } else if (opcion == 2) {
                total = 0;
                for (int i = 0; i < cantidadGastos.size(); i++) {
                    total += cantidadGastos.get(i);
                }
                System.out.println("Total: " + total + "€");
            } else if (opcion == 3) {
                posMax = 0;
                posMin = 0;
                for (int i = 1; i < cantidadGastos.size(); i++) {
                    if (cantidadGastos.get(i) > cantidadGastos.get(posMax))
                        posMax = i;
                    if (cantidadGastos.get(i) < cantidadGastos.get(posMin))
                        posMin = i;
                }
                System.out.println("Mayor: " + nombreGastos.get(posMax) + " - " + cantidadGastos.get(posMax) + "\u20AC");
                System.out.println("Menor: " + nombreGastos.get(posMin) + " - " + cantidadGastos.get(posMin) + "\u20AC");
            } else if (opcion == 4) {
                total = 0;
                for (int i = 0; i < cantidadGastos.size(); i++)
                    total += cantidadGastos.get(i);
                System.out.println("Promedio diario: " + (total / 30));
            }
        }
        scanner.close();
    }
}
