package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio16 {
    public static boolean verificarNumeroEnArray(int valor, ArrayList<Integer> array, boolean encontrado) {
        // for (Integer valor:array)
        for (int i = 0; i < array.size() && !encontrado; i++) {
            if (array.get(i).equals(valor)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void mensajeFinal(boolean encontrado, int valor) {
        if (encontrado = true){
            System.out.println("El numero " + valor + " si esta");
        } else {
            System.out.println("El numero " + valor + " no esta");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(22, 15, 66, 74, 33));
        boolean verificado = false;
        System.out.print("Introduce un numero que quieras buscar: ");
        int numero = scanner.nextInt();
        verificarNumeroEnArray(numero, numeros, verificado);
        mensajeFinal(verificado, numero);
        scanner.close();

    }
}
