package PROGRAMACION.UNIDAD5.Rel3.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class Jugador {
    private final static ArrayList<String> NIVELVALIDO = new ArrayList<>(
            Arrays.asList("PRINCIPIANTE", "INTERMEDIO", "EXPERTO"));
    private int id;
    private String nombre;
    private int edad;
    private String nivel;
    public String pais;

    public Jugador(int id, String nombre, int edad, String nivel, String pais) {
        this.id = id;
        this.nombre = nombre;
        setEdad(edad);
        setNivel(nivel);
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 18) {
            this.edad = edad;
        }
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        if (NIVELVALIDO.contains(nivel.toUpperCase())) {
            this.nivel = nivel;
        }
    }

}