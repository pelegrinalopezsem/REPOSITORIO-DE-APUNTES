package PROGRAMACION.UNIDAD_4.EJERCICIOS.REPASO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> marcasArray = new ArrayList<String>();
        ArrayList<Integer> potenciaCV = new ArrayList<Integer>();
        ArrayList<String> trabajosArray = new ArrayList<>(
                Arrays.asList("arado", "transporte", "siembra"));
        int opcion = 5;
        String marca;
        int potencia;
        String trabajo;

        while (opcion != 0) {
            mostrarMenu();
            opcion = scanner.nextInt();
            if (opcion == 1) {
                introducirTractor(scanner, marcasArray, potenciaCV, trabajosArray);
            } else if (opcion == 2) {
                listarTractores(potenciaCV, marcasArray, trabajosArray);
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println(
                "\nElige una opcion:\n1:AÑADIR TRACTOR \n2:LISTAR TRACTORES \n3:EVALUAR TRACTORES \n4:ELIMINAR TRACTOR \n0:SALIR");
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    // OPCION 1
    public static void introducirTractor(
            Scanner scanner,
            ArrayList<String> marcasArray,
            ArrayList<Integer> potenciaCV,
            ArrayList<String> trabajosArray) {

        imprimirMensaje("INTRODUCE UNA MARCA:");
        String marca = scanner.next();
        marcasArray.add(marca);

        imprimirMensaje("INTRODUCE LA POTENCIA:");
        mayorQueCero(scanner, potenciaCV);

        imprimirMensaje("INTRODUCE EL TIPO DE TRABAJO:");
        leerTrabajoValido(scanner);
    }

    // FUNCION QUE COMPRUEBA QUE LA POTENCIA ES MAYOR QUE CERO
    public static void mayorQueCero(
            Scanner scanner,
            ArrayList<Integer> potenciaCV) {
        final int CERO = 0;
        int potencia = scanner.nextInt();
        while (potencia <= CERO) {
            imprimirMensaje("INTRODUCE UN NUMERO MAYOR O IGUAL QUE 0");
            potencia = scanner.nextInt();
        }
        potenciaCV.add(potencia);
    }

    // FUNCION QUE LEE QUE HAYAS INTRODUCIDO EL TRABAJO INTRODUCIDO
    static String leerTrabajoValido(Scanner sc) {
        String trabajo = "";
        boolean valido = false;

        while (!valido) {
            imprimirMensaje("Trabajo (arado / transporte / siembra): ");
            trabajo = sc.nextLine().trim().toLowerCase();
            valido = esTrabajoValido(trabajo);
            if (!valido) {
                imprimirMensaje("Trabajo no válido.");
            }
        }
        return trabajo;
    }

    static boolean esTrabajoValido(String trabajo) {
        boolean resultado =
                trabajo.equals("arado") ||
                trabajo.equals("transporte") ||
                trabajo.equals("siembra");
        return resultado;
    }

    // OPCION 2
    public static void listarTractores(
            ArrayList<Integer> potenciaCV,
            ArrayList<String> marcasArray,
            ArrayList<String> trabajosArray) {
        for (int i = 0; i < potenciaCV.size(); i++) {
            System.out.println(toString(i, marcasArray, potenciaCV, trabajosArray));
        }
    }

    public static String toString(int i,
            ArrayList<String> marcasArray,
            ArrayList<Integer> potenciaCV,
            ArrayList<String> trabajosArray) {
        return "Tractor " + (i + 1) +
                " --> Marca: " + marcasArray.get(i) +
                " | " + potenciaCV.get(i) + " CV" +
                " | Trabajo: " + trabajosArray.get(i);
    }
    //OPCION 3
    
}
