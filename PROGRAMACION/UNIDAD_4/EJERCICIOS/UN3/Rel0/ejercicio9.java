package PROGRAMACION.UNIDAD_4.EJERCICIOS.UN3.Rel0;

public class ejercicio9 {
    public static int menorDeTres(int a, int b, int c) {
        int minimo = a;
        if (b < minimo) {
            minimo = b;
        }
        if (c < minimo) {
            minimo = c;
        }
        return minimo;
    }
    public static void main(String[] args) {
            int resultadoComparacion = menorDeTres(2, 5, 1);
            System.out.println("El numero mas chico es: " + resultadoComparacion);
    }
}
