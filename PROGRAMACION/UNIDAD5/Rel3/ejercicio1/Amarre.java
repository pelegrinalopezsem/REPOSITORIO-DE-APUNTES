package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    public double precioDia; // El enunciado pide que sea public (dato informativo)
    private boolean ocupado;
    public String tipoAmarre; // El enunciado pide que sea public

    // Constructor completo
    public Amarre(int numero, double longitudMaxima, String tipoAmarre) {
        setNumero(numero);
        setLongitudMaxima(longitudMaxima);
        setTipoAmarre(tipoAmarre); // Esto llamará a la lógica de validación y precio
        this.ocupado = false; // Por defecto un amarre nuevo empieza libre
    }

    // --- GETTERS Y SETTERS CON VALIDACIÓN ---

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
        // Restricción: longitudMaxima debe ser >= 4.0
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
            actualizarPrecio(); // Si cambia la longitud, cambia el precio
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setTipoAmarre(String tipoAmarre) {
        // Restricción: solo "Normal", "Premium", "Megayate"
        if (tipoAmarre.equals("Normal") || tipoAmarre.equals("Premium") || tipoAmarre.equals("Megayate")) {
            this.tipoAmarre = tipoAmarre;
            actualizarPrecio();
        } else {
            this.tipoAmarre = "Normal"; // Valor por defecto en caso de error
            actualizarPrecio();
        }
    }

    // Método privado para automatizar el cálculo según el enunciado
    private void actualizarPrecio() {
        if (tipoAmarre == null)
            return;

        switch (tipoAmarre) {
            case "Normal":
                this.precioDia = 25 + (1.5 * longitudMaxima);
                break;
            case "Premium":
                this.precioDia = 60 + (2.2 * longitudMaxima);
                break;
            case "Megayate":
                this.precioDia = 120 + (3.5 * longitudMaxima);
                break;
        }
    }

    @Override
    public String toString() {
        return "Amarre #" + numero + " [" + tipoAmarre + "] - Max: " + longitudMaxima +
                "m - Precio/día: " + precioDia + "€ - Estado: " + (ocupado ? "OCUPADO" : "LIBRE");
    }
}
