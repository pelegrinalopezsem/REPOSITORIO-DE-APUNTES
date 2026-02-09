package PROGRAMACION.UNIDAD4.EJERCICIOS.UN3.Rel0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {
    public static  ArrayList<Integer> filtrarNumerosMayores(ArrayList<Integer> array, int valor) {
        ArrayList<Integer> numerosMayores = new ArrayList<Integer>();
        int elementoActual;
        for (int i = 0; i < array.size(); i++) {
            //Declarar array.get(i)
            elementoActual = array.get(i);
            if (valor < elementoActual)
                numerosMayores.add(elementoActual);
        }
        return numerosMayores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(22, 15, 66, 74, 33));
        System.out.print("INTRODUCE EL NUMERO: ");
        int numero = scanner.nextInt();
        filtrarNumerosMayores(numeros, numero);
        //No se puede mostrar FUNCIONES EN SYSTEM.OUT
        System.out.println(filtrarNumerosMayores(numeros, numero));
        scanner.close();
    }
}
