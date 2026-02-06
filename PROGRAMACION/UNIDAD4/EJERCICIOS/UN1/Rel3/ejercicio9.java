//EJERCICIO 9 DE LA UNIDAD 1 - REL3

// //Definimos las variables
// let numero = (prompt("Introduce un numero con dos cifras"))

// //Separamos los numeros
// let primeracifra = Number(numero.charAt(0))
// let segundaCifra = Number(numero.charAt(1))

// //Creamos una condicion
// if (numero >= 10 && numero <= 99) {
//         let suma = (primeracifra + segundaCifra)
//     console.log ("La suma es " + suma)
// }

// //Mostramos en consola los dos digitos
// console.log ("La primera cifra es " + primeracifra)
// console.log ("La segunda cifra es " + segundaCifra)


package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN1.Rel3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma;
        int primeraCifra;
        int segundaCifra;
// Pedimos al usuario el numero
        System.out.print("Ingresa el numero: ");
        numero = scanner.nextInt();

//Vamos a separar los digitos
    primeraCifra = numero / 10;
    segundaCifra = numero % 10;
    suma = primeraCifra + segundaCifra;
    System.out.println("La suma de " + primeraCifra + " + " + segundaCifra + " es: " + suma);
    scanner.close();

    }
}
//Preguntar al profesro como se podria hacer con el chaAt
