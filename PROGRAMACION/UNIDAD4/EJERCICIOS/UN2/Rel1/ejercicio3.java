package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        System.out.println(String.join(", ", colores));
//ejercicio 3
        int ultimoColor = colores.size() - 1;
        colores.remove(ultimoColor);
        System.out.println(String.join(", ", colores));
    }
}
