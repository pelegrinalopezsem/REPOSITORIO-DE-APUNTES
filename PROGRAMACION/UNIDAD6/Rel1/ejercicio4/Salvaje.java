package PROGRAMACION.UNIDAD6.Rel1.ejercicio4;

class Salvaje extends Animal{

    private String habitat;

    public Salvaje(String nombre, String tipoAlimentacion, String habitat) {
        super(nombre, tipoAlimentacion);
        this.habitat = habitat;
    }
    
    public String cazar(){
        return "El animal salvaje " + getNombre() + " caza en su habitat " + habitat + " y se alimenta de " + getTipoAlimentacion();
    }
}

