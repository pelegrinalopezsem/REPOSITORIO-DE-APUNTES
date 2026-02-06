package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;

public class ejercicio16 {
    public static void main(String[] args) {
        ArrayList<Integer> secuencia = new ArrayList<Integer>();
        final int CANTIDADNUMEROS = 5;
        String mensaje = "";
        for (int i = 1; i <= CANTIDADNUMEROS; i++) {
            secuencia.add(i);
        }
        for (Integer numero : secuencia) {
            mensaje += numero + ", ";
        }
        mensaje = mensaje.substring(0, mensaje.length() - 2);
        System.out.println(mensaje);
    }
}
