package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio15 {
            public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            while (valores.size() != 0) {
                valores.remove(0);
                System.out.println(valores);
            }
    }
}
