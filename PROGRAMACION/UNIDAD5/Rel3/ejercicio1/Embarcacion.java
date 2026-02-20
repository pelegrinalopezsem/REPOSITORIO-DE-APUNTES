package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

public class Embarcacion {
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    private  double valorEstimado;

    public Embarcacion (String matricula,String nombre,double eslora,String tipo,String propietario,int anioFabricacion,double valorEstimado){
        this.matricula = matricula;
        this.nombre = nombre;
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        if (matricula != null && !matricula.isEmpty()){
            this.matricula = matricula;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double  getEslora(){
        return eslora;
    }
    public void setEslora(double eslora){
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        if (tipo.equals("Velero") || tipo.equals("Lancha") || tipo.equals("Yate") || tipo.equals("Catamarán") || tipo.equals("Moto de agua")) {
            this.tipo = tipo;
        }
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public int anioFabricacion(){
        return anioFabricacion;
    }
    public void setAnioFabreicacion(int anioFabricacion){
        if(anioFabricacion >= 1950 && anioFabricacion <= 2026){
            this.anioFabricacion = anioFabricacion;
        }
    }
    public double getValorEstimado(){
        return valorEstimado;
    }
    public void setValorEstimado(double valorEstimado){
        if (valorEstimado < 0) {
            valorEstimado = 0;
        }
        this.valorEstimado = valorEstimado;
    }
}
