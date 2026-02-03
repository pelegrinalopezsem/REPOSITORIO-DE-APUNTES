package PROGRAMACION.UNIDAD_5.Rel1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos;
        int segundos;
        Reloj tarde = new Reloj(18, 30, 02);
        System.out.println(tarde);
        int opcion = 0;
        while (opcion != 5) {
            tarde.imprimirMensaje("1.SUMAR MINUTOS\n2.RESTAR MINUTOS\n3.SUMAR SEGUNDOS\n4.RESTAR MINUTOS\n5.FIN");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                tarde.imprimirMensaje("¿CUANTOS MINUTOS QUIERES SUMAR?");
                minutos = scanner.nextInt();
                tarde.sumarMinutos(minutos);
                System.out.println(tarde);
            } else if (opcion == 2) {
                tarde.imprimirMensaje("¿CUANTOS MINUTOS QUIERES RESTAR?");
                minutos = scanner.nextInt();
                tarde.restarMinutos(minutos);
                System.out.println(tarde);
            } else if (opcion == 3) {
                tarde.imprimirMensaje("¿CUANTOS SEGUNDOS QUIERES SUMAR?");
                segundos = scanner.nextInt();
                tarde.sumarSegundos(segundos);
                System.out.println(tarde);
            } else if (opcion == 4) {
                tarde.imprimirMensaje("¿CUANTOS SEGUNDOS QUIERES RESTAR?");
                segundos = scanner.nextInt();
                tarde.restarSegundos(segundos);
                System.out.println(tarde);
            }
        }
        scanner.close();
    }
}

class Reloj {
    int hora;
    int minuto;
    int segundo;

    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    void sumarMinutos(int minutos) {
        int totalminutos = minuto + minutos;
        if (minuto + minutos >= 60) {
            minuto = 0;
            minuto += totalminutos - 60;
            hora += 1;
        } else {
            minuto += minutos;
        }
    }

    void restarMinutos(int minutos) {
        if (minuto < minutos) {
            hora--;
            minuto += 60;
        }
        minuto -= minutos;
    }

    void sumarSegundos(int segundos) {
        int totalsegundos = segundos + segundo;
        if (totalsegundos >= 60) {
            segundo = 0;
            segundo += totalsegundos - 60;
            if (minuto + 1 >= 60) {
                minuto = 0;
                minuto += (minuto + 1) - 60;
                hora += 1;
            } else {
                minuto += 1;
            }
        } else {
            segundo += segundos;
        }
    }

    void restarSegundos(int segundos) {
        int totalsegundos = segundo - segundos;
        if (totalsegundos < 0) {
            minuto -= 1;
            segundo = 60 + totalsegundos;
        } else {
            segundo = totalsegundos;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
