package PROGRAMACION.UNIDAD5.Rel3.ejercicio1;

public class Puerto {
    private String nombre;
    private int capacidadMaxima;
    private Amarre[] amarres;
    private Embarcacion[] embarcaciones;
    private String[] matriculasAmarradas;
    public String telefonoContacto;
    public String ubicacion;

    private int numAmarresActuales = 0;
    private int numEmbarcacionesRegistradas = 0;

    public Puerto(String nombre, int capacidadMaxima, String ubicacion, String telefonoContacto) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.ubicacion = ubicacion;
        this.telefonoContacto = telefonoContacto;

        this.amarres = new Amarre[capacidadMaxima];
        this.matriculasAmarradas = new String[capacidadMaxima];
        this.embarcaciones = new Embarcacion[capacidadMaxima * 2];
    }

    public void registrarEmbarcacion(Embarcacion e) {
        for (int i = 0; i < numEmbarcacionesRegistradas; i++) {
            if (embarcaciones[i].getMatricula().equalsIgnoreCase(e.getMatricula())) {
                System.out.println("Error: La matrícula " + e.getMatricula() + " ya existe.");
                return;
            }
        }
        if (numEmbarcacionesRegistradas < embarcaciones.length) {
            embarcaciones[numEmbarcacionesRegistradas++] = e;
        }
    }

    public void altaAmarre(Amarre a) {
        if (numAmarresActuales >= capacidadMaxima) {
            System.out.println("Capacidad máxima del puerto alcanzada.");
            return;
        }
        // Validar número de amarre repetido
        for (int i = 0; i < numAmarresActuales; i++) {
            if (amarres[i].getNumero() == a.getNumero()) {
                System.out.println("Error: El número de amarre " + a.getNumero() + " ya existe.");
                return;
            }
        }
        amarres[numAmarresActuales++] = a;
    }

    public boolean asignarAmarre(String matricula, int numeroAmarre) {
        Embarcacion emb = buscarEmbarcacionObjeto(matricula);
        Amarre am = buscarAmarreObjeto(numeroAmarre);

        if (emb == null || am == null)
            return false;
        if (am.isOcupado())
            return false;
        if (emb.getEslora() > am.getLongitudMaxima())
            return false;

        // Verificar si la embarcación ya está amarrada en otro sitio
        for (String m : matriculasAmarradas) {
            if (matricula.equalsIgnoreCase(m))
                return false;
        }

        // Realizar la asignación
        am.setOcupado(true);
        // Buscamos el índice interno del amarre para guardar la matrícula
        for (int i = 0; i < numAmarresActuales; i++) {
            if (amarres[i].getNumero() == numeroAmarre) {
                matriculasAmarradas[i] = matricula;
                return true;
            }
        }
        return false;
    }

    public void liberarAmarre(int numeroAmarre) {
        for (int i = 0; i < numAmarresActuales; i++) {
            if (amarres[i].getNumero() == numeroAmarre) {
                amarres[i].setOcupado(false);
                matriculasAmarradas[i] = null;
                System.out.println("Amarre " + numeroAmarre + " liberado.");
                return;
            }
        }
    }

    // --- MÉTODOS DE BÚSQUEDA Y CÁLCULO ---

    private Embarcacion buscarEmbarcacionObjeto(String matricula) {
        for (int i = 0; i < numEmbarcacionesRegistradas; i++) {
            if (embarcaciones[i].getMatricula().equalsIgnoreCase(matricula))
                return embarcaciones[i];
        }
        return null;
    }

    private Amarre buscarAmarreObjeto(int numero) {
        for (int i = 0; i < numAmarresActuales; i++) {
            if (amarres[i].getNumero() == numero)
                return amarres[i];
        }
        return null;
    }

    public double calcularIngresosDiariosActuales() {
        double total = 0;
        for (int i = 0; i < numAmarresActuales; i++) {
            if (amarres[i].isOcupado())
                total += amarres[i].precioDia;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Puerto: " + nombre + " | Ubicación: " + ubicacion + " | Amarres: " + numAmarresActuales + "/"
                + capacidadMaxima;
    }
}
