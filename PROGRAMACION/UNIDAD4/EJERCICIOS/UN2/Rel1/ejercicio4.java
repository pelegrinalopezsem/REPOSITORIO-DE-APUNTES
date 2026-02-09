package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>(Arrays.asList("perro", "gato"));
        animales.add(0,"loro");
        animales.add(0,"tortuga");
        System.out.println(String.join(", ", animales));
    }
}
