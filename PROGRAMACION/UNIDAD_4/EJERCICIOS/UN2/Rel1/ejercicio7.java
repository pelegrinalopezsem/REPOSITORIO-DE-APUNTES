package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<>(Arrays.asList("L", "M", "X", "J", "V", "S", "domingo"));
        dias.set(6,  "Domingo (fin de semana)");
        System.out.println(String.join(", ", dias));
    }
}
