package PROGRAMACION.UNIDAD5.Rel3.ejercicio2;

import java.util.ArrayList;

public class Gestoria {

    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario;

    private ArrayList<Cliente> clientes;
    private ArrayList<Tramite> tramites;
    private ArrayList<Expediente> expedientes;

    // Constructor
    public Gestoria(String nombre, String direccion, String telefono, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;

        clientes = new ArrayList<>();
        tramites = new ArrayList<>();
        expedientes = new ArrayList<>();
    }

    // Añadir cliente si DNI no existe
    public void altaCliente(Cliente c) {
        for (Cliente cl : clientes) {
            if (cl.getDni().equalsIgnoreCase(c.getDni())) {
                System.out.println("Cliente ya existe.");
                return;
            }
        }
        clientes.add(c);
        System.out.println("Cliente agregado: " + c.getNombre());
    }

    // Añadir trámite si código no existe
    public void altaTramite(Tramite t) {
        for (Tramite tr : tramites) {
            if (tr.getCodigo().equalsIgnoreCase(t.getCodigo())) {
                System.out.println("Trámite ya existe.");
                return;
            }
        }
        tramites.add(t);
        System.out.println("Trámite agregado: " + t.getNombreTramite());
    }

    // Abrir expediente asociado a cliente y trámite
    public void abrirExpediente(Cliente c, Tramite t) {
        Expediente e = new Expediente(c, t);
        expedientes.add(e);
        System.out.println("Expediente abierto para " + c.getNombre() + " - " + t.getNombreTramite());
    }

    // Cambiar estado de un expediente por número
    public void cambiarEstadoExpediente(int numero) {
        for (Expediente e : expedientes) {
            if (e.getNumeroExpediente() == numero) {
                e.cambiarEstado();
                return;
            }
        }
        System.out.println("Expediente no encontrado.");
    }

    // Marcar expediente como pagado
    public void marcarExpedientePagado(int numero) {
        for (Expediente e : expedientes) {
            if (e.getNumeroExpediente() == numero) {
                e.marcarPagado();
                return;
            }
        }
        System.out.println("Expediente no encontrado.");
    }

    // Listar expedientes por estado
    public void listarPorEstado(String estado) {
        for (Expediente e : expedientes) {
            if (e.getEstado().equalsIgnoreCase(estado)) {
                System.out.println(e);
            }
        }
    }

    // Listar expedientes pendientes de pago
    public void listarPendientesDePago() {
        for (Expediente e : expedientes) {
            if (!e.isPagado()) {
                System.out.println(e);
            }
        }
    }

    // Calcular facturación total (solo expedientes pagados)
    public double calcularFacturacionTotal() {
        double total = 0;
        for (Expediente e : expedientes) {
            if (e.isPagado()) {
                total += e.getTramite().getPrecioBase();
            }
        }
        return total;
    }

}
