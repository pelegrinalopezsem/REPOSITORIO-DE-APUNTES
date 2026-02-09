package PROGRAMACION.UNIDAD4.EJERCICIOS.UN3.Rel0;

public class ejercicio19 {
    public static String capitalizarPrimeraLetra(String cadena) {
        return Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
    }

    public static void main(String[] args) {

        System.out.println(capitalizarPrimeraLetra("hola"));
    }
}

