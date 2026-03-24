public class Gerente extends Empleado{
    private double bono;

    public Gerente(double sueldo,String nombre, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    double calcularSueldo(){
        return getSueldo() + bono;
    }
}
