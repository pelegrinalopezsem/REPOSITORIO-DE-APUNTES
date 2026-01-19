package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        System.out.println(colores);
//ejercicio 3
        int ultimoColor = colores.size() - 1;
        colores.remove(ultimoColor);
        System.out.println(colores);
    }
}
