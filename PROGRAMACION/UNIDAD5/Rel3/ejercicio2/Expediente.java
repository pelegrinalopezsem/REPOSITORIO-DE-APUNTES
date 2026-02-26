package PROGRAMACION.UNIDAD5.Rel3.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Expediente {

    private static int numeroExpedientes = 0;
    private int numeroExpediente;
    private Cliente cliente;
    private Tramite tramite;
    private String estado;
    private boolean pagado;
    private String fechaApertura;

    private static final String[] ESTADOS = {"Abierto", "En proceso", "Cerrado"};

    // Constructor solo con Cliente y Tramite
    public Expediente(Cliente cliente, Tramite tramite) {
        numeroExpedientes++;
        this.numeroExpediente = numeroExpedientes;
        this.cliente = cliente;
        this.tramite = tramite;
        this.estado = "Abierto";
        this.pagado = false;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaApertura = LocalDate.now().format(formatter);
    }

    public void cambiarEstado() {
        int indiceActual = Arrays.asList(ESTADOS).indexOf(estado);
        if (indiceActual < ESTADOS.length - 1) {
            estado = ESTADOS[indiceActual + 1];
            System.out.println("Estado cambiado a: " + estado);
        } else {
            System.out.println("El expediente ya está cerrado");
        }
    }

    public void marcarPagado() {
        if (pagado) {
            System.out.println("El expediente ya está pagado.");
        } else if (!estado.equalsIgnoreCase("Cerrado")) {
            System.out.println("No se puede marcar pagado: el expediente no está cerrado.");
        } else {
            pagado = true;
            System.out.println("Expediente marcado como pagado.");
        }
    }

    public int getNumeroExpediente() { return numeroExpediente; }
    public Cliente getCliente() { return cliente; }
    public Tramite getTramite() { return tramite; }
    public String getEstado() { return estado; }
    public boolean isPagado() { return pagado; }
    public String getFechaApertura() { return fechaApertura; }

    @Override
    public String toString() {
        return "Expediente #" + numeroExpediente +
               "\nCliente: " + cliente.getNombre() +
               " (DNI: " + cliente.getDni() + ")" +
               "\nTrámite: " + tramite.getNombreTramite() +
               " (Código: " + tramite.getCodigo() + ", Precio: " + tramite.getPrecioBase() + " €)" +
               "\nEstado: " + estado +
               "\nPagado: " + (pagado ? "Sí" : "No") +
               "\nFecha de apertura: " + fechaApertura +
               "\n-----------------------------";
    }
}