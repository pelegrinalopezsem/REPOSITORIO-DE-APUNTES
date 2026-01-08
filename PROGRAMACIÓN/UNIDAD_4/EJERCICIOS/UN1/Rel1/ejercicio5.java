//EJERCICIO 5 DE LA UNIDAD 1 HAY QUE PASARLO A JAVA

// let pesoEnLaTierra = prompt("Introduzca su peso: ")
// pesoEnLaTierra = Number(pesoEnLaTierra)

// let pesoEnLaLuna = pesoEnLaTierra * 0.165 // 16.5 / 100 = 0.165

// console.log("En la Luna pesarías: " + pesoEnLaLuna + "kg")

package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN1.Rel1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        final double PESOENLALUNA = 0.165;
        Scanner scanner = new Scanner(System.in);

//Se pide el peso del usuario
        System.out.print("Ingrese tu peso: ");
        int peso = scanner.nextInt();

        System.out.println("En la luna pesarias: " + peso * PESOENLALUNA + " kg");
    }
}
