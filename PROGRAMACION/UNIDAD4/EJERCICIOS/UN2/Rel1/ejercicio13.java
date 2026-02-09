package PROGRAMACION.UNIDAD4.EJERCICIOS.UN2.Rel1;
import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio13 {
    public static void main(String[] args) {
        ArrayList<String> letras = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> letrasInvertidas = new ArrayList<>();

        for (int i = letras.size() - 1; i >= 0; i--) {
            letrasInvertidas.add(letras.get(i));
        }

        System.out.println(String.join(", ", letrasInvertidas));
    }
}
