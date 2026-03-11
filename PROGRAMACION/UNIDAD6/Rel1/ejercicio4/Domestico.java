package PROGRAMACION.UNIDAD6.Rel1.ejercicio4;

class Domestico extends Animal{

    private String dueño;

    public Domestico(String nombre, String tipoAlimentacion, String dueño) {
        super(nombre, tipoAlimentacion);
        this.dueño = dueño;
    }
    
    public String convivirConHumanos(){
        return "El animal domestico " + getNombre() + " convive con su dueño " + dueño;
    }
}
