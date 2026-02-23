package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

public class Amarre {

    private int numero;
    private double longitudMaxima;
    private boolean ocupado;
    public double precioDia;
    public String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, boolean ocupado, double precioDia, String tipoAmarre) {
        this.numero = numero;
        this.longitudMaxima = longitudMaxima;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public double getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
        }
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String tipoAmarre(String tipoAmarre) {
        if (tipoAmarre.equals("Normal") || tipoAmarre.equals("Premium") || tipoAmarre.equals("Megayate")) {
            return tipoAmarre;
        }
        return null;
    }

    public double precioDia(String tipoAmarre, double longitudMaxima) {
        double precioDia = 0.0;
        if (tipoAmarre.equals("Normal")) {
            precioDia = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equals("Premium")) {
            precioDia = 60 + (2.2 * longitudMaxima);
        } else if (tipoAmarre.equals("Megayate")) {
            precioDia = 120 + (3.5 * longitudMaxima);
        }
        return precioDia;
    }

    public String tipoAgarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (tipoAmarre.equals("Normal") || tipoAmarre.equals("Premium") || tipoAmarre.equals("Megayate")) {
            this.tipoAmarre = tipoAmarre;
        } else {
            System.out.println("Amarre no valido");
        }
    }
}
