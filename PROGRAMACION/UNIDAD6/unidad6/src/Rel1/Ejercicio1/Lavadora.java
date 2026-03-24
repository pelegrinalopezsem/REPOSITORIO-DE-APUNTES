
public class Lavadora extends Electrodomestico {
    double capacidadCarga;

    public Lavadora(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " con capacidad de carga " +  capacidadCarga + " KGs.";
    }

}
