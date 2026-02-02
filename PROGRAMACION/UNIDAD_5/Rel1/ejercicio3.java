package PROGRAMACION.UNIDAD_5.Rel1;

public class ejercicio3 {
    public static void main(String[] args) {
        Alumno Paco = new Alumno("Paco","matematicas", 4);
        System.out.println(Paco.aprobo());
    }
}

class Alumno {
    String nombre;
    String materia;
    int calificacion;
    Alumno(String nombre,String materia, int calificacion){
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }
    boolean aprobo(){
        boolean aprueba = false;
        if (calificacion >= 6){
            aprueba = true;
            System.out.println("HAS APROBADO CON UN " + calificacion + " LA MATERIA " + materia);
        } else {
            System.out.println("HAS SUSPENDIDO CON UN " + calificacion + " LA MATERIA " + materia);
        }
        return aprueba;
    }
}
