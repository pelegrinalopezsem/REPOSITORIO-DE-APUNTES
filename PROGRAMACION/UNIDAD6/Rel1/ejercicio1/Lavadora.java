package PROGRAMACION.UNIDAD6.Rel1.ejercicio1;

class Lavadora extends Electrodomestico{
    double capacidadCarga;

    public Lavadora(String marca, String modelo,double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }



    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " Con capacidad de carda de: " + capacidadCarga;
    }

}
