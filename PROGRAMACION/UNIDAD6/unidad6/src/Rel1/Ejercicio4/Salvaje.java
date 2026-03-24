public class Salvaje extends Animal{

    private String habitat;

    public Salvaje(String habitat, String nombre, String tipoAlimentacion) {
        super(nombre, tipoAlimentacion);
        this.habitat = habitat;
    }

    public String cazar(){
        return "El animal salvaje "+this.getNombre()+" caza en su hábitat "+this.getHabitat()+" y se alimenta de "+this.getTipoAlimentacion()+".";
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
}
