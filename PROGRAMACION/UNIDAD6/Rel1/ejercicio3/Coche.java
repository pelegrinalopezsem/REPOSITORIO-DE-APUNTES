package PROGRAMACION.UNIDAD6.Rel1.ejercicio3;

class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String tipoCombustible,int numeroPuertas) {
        super(marca, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " La numeroPuertas es: " + numeroPuertas;
    }
}
