package es.stemgranada.pt4.pedidos;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido realizado por un cliente.
 *
 * Esta clase gestiona la creación de un pedido, incluyendo la asignación de un cliente,
 * la adición de líneas de pedido, y el cálculo del total con impuestos aplicados.
 * También permite aplicar un descuento a los clientes frecuentes.
 *
 * @see Cliente
 * @see LineaPedido
 * @see ConstantesPedido
 * @author Alumno
 * @version 1.0
 * @since 1.0
 */
public class Pedido {

    private final Cliente cliente;
    private final List<LineaPedido> lineas = new ArrayList<>();

    /**
     * Constructor para crear un nuevo pedido asociado a un cliente.
     *
     * Este constructor asegura que el cliente no sea nulo.
     *
     * @param cliente El cliente que realiza el pedido.
     * @throws IllegalArgumentException Si el cliente es nulo.
     */
    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }

        this.cliente = cliente;
    }

    /**
     * Obtiene el cliente asociado al pedido.
     *
     * @return El cliente que realizó el pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Agrega una línea de pedido al pedido.
     *
     * Este método valida que la línea no sea nula y que no se haya alcanzado el número máximo de líneas permitido.
     *
     * @param linea La línea de pedido que se desea agregar.
     * @throws IllegalArgumentException Si la línea es nula.
     * @throws IllegalStateException Si se ha alcanzado el número máximo de líneas de pedido.
     */
    public void agregarLinea(LineaPedido linea) {
        if (linea == null) {
            throw new IllegalArgumentException("La línea no puede ser null");
        }

        if (lineas.size() >= ConstantesPedido.MAX_LINEAS) {
            throw new IllegalStateException("Se ha alcanzado el número máximo de líneas");
        }

        lineas.add(linea);
    }

    /**
     * Obtiene todas las líneas de pedido asociadas al pedido.
     *
     * @return Una lista con las líneas de pedido.
     */
    public List<LineaPedido> getLineas() {
        return lineas;
    }

    /**
     * Calcula el total del pedido, aplicando el IVA y el descuento para clientes frecuentes si corresponde.
     * El cálculo es:
     * <pre>
     * total = (subtotal * (1 + IVA)) - (descuento si es cliente frecuente)
     * </pre>
     *
     * @return El total del pedido con IVA incluido y el descuento aplicado si el cliente es frecuente.
     */
    public double calcularTotal() {
        double total = 0;

        for (LineaPedido linea : lineas) {
            total += linea.calcularSubtotal();
        }

        if (cliente.esClienteFrecuente()) {
            total -= total * ConstantesPedido.DESCUENTO_CLIENTE_FRECUENTE;
        }

        return total * (1 + ConstantesPedido.IVA);
    }

    /**
     * Método obsoleto para calcular el total sin IVA.
     * Este método ha sido reemplazado por {@link #calcularTotal()} que incluye el IVA y los descuentos correspondientes.
     * 
     * @deprecated Este método está en desuso, use {@link #calcularTotal()} en su lugar.
     * @return El total del pedido sin IVA.
     */
    @Deprecated
    public double calcularTotalSinIva() {
        double total = 0;

        for (LineaPedido linea : lineas) {
            total += linea.calcularSubtotal();
        }

        return total;
    }
}

