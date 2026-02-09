package PROGRAMACION.UNIDAD4.EJERCICIOS.UN1.PT1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaramos variables
        int numeroPedidos;
        int stockArroz;
        int stockAgua;
        int arrozGastadoAcumulado = 0;
        int aguaGastadaAcumulada = 0;
        double importe;
        double arrozGastadoPedido;
        double aguaGastadoPedido;
        final int ARROZMAKI = 120;
        final double AGUAMAKI = 0.1;
        final int PRECIOMAKI = 8;
        final int ARROZNIGIRI = 50;
        final double AGUANIGIRI = 0.05;
        final int PRECIONIGIRI = 10;
        final int ARROZSASHIMI = 0;
        final double AGUASASHIMI = 0.02;
        final int PRECIOSASHIMI = 12;
        String tipoPLato;
        int unidades;
        int contadorPedidos = 0;
        int totalPiezasMaki = 0;
        int totalPiezasNigiri = 0;
        int totalPiezasSashimi = 0;
        int arrozRestante;
        int aguaRestante;
        int importeCajaTotal = 0;
        boolean stockSuperado = false;

        // Hacemos comprbaciones de errores
        System.out.print("Numero de pedidos: ");
        numeroPedidos = scanner.nextInt();
        while (numeroPedidos <= 0) {
            System.out.print("Numero de pedidos: ");
            numeroPedidos = scanner.nextInt();
        }
        System.out.print("Stock de arroz (g):");
        stockArroz = scanner.nextInt();
        while (stockArroz <= 0) {
            System.out.print("Stock de arroz (g):");
            stockArroz = scanner.nextInt();
        }
        System.out.print("Stock de agua (L):");
        stockAgua = scanner.nextInt();
        while (stockAgua <= 0) {
            System.out.print("Stock de agua (L):");
            stockAgua = scanner.nextInt();
        }
        // Empezamos con los bucles
        for (int i = 1; i <= numeroPedidos && !stockSuperado; i++) {
            System.out.println("--- Pedido " + i + " ---");
            System.out.print("Tipo de plato (maki/nigiri/sashimi): ");
            tipoPLato = scanner.next();
            while (!tipoPLato.equals("maki") && !tipoPLato.equals("nigiri") && !tipoPLato.equals("sashimi")) {
                System.out.print("Tipo de plato (maki/nigiri/sashimi): ");
                tipoPLato = scanner.next();
            }
            System.out.print("Unidades (≥ 0):");
            unidades = scanner.nextInt();
            while (unidades < 0) {
                System.out.print("Unidades (≥ 0):");
                unidades = scanner.nextInt(); 
            }
            if (!tipoPLato.equals("maki")) {
                arrozGastadoPedido = ARROZMAKI * unidades;
                aguaGastadoPedido = AGUAMAKI * unidades;
                importe = PRECIOMAKI * unidades;
            } else if (!tipoPLato.equals("nigiri")) {
                arrozGastadoPedido = ARROZNIGIRI * unidades;
                aguaGastadoPedido = AGUANIGIRI * unidades;
                importe = PRECIONIGIRI * unidades;
            } else {
                arrozGastadoPedido = ARROZSASHIMI * unidades;
                aguaGastadoPedido = AGUASASHIMI * unidades;
                importe = PRECIOSASHIMI * unidades;
            }
            if (stockArroz < arrozGastadoAcumulado + arrozGastadoPedido) {
                stockSuperado = true;
                System.out.println("¡Alerta! Has superado el stock de arroz");
            }
            if (stockAgua < aguaGastadaAcumulada + aguaGastadoPedido) {
                stockSuperado = true;
                System.out.println("¡Alerta! Has superado el stock de agua");
            }
            if (!stockSuperado) {
                contadorPedidos++;
                arrozGastadoAcumulado += arrozGastadoPedido;
                aguaGastadaAcumulada += aguaGastadoPedido;
                importeCajaTotal += importe;
                if (!tipoPLato.equals("maki")) {
                    totalPiezasMaki += unidades;
                } else if (!tipoPLato.equals("nigiri")) {
                    totalPiezasNigiri += unidades;
                } else {
                    totalPiezasSashimi += unidades;
                }
                System.out.println(
                        "Plato: " + tipoPLato + " | Unidades: " + unidades + " | Importe cobrado: " + importe + " €");
                System.out.println("Arroz gastado en el pedido: " + arrozGastadoPedido + "g | Arroz acumulado: "
                        + arrozGastadoAcumulado + " g");
                System.out.printf("Agua gastada en el pedido (L): " + aguaGastadoPedido + " | Agua acumulada (L): " + aguaGastadaAcumulada);
            }
            arrozRestante = stockArroz - arrozGastadoAcumulado;
            aguaRestante = stockAgua - aguaGastadaAcumulada;

            System.out.println("=== RESUMEN FINAL ===");
            System.out.println("Pedidos registrados: " + contadorPedidos + " de " + numeroPedidos);
            System.out.println("Unidades → Maki: " + totalPiezasMaki + " | Nigiri: " + totalPiezasNigiri + " | Sashimi: " + totalPiezasSashimi);
            System.out.println("Consumo total → Arroz: " + arrozGastadoAcumulado + " g | Agua: " + aguaGastadaAcumulada + " L");
            System.out.println("Stock restante → Arroz: " + arrozRestante + " g | Agua: " + aguaRestante + " L");
            System.out.println("Caja del día: " + importeCajaTotal + " €");
            
            if (!stockSuperado){
                System.out.println("Mensaje final:  Registro interrumpido por superación de stock");
            } else {
                System.out.println("Mensaje final: Registro completado con éxito");
            }
            scanner.close();
        }
    }

}
