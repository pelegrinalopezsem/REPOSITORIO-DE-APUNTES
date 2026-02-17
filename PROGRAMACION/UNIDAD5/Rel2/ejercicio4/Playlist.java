package PROGRAMACION.UNIDAD5.Rel2.ejercicio4;

import java.util.ArrayList;

public class Playlist {
    ArrayList<cancion> canciones;
    public Playlist() {
        this.canciones = new ArrayList<>();
    }
    //AGREGAR CANCION
    public void agregarCancion(cancion cancion){
        canciones.add(cancion);
    }
    //MOSTRAR CANCIONES
    public void mostrarCanciones() {
        for (cancion c : canciones) {
            System.out.println(c)  ;
        }
    }
    @Override
    public String toString() {
        String cancion = "";
        int contador = 0;
        for (int i = 1; i <= canciones.size(); i++){
            cancion += "NUMERO: " + i + " CANCION: " + canciones.get(i);
        }
        return super.toString();
    }
}
