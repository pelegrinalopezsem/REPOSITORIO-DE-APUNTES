package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel0;

import java.util.ArrayList;

public class ejercicio17 {
    public static String revertirCadena(String cadenaTexto) {
        String cadenaInvertida;
        for (int i = cadenaTexto.length(); i >= 0; i--){
            cadenaInvertida += cadenaTexto.charAt(i);
        }
        return cadenaInvertida;
    }

    public static void main(String[] args) {
        String resultadoInvertirCadena = revertirCadena("Hola Buenas");
    }
}
