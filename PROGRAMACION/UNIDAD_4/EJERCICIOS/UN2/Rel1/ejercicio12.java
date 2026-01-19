package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio12 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Pedro"));
        nombres.add("Laura");
        nombres.add(0, "Carlos");
        System.out.println(nombres);
        // Ejercicio 12
        System.out.println(nombres + " Hemos elimiado a " + nombres.get(0) + " y a " + nombres.get(nombres.size() - 1));
        nombres.remove(0);
        nombres.remove(nombres.size() - 1);
        System.out.println(nombres);
    }
}
