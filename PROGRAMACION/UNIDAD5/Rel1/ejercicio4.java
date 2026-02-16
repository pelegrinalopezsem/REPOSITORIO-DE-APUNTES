package PROGRAMACION.UNIDAD5.Rel1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int velocidad;
        Clase coche = new Clase("bmw", "c4", 100);
        while (opcion != 3) {
            coche.imprimirMensaje("1.ACELERAR\n2.FRENAR\n3.FIN");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                coche.imprimirMensaje("INTRODUCE LA VELOCIDAD QUE QUIERES ACELERAR");
                velocidad = scanner.nextInt();
                System.out.println(coche.acelerar(velocidad));
            } else if (opcion == 2) {
                System.out.println("INTRODUCE LA VELOCIDAD QUE QUIERES FRENAR");
                velocidad = scanner.nextInt();
                System.out.println(coche.frenar(velocidad));
            }
        }
        scanner.close();
    }

}

class Clase {
    String marca;
    String modelo;
    int velocidadActual;

    Clase(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    int acelerar(int velocidad) {
        this.velocidadActual += velocidad;
        return velocidadActual;
    }

    int frenar(int velocidad) {
        this.velocidadActual -= velocidad;
        if (this.velocidadActual <= 0) {
            System.out.println("HAS FRENADO DEL TODO");
            this.velocidadActual += velocidad;
        }
        return velocidadActual;
    }

    void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
