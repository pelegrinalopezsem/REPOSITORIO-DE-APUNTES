package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

public class Puerto {
    private String nombre;
    private int capacidadMaxima;
    private Amarre[] amarres;
    private Embarcacion[] embarcaciones;
    private String[] matriculasAmarradas;
    public String ubicacion;
    public String telefonoContacto;

    public Puerto(String nombre, int capacidadMaxima, Amarre[] amarres, Embarcacion[] embarcaciones,
            String[] matriculasAmarradas, String ubicacion, String telefonoContacto) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.amarres = amarres;
        this.embarcaciones = embarcaciones;
        this.matriculasAmarradas = matriculasAmarradas;
        this.ubicacion = ubicacion;
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(){
        this.capacidadMaxima = capacidadMaxima; 
        
    }
}
