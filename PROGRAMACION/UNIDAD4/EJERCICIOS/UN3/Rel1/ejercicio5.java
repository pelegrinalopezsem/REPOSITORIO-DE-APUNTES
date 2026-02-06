package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel1;

import java.util.ArrayList;

public class ejercicio5 {

    // Método para simular el lanzamiento de una moneda
    public static String caraOcruz() {
        int moneda = (int) Math.floor(Math.random() * 2); // 0 o 1
        if (moneda == 0) {
            return "cara";
        } else {
            return "cruz";
        }
    }

    // Método para generar una lista de resultados de lanzamientos de moneda
    public static ArrayList<String> listaCaras0Cruces(int cantidad) {
        ArrayList<String> listaDeResultados = new ArrayList<String>();
        for (int i = 0; i < cantidad; i++) {
            listaDeResultados.add(caraOcruz()); // Llamamos a caraOcruz() para cada intento
        }
        return listaDeResultados;
    }

    public static void main(String[] args) {
        int cantidad = 10; // Definimos la cantidad de lanzamientos
        ArrayList<String> lista = listaCaras0Cruces(cantidad); // Obtenemos la lista de resultados
        System.out.println(lista); // Imprimimos la lista
    }
}
