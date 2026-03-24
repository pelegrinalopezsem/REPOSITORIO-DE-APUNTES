class Asistente extends Empleado{
        private double horasExtras;

    public Asistente(double sueldo,String nombre, double horasExtras) {
        super(nombre, sueldo);
        this.horasExtras = horasExtras;
    }

    public double gethorasExtras() {
        return horasExtras;
    }

    public void sethorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    double calcularSueldo(){
        double pagoHorasExtras = horasExtras * 15;
        return getSueldo() + pagoHorasExtras;
    }
}
