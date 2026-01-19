package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio14 {
        public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5,10,15,20));
        int primerNumero = numeros.get(0);
        numeros.add(primerNumero);
        numeros.remove(0);
        System.out.println(numeros);
    }
}
