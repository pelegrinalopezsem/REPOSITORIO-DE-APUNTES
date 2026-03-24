public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado >= 0) {
            this.lado = lado;
        }
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}
