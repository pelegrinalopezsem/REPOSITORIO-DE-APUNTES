package ED.UNIDAD4.ejercicios_java;

import java.util.Scanner;

public class ejercicio5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaramos variables
        int numero;
        final int DIEZ = 10;
        final int VEINTE = 20;

        // Pedimos el numero
        System.out.print("Ingresa el numero: ");
        numero = scanner.nextInt();
        scanner.close();

        // Creamos la condicion
        if (numero >= DIEZ && numero <= VEINTE) {
            System.out.println("Este numero " + numero + " esta entre el 10 y el 20");
        } else if (numero < 10) {
            System.out.println("Este numero " + numero + " es mas pequeño que 10");
        } else {
            System.out.println("Este numero " + numero + " es mas grande que 20");
        }
    }
}


