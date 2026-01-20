package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio11 {
        public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana" , "Pedro"));
        nombres.add("Laura");
        nombres.add(0, "Carlos");
        System.out.println(String.join(", ", nombres));
    }
}
