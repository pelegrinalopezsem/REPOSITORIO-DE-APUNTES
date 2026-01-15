package PROGRAMACIÓN.UNIDAD_4.EJERCICIOS.UN3.Rel0;

public class ejercicio10 {
    public static int calcularAreaTriangulo(int base, int altura) {
        return (base*altura) / 2;
    }
    public static void main(String[] args){
        int resultadoCalcularArea = calcularAreaTriangulo(10, 2);
        System.out.println("El area del triangulo es: " + resultadoCalcularArea + " cm2");
    }
}
