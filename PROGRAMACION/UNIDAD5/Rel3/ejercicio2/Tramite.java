package PROGRAMACION.UNIDAD5.Rel3.ejercicio2;

public class Tramite {
    private static int numeroTramites;
    private String codigo;   //SE AUTOGENERA
    private String nombreTramite;
    private double precioBase;
    private boolean requiereCita;
    private int duracionDias;
    //CONTADOR DE TRAMITES
    private int contador = 0;

    public Tramite(String nombreTramite, double precioBase, int duracionDias) {
        setCodigo(contador);
        this.nombreTramite = nombreTramite;
        this.precioBase = precioBase;
        calcularRequiereCita();
        this.duracionDias = duracionDias;
    }

    public String getCodigo() {
        return codigo;
    }
//GENERA UN CODIGO QUE EMPIEZA POR STEAM Y LUEGO UN CONTADOR
    public void setCodigo(int contador) {
        this.codigo = String.format("STEAM-", ++contador);
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isRequiereCita() {
        return requiereCita;
    }
// CLASE QUE COMPRUEBA QUE LO QUE INTRODUCE ES UNA DE ESAS TRES NOMBRES
    private void calcularRequiereCita() {
    requiereCita = nombreTramite.equalsIgnoreCase("DNI")
            || nombreTramite.equalsIgnoreCase("Pasaporte")
            || nombreTramite.equalsIgnoreCase("Permiso de conducir");
}

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    @Override
    public String toString() {
        return  getCodigo() + ", nombreTramite: " + getNombreTramite() + ", el precio base es: " + getPrecioBase()
                + ", necesita cita: " + isRequiereCita() + ", dura: " + getDuracionDias() ;
    }

    
    
}
