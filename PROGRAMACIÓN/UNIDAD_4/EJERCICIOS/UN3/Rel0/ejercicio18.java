package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN3.Rel0;

public class ejercicio18 {
    public static int contarVocalesEnCadena (String cadenaTexto){
        cadenaTexto = cadenaTexto.toLowerCase();
        int contadorTotalVocales = 0;
        for (int i = 0; i <= cadenaTexto.length(); i++){
            char letraCadena = cadenaTexto.charAt(i);
            if (letraCadena == "A" || letraCadena == "E" || letraCadena == "I" || letraCadena == "O" || letraCadena == "U" ) {
                contadorTotalVocales ++;
            }
            return contadorTotalVocales;
        }
    }
}
