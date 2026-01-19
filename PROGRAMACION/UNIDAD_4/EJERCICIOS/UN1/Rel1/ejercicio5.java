//EJERCICIO 5 DE LA UNIDAD 1 HAY QUE PASARLO A JAVA

// let pesoEnLaTierra = prompt("Introduzca su peso: ")
// pesoEnLaTierra = Number(pesoEnLaTierra)

// let pesoEnLaLuna = pesoEnLaTierra * 0.165 // 16.5 / 100 = 0.165

// console.log("En la Luna pesarías: " + pesoEnLaLuna + "kg")

package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN1.Rel1;

import java.util.Scanner;

public class ejercicio5 {
        public static void main(String[] args) {
//Declaracion de variables
                final double PESOENLALUNA = 0.165;
                Scanner scanner = new Scanner(System.in);
                double peso = 0;
                double pesoUsuarioEnLaLuna = 0;

//Le pedimos al usuario su peso
                System.out.print("Ingrese tu peso: ");
                peso = scanner.nextDouble();

// Se calcula multiplicacion
                pesoUsuarioEnLaLuna = peso * PESOENLALUNA;

// Que muestre en la terminal
                System.out.printf("En la luna pesarias: %.2f kg\n", pesoUsuarioEnLaLuna);
                scanner.close();
        }
}
