//EJERCICIO 5 DE LA RELACION 3 DE LA UNI 1

// //Definimos variables
//     let numero = Number(prompt("Introduce un numero:"))

// //Creamos una condicion
//     if (numero >= 10 && numero <= 20) {
//         console.log("Este numero " + numero + " esta entre el 10 y el 20")
//     } else if (numero < 10) {
//         console.log("Este numero " + numero + " es mas pequeño que 10")
//     } else if (numero > 20) {
//         console.log("Este numero " + numero + " es mas grande que 20")
//     }

package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN1.Rel3;

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
