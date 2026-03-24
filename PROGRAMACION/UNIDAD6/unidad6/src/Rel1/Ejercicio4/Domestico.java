public class Domestico extends Animal{
    private String duenio;

    public Domestico(String duenio, String nombre, String tipoAlimentacion) {
        super(nombre, tipoAlimentacion);
        this.duenio = duenio;
    }

    public String convivirConHumanos(){
        return "El animal doméstico "+this.getNombre()+" convive con su dueño "+this.getDuenio()+" y se alimenta de "+this.getTipoAlimentacion()+".";
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
}
