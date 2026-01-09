//EJERCICIO 7 DE LA UNIDAD 1 - REL 3

// //Definimos las variables
// let numero1 = Number(prompt("Introduce un numero: "))
// let numero2 = Number(prompt("Introduce un numero: "))
// let operacion = prompt("Introduce una operacion (`+`, `-`, `*`, `/`) ")
// let suma = operacion == "+"
// let resultado = operacion == "-"
// let division = operacion == "/"
// let multiplicacion = operacion == "*"

// //Realizamos una condicion
// if (suma) {
//         let operacionsuma = parseInt(numero1 + numero2)
//     console.log("El resultado es " + operacionsuma)
// } else if (resultado) {
//         let operacionresultado = parseInt(numero1 - numero2)
//     console.log("El resultado es " + operacionresultado)
// } else if (multiplicacion) {
//         let operacionmultiplicaion = numero1 * numero2
//     console.log("El resultado es " + operacionmultiplicaion)
// } else if (division && cero) {
//         let operaciondivision =  numero1 / numero2
//         let cero = (numero2 == "0")
//     console.log("Nah")
// } else if (division) {
//     console.log ("El resultado es " + operaciondivision)
// } else {
//     console.log ("Operacion no valida")
// }


package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN1.Rel3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

//Declaracion de variables
        Scanner scanner = new Scanner(System.in);
        int numero1 ;
        int numero2 ;
        String operacion = "";
        int resultado ;
        
        //Pedimos al usuario los dos numeros y la
        System.out.print("Ingrese el primer numero: ");
        numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();
        
        System.out.print("La operacion que quieres hacer(+,-,/,*): ");
        operacion = scanner.next();
        
//creamos las condiciones
        boolean suma = operacion.equals("+") ;
        boolean resta = operacion.equals("-");
        boolean division = operacion.equals("/");
        boolean multiplicacion = operacion.equals("*");

//Hacemos la condicion
        if (suma) {
            resultado = numero1 + numero2;
            System.out.println("El resultado es " + resultado);
        } else if (resta) {
            resultado = numero1 - numero2;
            System.out.println("El resultado es " + resultado);
        } else if (division) {
            if (numero2 != 0 ) {
                resultado = numero1 / numero2;
                System.out.println("El resultado es " + resultado);
            }else {
                System.out.println("Nah");
            }
        } else if (multiplicacion){
            resultado = numero1 * numero2;
            System.out.println("El resultado es " + resultado);
        } else {
            System.out.println("Operacion no valida");
        }
        scanner.close();
    }
}
