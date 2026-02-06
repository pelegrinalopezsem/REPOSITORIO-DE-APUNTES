//EJERCICIO 9 HAY QUE PASARLO HA JAVA

// let numeroDeCaramelos = Number(prompt("¿Cuántos caramelos tienes?"))
// let numeroDeNinios = Number(prompt("¿Cuántos niños hay?"))

// let caramelosPorNinio = parseInt(numeroDeCaramelos / numeroDeNinios)
// let restoDeCaramelos = numeroDeCaramelos % numeroDeNinios

// console.log("A cada niño le tocan " + caramelosPorNinio + " caramelos y han sobrado " + restoDeCaramelos)

package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN1.Rel1;

import java.util.Scanner;

public class ejercicio9 {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
// Declaracion de variables
                int caramelos = 0;
                int numNiños = 0;
                int caramelosPorNinio = 0;
                int restoDeCaramelos = 0;

// Pedir al usuario que nos diga el numero de caramelos que tiene
                System.out.print("Ingrese el numero de caramelos: ");
                caramelos = scanner.nextInt();

// Pedir al usuario el numeros de niños que hay en total
                System.out.print("Ingrese el numero niños: ");
                numNiños = scanner.nextInt();

// Hacemos la division para saber cuantos caramelos le toca ha cada niño
                caramelosPorNinio = caramelos / numNiños;

// Calculamos el resto de caramelos
                restoDeCaramelos = caramelos % numNiños;

// Mostramos en terminal
                System.out.println("A cada niño le tocan " + caramelosPorNinio + " caramelos y ha sobrado " + restoDeCaramelos);

// Cerrar el objeto Scanner
                scanner.close();
        }
}
