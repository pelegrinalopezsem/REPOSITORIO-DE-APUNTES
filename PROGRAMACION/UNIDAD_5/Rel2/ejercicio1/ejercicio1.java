package PROGRAMACION.UNIDAD_5.Rel2.ejercicio1;

//Crea una clase Estudiante con atributos nombre, edad y número de matrícula. 
// Implementa los métodos get y set para cada atributo, así como el método toString()

public class ejercicio1 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Carlota", 5, "STEM0067");  
        Estudiante estudiante2 = new Estudiante("Miguel", 25);
        Estudiante estudiante3 = new Estudiante("Raul", "STE0068");

        Universidad uni = new Universidad();
        uni.agregarEstudiante(estudiante1);
        uni.agregarEstudiante(estudiante2);
        uni.agregarEstudiante(estudiante3);
        System.out.println(uni.mostrarAlumnado());
        System.out.println("BUSCAR NUMERO DE MATRICULA");
        // System.out.println(uni.buscarEstudiante("STE0068"));
    }
}

