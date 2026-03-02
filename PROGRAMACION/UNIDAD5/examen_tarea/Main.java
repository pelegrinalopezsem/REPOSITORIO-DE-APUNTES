package PROGRAMACION.UNIDAD5.examen_tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();
        Faker faker = new Faker();
        Scanner sc = new Scanner(System.in);

        // GENERAR 1000 animales
        for (int i = 0; i < 1000; i++) {
            zoo.agregarAnimal(
                    new Animal(
                            faker.nombreAnimal(),
                            String.valueOf(i),
                            faker.entero(1, 10),
                            faker.precio(100, 1000)));
        }

        int opcion = -1;

        while (opcion != 6) {

            System.out.println("===== GESTIÓN DE ZOOLÓGICO =====\n" +
                    "1. Mostrar todos los animales\n" +
                    "2. Buscar un animal por código\n" +
                    "3. Agregar ejemplares a un animal\n" +
                    "4. Retirar ejemplares de un animal\n" +
                    "5. Eliminar un animal\n" +
                    "6. Salir\n" +
                    "Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
//MOSTRAR ANIMALES
            if (opcion == 1) {

                ArrayList<Animal> lista = zoo.obtenerTodos();

                for (Animal a : lista) {
                    System.out.println(a);
                }
            //BUSCAR POR CODIGO
            } else if (opcion == 2) {

                System.out.print("Código: ");
                String codigo = sc.nextLine();

                Animal a = zoo.buscarPorCodigo(codigo);

                if (a != null) {
                    System.out.println(a);
                } else {
                    System.out.println("No encontrado");
                }
            }
            //SUMAR CANTIDAD ANIMAL
            else if (opcion == 3) {

                System.out.print("Código: ");
                String codigo = sc.nextLine();

                System.out.print("Cantidad a agregar: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                if (zoo.agregarEjemplares(codigo, cantidad)) {
                    System.out.println("Cantidad actualizada");
                } else {
                    System.out.println("Animal no encontrado");
                }
            //RESTAR CANTIDAD ANIMAL
            } else if (opcion == 4) {

                System.out.print("Código: ");
                String codigo = sc.nextLine();

                System.out.print("Cantidad a restar: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                if (zoo.retirarEjemplares(codigo, cantidad)) {
                    System.out.println("Cantidad actualizada");
                } else {
                    System.out.println("Animal no encontrado");
                }
                //OPCION ELIMINAR ANIMAL
            } else if (opcion == 5) {
                System.out.print("Código: ");
                String codigo = sc.nextLine();
                if (zoo.eliminarAnimal(codigo)) {
                    System.out.println("Eliminado");
                } else {
                    System.out.println("No encontrado");
                }
            }

        }
        sc.close();
    }
}
