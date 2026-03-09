package PROGRAMACION.UNIDAD6.Rel1.ejercicio3;

public class Vehiculo {
    private String marca;
    private String tipoCombustible;

    public Vehiculo(String marca, String tipoCombustible) {
        this.marca = marca;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", tipoCombustible=").append(tipoCombustible);
        sb.append('}');
        return sb.toString();
    }


}
