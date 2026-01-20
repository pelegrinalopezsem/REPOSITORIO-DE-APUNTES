package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>(Arrays.asList("Manzanas", "Plátanos", "Leche", "Pan", "Huevos",
                "Azúcar", "Harina", "Arroz", "Pasta", "Café"));
        ArrayList<Double> precios = new ArrayList<>(
                Arrays.asList(1.20, 0.80, 1.50, 1.00, 2.00, 1.10, 0.90, 0.70, 1.30, 3.00));
        Scanner scanner = new Scanner(System.in);
        String productoUsuario = "";
        int cantidadProducto = 0;
        double subtotal;
        int total = 0;
        boolean encontrado = false;
        while (productoUsuario != "FIN") {
            System.out.print("Introduzca el nombre del producto: ");
            productoUsuario = scanner.next();
                System.out.print("Introduzca la cantidad comprada: ");
                cantidadProducto = scanner.nextInt();
                for (int i = 0; i < productos.size() && !encontrado; i++) {
                    if (productos.get(i).equals(productoUsuario)) {
                        encontrado = true;
                        subtotal = precios.get(i) * cantidadProducto;
                        total += subtotal;
                        System.out.println(productoUsuario + " - " + cantidadProducto + ": " + subtotal + "€");
                    }
            }
        }
        System.out.println("TOTAL: " + total + "€");
        scanner.close();
    }
}
