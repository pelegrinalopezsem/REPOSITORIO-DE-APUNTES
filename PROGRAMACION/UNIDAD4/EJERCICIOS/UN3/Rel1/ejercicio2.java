package PROGRAMACION.UNIDAD4.EJERCICIOS.UN3.Rel1;

import java.util.ArrayList;

public class ejercicio2 {

    public static Integer lanzarDado() {
        int resultado = (int)(Math.random() * 6) + 1;
        return resultado;
    }
    public static Integer lanzarDosDados(){
        int dado1 = lanzarDado();
        int dado2 = lanzarDado();
        int suma = dado1 + dado2;
        return suma;
    }
    public static void main(String[] args) {
        int resultado = lanzarDado();
        int resultado2 = lanzarDosDados();
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
