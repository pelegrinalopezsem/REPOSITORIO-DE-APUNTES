package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel2;

import java.util.ArrayList;
import java.util.Arrays;
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
        String mensaje = "1. Añadir gasto. \n2. Ver total. \n3. Ver máximo y mínimo. \n4. Promedio diario. \n5. Salir.";
        //CREACION DE MENU
        while (opcion != 5) {
            System.out.println(mensaje);
            opcion = scanner.nextInt();
            if (opcion == 1){
                System.out.println("Nombre del gasto:");
                nombre = scanner.next();
                System.out.println("Cantidad:");
                cantidad = scanner.nextInt();
                nombreGastos.add(nombre);
                cantidadGastos.add(cantidad);
            } else if (opcion == 2){
                total = 0;
                for (int i = 0; i < cantidadGastos.size(); i++){
                    total += cantidadGastos.get(i);
                } 
                System.out.println("Total: " + total + "€");
            } 
        }
    }
}
