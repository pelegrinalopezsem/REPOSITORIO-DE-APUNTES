package PROGRAMACION.UNIDAD_5.Rel1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double ingresar;
        double retirar;
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 0);
        while (opcion != 3) {
            System.out.println("1.Ingresar saldo \n2.Retirar saldo\n3.FIN");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("¿Cuanto dinero quieres ingresar?");
                ingresar = scanner.nextDouble();
                cuenta.ingresarSaldo(ingresar);
                System.out.println(cuenta.saldo);
            } else if (opcion == 2) {
                System.out.println("¿Cuanto dinero quieres retirar?");
                retirar = scanner.nextDouble();
                cuenta.retirarSaldo(retirar);
                System.out.println(cuenta.saldo);
            }
        }
        scanner.close();
    }
}

class CuentaBancaria {
    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void ingresarSaldo(double cantidad) {
            this.saldo += cantidad;
    }

    void retirarSaldo(double cantidad) {
        if (saldo - cantidad >= 0) {
            this.saldo -= cantidad;
        } else {
            imprimirMensaje("INSUFICIENTE SALDO PARA HACER ESTA OPERACION");
        }
    }
    void imprimirMensaje (String mensaje){
        System.out.println(mensaje);
    }
}