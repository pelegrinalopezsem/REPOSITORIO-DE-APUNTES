package PROGRAMACION.UNIDAD6.Rel1.ejercicio3;

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String tipoCombustible,int cilindrada) {
        super(marca, tipoCombustible);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " La cilindrada es: " + cilindrada;
    }
}
