package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("manzana", "banana", "naranja"));
        frutas.remove(0);
        frutas.add("fresas");
        System.out.println(String.join(", ", frutas));
    }
}
