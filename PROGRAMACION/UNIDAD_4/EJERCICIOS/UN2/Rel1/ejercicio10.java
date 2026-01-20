package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;

public class ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> pila = new ArrayList<Integer>();
        String mensaje = "";
        pila.add(10);
        pila.add(20);
        pila.add(30);
        for (Integer numero : pila) {
            mensaje += numero + ", ";
        }
        mensaje = mensaje.substring(0, mensaje.length() - 2);
        System.out.println(mensaje);
        for (int i = 2; i > -1; i--) {
            System.out.println("Cliente atendido: " + pila.get(i));
            pila.remove(i);
            mensaje = mensaje.substring(0, mensaje.length() - 3);
            System.out.println(mensaje);
        }
    }
}
