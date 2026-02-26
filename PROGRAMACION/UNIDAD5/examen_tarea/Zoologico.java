package PROGRAMACION.UNIDAD5.examen_tarea;

import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animales;

    public Zoologico() {
        animales = new ArrayList<>();
    }

    // AGREGAR
    public void agregarAnimal(Animal a) {
        if (a != null) {
            animales.add(a);
        }
    }

    // ELIMINAR POR CÓDIGO
    public boolean eliminarAnimal(String codigo) {
        return animales.removeIf(a -> a.getCodigo().equalsIgnoreCase(codigo));
    }

    // BUSCAR POR CÓDIGO
    public Animal buscarPorCodigo(String codigo) {
        Animal resultado = null;

        for (Animal a : animales) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                resultado = a;
            }
        }

        return resultado;
    }

    // BUSCAR POR NOMBRE
    public ArrayList<Animal> buscarPorNombre(String nombre) {

        ArrayList<Animal> resultado = new ArrayList<>();

        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(a);
            }
        }

        return resultado;
    }

    // OBTENER TODOS
    public ArrayList<Animal> obtenerTodos() {
        return animales;
    }
}
