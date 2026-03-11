package PROGRAMACION.UNIDAD6.Rel1.ejercicio4;

public class Animal {
    private String nombre;
    private String tipoAlimentacion;
    
    public Animal(String nombre, String tipoAlimentacion) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
    return nombre;
}
    public String getTipoAlimentacion(){
        return tipoAlimentacion;
    }
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipoAlimentacion=" + tipoAlimentacion + "]";
    }

    
}
