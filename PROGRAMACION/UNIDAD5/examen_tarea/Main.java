package PROGRAMACION.UNIDAD5.examen_tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();
        Faker faker = new Faker();
        Scanner sc = new Scanner(System.in);

        //GENERAR 1000 animales
        for (int i = 0; i < 1000; i++) {
            zoo.agregarAnimal(
                new Animal(
                    faker.nombreAnimal(),  
                    String.valueOf(i),
                    faker.numero(1, 10),
                    faker.precio(100, 1000)
                )
            );
        }

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n1.Buscar por código");
            System.out.println("2.Buscar por nombre");
            System.out.println("3.Eliminar por código");
            System.out.println("4.Mostrar todos");
            System.out.println("0.Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print("Código: ");
                String codigo = sc.nextLine();

                Animal a = zoo.buscarPorCodigo(codigo);

                if (a != null) {
                    System.out.println(a);
                } else {
                    System.out.println("No encontrado");
                }
            }

            else if (opcion == 2) {

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                ArrayList<Animal> lista = zoo.buscarPorNombre(nombre);

                for (Animal a : lista) {
                    System.out.println(a);
                }
            }

            else if (opcion == 3) {

                System.out.print("Código: ");
                String codigo = sc.nextLine();

                if (zoo.eliminarAnimal(codigo)) {
                    System.out.println("Eliminado");
                } else {
                    System.out.println("No encontrado");
                }
            }

            else if (opcion == 4) {

                ArrayList<Animal> lista = zoo.obtenerTodos();

                for (Animal a : lista) {
                    System.out.println(a);
                }
            }
        }

        sc.close();
    }
}
