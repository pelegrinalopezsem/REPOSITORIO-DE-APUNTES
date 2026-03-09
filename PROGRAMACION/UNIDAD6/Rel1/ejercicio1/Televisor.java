package PROGRAMACION.UNIDAD6.Rel1.ejercicio1;

class Televisor extends Electrodomestico {
    double tamañoPantalla;

    public Televisor(String marca, String modelo,double tamañoPantalla) {
        super(marca, modelo);
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + " El tamaño de la pantalla es: " + tamañoPantalla;
    }
}
