package PROGRAMACION.UNIDAD_5.Rel1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampara casa = new Lampara(false);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1.ENCENDER\n2.APAGAR\n3.FIN");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println(casa.encender());
            } else if (opcion == 2){
                System.out.println(casa.apaagar());
            }
        }
        scanner.close();
    }
}

class Lampara {
    boolean estado;

    Lampara(boolean estado) {
        this.estado = estado;
    }

    boolean encender() {
        if (this.estado != true) {
            this.estado = true;
            System.out.println("SE PRENDIO LA LUZ");
        } else {
            System.out.println("YA ESTA ENCENDIDO");
        }
        return estado;
    }

    boolean apaagar() {
        if (this.estado != false) {
            this.estado = false;
            System.out.println("SE APAGO LA LUZ");
        } else {
            System.out.println("YA ESTA APAGADO");
        }
        return estado;
    }
}
