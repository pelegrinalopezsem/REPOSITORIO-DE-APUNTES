package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN2.Rel1;

import java.util.ArrayList;

public class ejercicio9 {
    public static void main(String[] args) {
        ArrayList<String> cola = new ArrayList<String>();
        cola.add("cliente1");
        cola.add("cliente2");
        cola.add("cliente3");
        for (int i = 0; i < 3; i++){
            System.out.println("Cliente atendido: " + cola.get(0));
            cola.remove(0);
            System.out.println(cola);
        }
    }
}
