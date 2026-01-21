package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel0;


import java.util.Scanner;

public class ejercicio17 {
    /** Invierte la orientacion de la palabra.
    * @param texto 
    * @return
    */
    public static String revertirCadena(String cadena) {
        String cadenaRevertida = "";
        for (int i = cadena.length(); i > 0; i--) {
            cadenaRevertida += cadena.charAt(i-1);
        }
        return cadenaRevertida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        scanner.close();
        System.out.println("Cadena revertida: " + revertirCadena(texto));
    }
}
