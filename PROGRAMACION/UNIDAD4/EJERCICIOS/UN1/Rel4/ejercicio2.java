package PROGRAMACION.UNIDAD4.EJERCICIOS.UN1.Rel4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Declaramos las variables
        int numero;
        int numeroSecreto = 8;

//Pedimos al usuario el numero
        System.out.print("Introduce un numero: ");
        numero = scanner.nextInt();

//Creamos el bucle
        while (numero != numeroSecreto) {
            System.out.println("El numero " + numero + " es incorrecto");
            System.out.print("Introduce un numero: ");
            numero = scanner.nextInt();
        }
        if (numero == numeroSecreto){
            System.out.println("El numero " + numero + " es el numero secreto");
        }
    }
}
