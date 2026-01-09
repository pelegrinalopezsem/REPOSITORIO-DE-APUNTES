package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN1.Rel4;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Declaramos las variables
        int numero;
        final int DIEZ = 10;
        int multiplicacion;

//Pedimos el numero
        System.out.print("Introduce el numero: ");
        numero = scanner.nextInt();

//Creamos el bucle
        for (int i = 1; i <= DIEZ; i++) {
            multiplicacion = numero * i;
            System.out.println(" - " + numero + " x " + i + " = " + multiplicacion);
        }
        scanner.close();
    }
}
