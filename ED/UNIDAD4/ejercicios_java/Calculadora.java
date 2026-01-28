package ED.UNIDAD4.ejercicios_java;

public class Calculadora {

/**
 * 
 * @param capital
 * @param tasa
 * @param anios
 * @throws IllegalArgumentException
 * @return
 */

    public double calcularInteresSimple(double capital, double tasa, int anios) {
        if (capital < 0 || tasa < 0 || anios < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos");
        }

        return capital * tasa * anios;
    }

    public double calcularDescuento(double precio, double porcentaje) {
        if (precio < 0 || porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return precio - (precio * porcentaje / 100);
    }

    public double convertirEurosADolares(double euros, double cambio) {
        if (euros < 0 || cambio <= 0) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return euros * cambio;
    }
}