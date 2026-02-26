package PROGRAMACION.UNIDAD5.Rel3.ejercicio1_solucion;

import java.util.ArrayList;
import java.util.Arrays;

public class Amarre {
    private final static ArrayList<String> TIPOVALIDOS = new ArrayList<>(
            Arrays.asList("NORMAL", "PREMIUM", "MEGAYATE"));
    private int numero;
    private double longitudMaxima;
    private double precioDia;
    private boolean ocupado;
    private String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, double precioDia, boolean ocupado, String tipoAmarre) {
        asignarAmarre();
        setLongitudMaxima(longitudMaxima);
        this.ocupado = ocupado;
        setTipoAmarre(tipoAmarre);
    }

    private void asignarAmarre(int numero){
        numero = numeroAmarres;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    private void imprimirMensaje(String mensaje) {
        System.err.println(mensaje);
    }

    public double getLongitudMaxima() {
        if (longitudMaxima == -1) {
            imprimirMensaje("Longitud maxima con valor erroneo al ser menor de 4.0M.");
        }
        return longitudMaxima;
    }

    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
        } else {
            this.longitudMaxima = -1;
            precioDia = -1;
        }
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void calcularPrecioDia() {
        if (tipoAmarre.equals(TIPOVALIDOS.get(0))) {
            precioDia = 25 + (1.5 + longitudMaxima);
        } else if (tipoAmarre.equals(TIPOVALIDOS.get(1))) {
            precioDia = 60 + (2.2 * longitudMaxima);
        } else {
            precioDia = 120 + (3.5 * longitudMaxima);
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (TIPOVALIDOS.contains(tipoAmarre.toUpperCase())) {
            this.tipoAmarre = tipoAmarre;
            calcularPrecioDia();
        }
    }

    public String consultarDisponibilidad() {
        return ocupado ? "Esta ocupado " : "Esta libre";
    }

    @Override
    public String toString() {
        return "Amarre: " + numero + ",del tipo " + tipoAmarre + ", longitud maxima = "
                + getLongitudMaxima() + "con precio" + getPrecioDia() + "€, disponibilidad= "
                + consultarDisponibilidad();
    }

}
