package PROGRAMACION.UNIDAD5.Rel3.ejercicio1_solucion;

import java.util.ArrayList;
import java.util.Arrays;

public class Embarcacion {
    private final static ArrayList<String> TIPOVALIDOS = new ArrayList<>(
            Arrays.asList("VELERO", "LANCHA", "YATE", "CATAMARAN", "MOTO DE AGUA"));
    private String nombre;
    private String matricula;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario,
            int anioFabricacion, double valorEstimado) {
        setMatricula(matricula);
        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.equals("")) {
            this.matricula = matricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (TIPOVALIDOS.contains(tipo.toUpperCase())) {
            this.tipo = tipo;
        }
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabreicacion(int anioFabricacion) {
        if (anioFabricacion >= 1950 && anioFabricacion <= 2026) {
            this.anioFabricacion = anioFabricacion;
        }
    }

    @Override
    public String toString() {
        return nombre + "MATRICULA: " + matricula + " con " + eslora + "m de eslora de " + propietario
                + ". Es una embarcacion tipo " + tipo + " de " + anioFabricacion + " con un valor estimado de "
                + valorEstimado + "€.";
    }

}
