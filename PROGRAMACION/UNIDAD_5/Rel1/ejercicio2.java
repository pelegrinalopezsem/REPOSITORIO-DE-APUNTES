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
                System.out.println(cuenta.ingresarSaldo(ingresar));
            } else if (opcion == 2) {
                System.out.println("¿Cuanto dinero quieres retirar?");
                retirar = scanner.nextDouble();
                System.out.println(cuenta.retirarSaldo(retirar));
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

    double ingresarSaldo(double ingresar) {
            this.saldo += ingresar;
        return saldo;
    }

    double retirarSaldo(double retirar) {
        this.saldo -= retirar;
        if (this.saldo < 0) {
            saldo += retirar;
            System.out.println("INSUFICIENTE SALDO PARA HACER ESTA OPERACION");
        }
        return saldo;
    }
}