//EJERCICIO 9 DE LA UNIDAD 1 - REL3

// //Definimos las variables
// let numero = (prompt("Introduce un numero con dos cifras"))

// //Separamos los numeros
// let primeracifra = Number(numero.charAt(0))
// let segundacifra = Number(numero.charAt(1))

// //Creamos una condicion
// if (numero >= 10 && numero <= 99) {
//         let suma = (primeracifra + segundacifra)
//     console.log ("La suma es " + suma)
// }

// //Mostramos en consola los dos digitos
// console.log ("La primera cifra es " + primeracifra)
// console.log ("La segunda cifra es " + segundacifra)


package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN1.Rel3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        final int MINIMO = 10;
        final int MAXIMO = 99;
        int suma;

// Pedimos al usuario el numero
        System.out.print("Ingresa el numero: ");
        numero = scanner.next();

//Vamos a separar los digitos
        char primeraCifra = numero.charAt(0);
        char segundaCifra = numero.charAt(1);
    
    scanner.close();

//Creamos la condicion
        if (numero >= MINIMO && numero <= MAXIMO){
            suma = primeraCifra + segundaCifra;
            System.out.println("La suma de " + primeraCifra + " + " + segundaCifra + " es: " + suma);
        } else {
            System.out.println("El numero es o mas chico que 10 o mas grande que 99");
        }
    }
}

//Preguntar al profesro como se podria hacer con el chaAt
