package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel1;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio8 {

    public static String elementoAleatorio (ArrayList<String> array){
        int numeroAbecedario = (int) (Math.random() * array.size()) ;
        return array.get(numeroAbecedario);
    }

    public static void main(String[] args) {
        ArrayList<String> abecedario = new ArrayList<>(
                Arrays.asList(
                        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                        "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
                elementoAleatorio(abecedario);
                System.out.println(elementoAleatorio(abecedario));
    }
}
