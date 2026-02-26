package PROGRAMACION.UNIDAD5.Rel3.ejercicio2;

public class MainGestoriaSimple {

    public static void main(String[] args) {
        // Creamos la Gestoria
        Gestoria g = new Gestoria(
                "Gestoría Ejemplo",
                "Calle Falsa 123",
                "555-123456",
                "9:00 - 18:00"
        );

        // Creamos clientes
        Cliente c1 = new Cliente(0, "Sem", "776161614", "65465462", "adsjad@oajcos", "null");

        g.altaCliente(c1);

        // Creamos trámites
        Tramite t1 = new Tramite("Registro Mercantil", 50.0, 3);
        Tramite t2 = new Tramite("Cambio de domicilio", 30.0, 2);

        g.altaTramite(t1);
        g.altaTramite(t2);

        // Abrimos expedientes
        g.abrirExpediente(c1, t1);

        // Mostramos todos los expedientes
        System.out.println("\n=== Listado inicial de expedientes ===");
        g.listarPorEstado("Abierto");

        // Cambiamos estado de expedientes
        g.cambiarEstadoExpediente(1); // Expediente de Ana -> En proceso
        g.cambiarEstadoExpediente(1); // Expediente de Ana -> Cerrado

        // Intentamos marcar pagado
        g.marcarExpedientePagado(1); // Ana -> pagado

        System.out.println("\n=== Expedientes pendientes de pago ===");
        g.listarPendientesDePago();

        System.out.println("\n=== Facturación total ===");
        System.out.println(g.calcularFacturacionTotal() + " €");
    }
}
