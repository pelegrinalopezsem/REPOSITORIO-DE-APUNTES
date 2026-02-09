package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        int primerNumero = numeros.get(0);
        int ultimoNUmero = numeros.get(numeros.size() - 1) ;
        System.out.println("El primer numero es " + primerNumero);
        System.out.println("El ultimo numero es " + ultimoNUmero);
    }
}
