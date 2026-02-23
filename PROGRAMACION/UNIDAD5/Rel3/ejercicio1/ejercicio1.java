// package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

// import java.util.Scanner;

// public class ejercicio1 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// Puerto miPuerto = new Puerto("Puerto Deportivo Real", 50, "Málaga", "+34 952
// 11 22 33");

// for (int i = 1; i <= 50; i++) {
// double longitud = Faker.longitudMaximaAmarre();
// String tipo = Faker.tipoAmarre();
// miPuerto.altaAmarre(new Amarre(i, longitud, tipo));
// }

// String[] todasLasMatriculas = new String[100];
// for (int i = 0; i < 100; i++) {
// String matricula = Faker.matriculaEmbarcacion();
// String nombre = Faker.nombreEmbarcacion();
// double eslora = Faker.eslora();
// String tipo = Faker.tipoEmbarcacion();
// String propietario = Faker.nombreCompleto();
// int anio = Faker.anioFabricacionEmbarcacion();
// double valor = Faker.precio(5000.0, 50000.0);

// Embarcacion e = new Embarcacion(matricula, nombre, eslora, tipo, propietario,
// anio, valor);
// miPuerto.registrarEmbarcacion(e);
// todasLasMatriculas[i] = matricula;
// }

// int contadorAsignados = 0;
// while (contadorAsignados < 20) {
// String matAzar = todasLasMatriculas[Faker.entero(0, 99)];
// int numAmarreAzar = Faker.entero(1, 50);

// if (miPuerto.asignarAmarre(matAzar, numAmarreAzar)) {
// contadorAsignados++;
// }
// }

// int opcion = -1;
// while (opcion != 0) {
// System.out.println("\n========================================");
// System.out.println(" SISTEMA DE GESTIÓN: " + miPuerto.getNombre());
// System.out.println("========================================");
// System.out.println("1. Resumen del puerto e Ingresos");
// System.out.println("2. Ver amarres LIBRES");
// System.out.println("3. Ver amarres OCUPADOS");
// System.out.println("4. Amarrar un barco");
// System.out.println("5. Liberar un amarre");
// System.out.println("6. Buscar barco por matrícula");
// System.out.println("0. Salir");
// System.out.print("\nSeleccione una opción: ");

// opcion = sc.nextInt();
// sc.nextLine(); // Limpiar buffer

// if (opcion == 1) {
// System.out.println(miPuerto.toString());
// System.out.println("Ingresos diarios actuales: " +
// miPuerto.calcularIngresosDiariosActuales() + "€");
// } else if (opcion == 2) {
// System.out.println("--- AMARRES DISPONIBLES ---");
// miPuerto.mostrarAmarresEstado(false);
// } else if (opcion == 3) {
// System.out.println("--- BARCOS AMARRADOS ---");
// miPuerto.mostrarAmarresEstado(true);
// } else if (opcion == 4) {
// System.out.print("Matrícula: ");
// String m = sc.nextLine();
// System.out.print("Nº Amarre: ");
// int n = sc.nextInt();

// if (miPuerto.asignarAmarre(m, n)) {
// System.out.println("OK: Barco amarrado correctamente.");
// } else {
// System.out.println("ERROR: No cumple requisitos o amarre ocupado.");
// }
// } else if (opcion == 5) {
// System.out.print("Número de amarre a liberar: ");
// int numLib = sc.nextInt();
// miPuerto.liberarAmarre(numLib);
// } else if (opcion == 6) {
// System.out.print("Matrícula a buscar: ");
// String matBusqueda = sc.nextLine();
// miPuerto.buscarEmbarcacionObjeto(matBusqueda);
// } else if (opcion == 0) {
// System.out.println("Saliendo...");
// } else {
// System.out.println("Opción incorrecta.");
// }
// }
// sc.close();
// }
// }
