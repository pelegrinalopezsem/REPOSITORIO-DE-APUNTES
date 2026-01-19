package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(100,200,300));
        int tmp = numeros.get(2);
        numeros.set(2, numeros.get(0));
        numeros.set(0, tmp);
        System.out.println(numeros);
    }
}
