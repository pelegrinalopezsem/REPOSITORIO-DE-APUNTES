package PROGRAMACION.UNIDAD6.Rel1.ejercicio2;

class Diseniador extends Empleado{
    private final double BONIFICADOR = 1.1;
    
    public Diseniador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    @Override
    public String toString() {
        return super.toString() + "El sueldo total es: " + calcularSueldo();
    }
    double calcularSueldo(){
        return sueldoBase * BONIFICADOR;
    }
}
