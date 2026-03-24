abstract class Empleado{
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    abstract double calcularSueldo();
}
