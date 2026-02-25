package PROGRAMACION.UNIDAD5.Rel3.ejercicio3;

import java.util.ArrayList;

public class Pareja {
    ArrayList<String> jugadores = new ArrayList<String>();
    private int idPareja;
    private Jugador jugador1;
    private Jugador jugador2;
    private int victorias;
    public int puntosTotales;

    public Pareja(int idPareja, Jugador jugador1, Jugador jugador2, int victorias, int puntosTotales) {
        this.idPareja = idPareja;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.victorias = victorias;
        this.puntosTotales = puntosTotales;
    }

    public Pareja(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getIdPareja() {
        return idPareja;
    }

    public void setIdPareja(int idPareja) {
        this.idPareja = idPareja;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        String jugadorEnTexto1 = String.valueOf(jugador1);
        if (!jugadores.contains(jugadorEnTexto1)) {
            this.jugador1 = jugador1;
            jugadores.add(jugadorEnTexto1);
        }
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        String jugadorEnTexto2 = String.valueOf(jugador2);
        if (!jugadores.contains(jugadorEnTexto2)) {
            this.jugador2 = jugador2;
            jugadores.add(jugadorEnTexto2);
        }
        this.jugador2 = jugador2;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

}
