package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(100,200,300));
        int tmp = numeros.get(2);
        String mensaje = "";
        numeros.set(2, numeros.get(0));
        numeros.set(0, tmp);
        for (Integer numero : numeros) {
            mensaje += numero + ", ";
        }
        mensaje = mensaje.substring(0, mensaje.length() - 2);
        System.out.println(mensaje);
    }
}
