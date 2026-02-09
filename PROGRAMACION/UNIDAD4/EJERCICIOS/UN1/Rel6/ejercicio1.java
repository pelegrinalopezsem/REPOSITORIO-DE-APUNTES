package PROGRAMACION.UNIDAD4.EJERCICIOS.UN1.Rel6;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Declaramos las variables
        int nota;
        int sumaDeNotas = 0;
        int alumno = 0;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;
        final int UNO = 1;
        int promedio;

//Pedimos la nota 
        System.out.print("Introduce la nota del examen: ");
        nota = scanner.nextInt();

//Creamos el bucle
        while (nota != 1) {
            while (nota < 0 || nota > 10) {
                System.out.print("Valor incorrecto.Introduce la nota del examen: ");
                nota = scanner.nextInt();
            }
        sumaDeNotas += nota;
        alumno += UNO;
                if (nota >= 5 && nota <= 10){
                    alumnosAprobados += UNO;
                } else {
                    alumnosSuspensos += UNO;
            }
        System.out.print("Introduce la nota del examen: ");
        nota = scanner.nextInt();
        }
        promedio = sumaDeNotas / (alumno - 1);
        System.out.println("Hay " + alumnosAprobados + " alumnos aprovados y hay " + alumnosSuspensos + " alumnos suspensos");
        System.out.println("La calificacion media es: " + promedio);
        scanner.close();
    }
}
