public class Programador extends Empleado {
    private final double BONIFICADOR = 1.5;

    public Programador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public String toString() {
        return super.toString() + " Tiene un bonificador de " + BONIFICADOR;
    }

    double calcularSueldo(){
        return getSueldoBase() * BONIFICADOR;
    }

    
}
