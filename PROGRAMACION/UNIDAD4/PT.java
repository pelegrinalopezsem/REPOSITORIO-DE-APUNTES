package PROGRAMACION.UNIDAD4;

import java.util.ArrayList;
import java.util.Scanner;

public class PT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ARRAYS
        ArrayList<String> nombreEmpresas = new ArrayList<>();
        ArrayList<String> nombreCandidatos = new ArrayList<>();
        ArrayList<String> preferenciasEmpresa = new ArrayList<>();
        ArrayList<String> preferenciasCandidato = new ArrayList<>();
        // VARIABLES
        int opcion = -1;

        // BUCLE
        while (opcion != 8) {
            opcion = leerOpcionMenu(1, 8, scanner);
            if (opcion == 1) {
                añadirEmpresa(scanner, nombreEmpresas, preferenciasEmpresa);
            } else if (opcion == 2) {
                añadirCandidatos(scanner, nombreCandidatos, preferenciasCandidato);
            } else if (opcion == 3) {
                listarEmpresas(nombreEmpresas, preferenciasEmpresa);
            } else if (opcion == 4) {
                listarCandidatos(nombreCandidatos, preferenciasCandidato);
            } else if (opcion == 5) {
                evaluarCandidatura(scanner, nombreEmpresas, nombreCandidatos, preferenciasCandidato, preferenciasEmpresa);
            } else if (opcion == 6) {
                eliminarEmpresa(scanner, nombreEmpresas, preferenciasEmpresa);
            } else if (opcion == 7) {
                eliminarCandidatos(scanner, nombreCandidatos, preferenciasCandidato);
            }
        }
    }

    // MOSTRAR EL MENU
    public static void mostrarOpciones() {
        System.out.println(
                "\nElige una opcion:\n1:Añadir empresa\n2:Añadir candidato\n3:Listar empresas \n4:Listar candidatos \n5:Evaluar candidatura \n6:Eliminar empresa \n7:Eliminar candidato \n8:SALIR");
    }

    // PARA COMPROBAR QUE ES UN NUMERO ENTERO
    public static int leerNumeroEntero(String mensaje, Scanner sc) {
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                imprimirMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero entero valido");
            }
        }
        return numero;
    }

    // CONTROL DE ERRORES QUE SI NO ES DEL 1 AL 8 TE VUELVA A PREGUNTAR
    public static int leerOpcionMenu(int min, int max, Scanner sc) {
        int opcion;
        boolean correcta = false;

        do {
            mostrarOpciones();
            opcion = leerNumeroEntero("Elige una opcion:", sc);

            if (opcion >= min && opcion <= max) {
                correcta = true;
            } else {
                imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
            }
        } while (!correcta);
        return opcion;
    }

    // OPCION 1 AÑADIR EMPRESA
    public static void añadirEmpresa(Scanner sc,
            ArrayList<String> nombreEmpresas,
            ArrayList<String> preferenciasEmpresa) {

        imprimirMensaje("Nombre de la empresa");
        String nombreEmpresa = sc.next();
        sc.nextLine(); // limpiar buffer
        nombreEmpresas.add(nombreEmpresa);

        String preferencia = comprobarPreferencia(sc);
        preferenciasEmpresa.add(preferencia);
    }

    // COMPROBAMOS QUE LA PREFERENCIA SEA UNA DE LAS TRES QUE NOS HAN DADO
    public static String comprobarPreferencia(Scanner sc) {
        String preferencia;
        boolean valido = false;

        do {
            imprimirMensaje("Tipos: presencial | hibrido | telematico");
            preferencia = sc.nextLine().trim().toLowerCase();
            valido = esPreferenciaValida(preferencia);

            if (!valido) {
                imprimirMensaje("Trabajo no válido.");
            }
        } while (!valido);

        return preferencia;
    }

    static boolean esPreferenciaValida(String trabajo) {
        boolean resultado = trabajo.equals("presencial") ||
                trabajo.equals("hibrido") ||
                trabajo.equals("telematico");
        return resultado;
    }

    // IMPRIMIR EL MENSAJE QUE QUIERAS
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    // OPCION 2 AÑADIR CANDIDATOS
    public static void añadirCandidatos(Scanner sc,
            ArrayList<String> nombreCandidatos,
            ArrayList<String> preferenciasCandidatos) {

        imprimirMensaje("Nombre del candidato");
        String nombreCandidato = sc.next();
        sc.nextLine(); // limpiar buffer
        nombreCandidatos.add(nombreCandidato);

        String preferencia = comprobarPreferencia(sc);
        preferenciasCandidatos.add(preferencia);
    }

    // OPCION 3 LISTAR EMPRESAS
    public static void listarEmpresas(ArrayList<String> nombreEmpresas,
            ArrayList<String> preferenciaEmpresa) {
        if (nombreEmpresas.isEmpty()) {
            imprimirMensaje("No hay empresas registrados.");
        } else {
            for (int i = 0; i < nombreEmpresas.size(); i++) {
                imprimirMensaje(
                        i + " -> Nombre: " + nombreEmpresas.get(i) + " | Preferencia:" + preferenciaEmpresa.get(i));
            }
        }
    }

    // OPCION 4 LISTAR CANDIDATOS
    public static void listarCandidatos(ArrayList<String> nombreCandidatos,
            ArrayList<String> preferenciasCandidatos) {
        if (nombreCandidatos.isEmpty()) {
            imprimirMensaje("No hay candidatos registrados.");
        } else {
            for (int i = 0; i < nombreCandidatos.size(); i++) {
                imprimirMensaje(i + " -> Nombre: " + nombreCandidatos.get(i) + " | Preferencia:"
                        + preferenciasCandidatos.get(i));
            }
        }
    }

    // OPCION 5 EVALUAR CANDIDATURA
    static void evaluarCandidatura(Scanner sc,
        ArrayList<String> nombreEmpresas,
        ArrayList<String> nombreCandidatos,
        ArrayList<String> preferenciaCandidatos,
        ArrayList<String> preferenciaEmpresas) {

    if (nombreEmpresas.isEmpty()) {
        imprimirMensaje("No hay empresas para evaluar.");
    } else if (nombreCandidatos.isEmpty()) {
        imprimirMensaje("No hay candidatos para evaluar.");
    } else {
        listarEmpresas(nombreEmpresas, preferenciaEmpresas);
        int indiceEmpresa = pedirIndiceValido(sc, nombreEmpresas.size(),
                "Índice de la empresa: ");

        listarCandidatos(nombreCandidatos, preferenciaCandidatos);
        int indiceCandidato = pedirIndiceValido(sc, nombreCandidatos.size(),
                "Índice del candidato: ");

        String resultado = calcularResultado(
                preferenciaCandidatos.get(indiceCandidato),
                preferenciaEmpresas.get(indiceEmpresa));

        imprimirMensaje("Resultado: " + resultado);
    }
}


    static String calcularResultado(String preferenciaCandidato, String preferenciaEmpresa) {

    if (preferenciaEmpresa.equals("presencial")) {
        if (preferenciaCandidato.equals("presencial")) {
            return "PERFECTO";
        } else if (preferenciaCandidato.equals("hibrido")) {
            return "BIEN";
        } else { // telematico
            return "MAL";
        }
    }

    if (preferenciaEmpresa.equals("hibrido")) {
        if (preferenciaCandidato.equals("hibrido")) {
            return "PERFECTO";
        } else { // presencial o telematico
            return "REGULAR";
        }
    }

    // empresa telematico
    if (preferenciaCandidato.equals("telematico")) {
        return "PERFECTO";
    } else if (preferenciaCandidato.equals("hibrido")) {
        return "REGULAR";
    } else { // presencial
        return "MAL";
    }
}



    // OPCION 6 ELIMINAR EMPRESA
    static void eliminarEmpresa(Scanner sc,
            ArrayList<String> nombreEmpresas,
            ArrayList<String> preferenciaEmpresas) {

        if (nombreEmpresas.isEmpty()) {
            imprimirMensaje("No hay empresas para eliminar.");
        } else {
            listarEmpresas(nombreEmpresas, preferenciaEmpresas);
            int indice = pedirIndiceValido(sc, nombreEmpresas.size(), "Índice a eliminar: ");
            nombreEmpresas.remove(indice);
            preferenciaEmpresas.remove(indice);
            imprimirMensaje("Empresa eliminada correctamente.");
        }
    }

    static int pedirIndiceValido(Scanner sc, int tam, String prompt) {
        int indice = -1;

        while (indice < 0 || indice >= tam) {
            imprimirMensaje(prompt);
            indice = leerEntero(sc);
            if (indice < 0 || indice >= tam) {
                imprimirMensaje("Índice fuera de rango.");
            }
        }
        return indice;
    }

    static int leerEntero(Scanner sc) {
        int numero = 0;
        boolean numeroValido = false;

        while (!numeroValido) {
            String texto = sc.nextLine().trim();
            try {
                numero = Integer.parseInt(texto);
                numeroValido = true;
            } catch (NumberFormatException e) {
                imprimirMensaje("Debes introducir un número entero: ");
            }
        }
        return numero;
    }

    // OPCION 7 ELIMINAR CANDIDATOS
    static void eliminarCandidatos(Scanner sc,
            ArrayList<String> nombreCandidatos,
            ArrayList<String> preferenciaCandidatos) {

        if (nombreCandidatos.isEmpty()) {
            imprimirMensaje("No hay candidatos para eliminar.");
        } else {
            listarEmpresas(nombreCandidatos, preferenciaCandidatos);
            int indice = pedirIndiceValido(sc, nombreCandidatos.size(), "Índice a eliminar: ");
            nombreCandidatos.remove(indice);
            preferenciaCandidatos.remove(indice);
            imprimirMensaje("Candidato eliminado correctamente.");
        }
    }
}
