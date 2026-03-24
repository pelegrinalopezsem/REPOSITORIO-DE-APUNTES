
public class Electrodomestico {
    String marca;
    String modelo;

    public Electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo;
    }

}
