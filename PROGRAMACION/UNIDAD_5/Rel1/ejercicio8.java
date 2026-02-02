package PROGRAMACION.UNIDAD_5.Rel1;

import java.nio.file.OpenOption;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int subir;
        int bajar;
        String nuevoCanal;
        Televisor LG = new Televisor("boing", 20);
        while (opcion != 5) {
            System.out.println("1.SUBIR VOLUMEN\n2.BAJAR VOLUMEN\n3.CAMBIAR CANAL\n4.MOSTRAR INFORMACION\n5.FIN");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("CUANTO VOLUMEN SUBES");
                subir = scanner.nextInt();
                System.out.println(LG.subirVolumen(subir));
            } else if (opcion == 2){
                System.out.println("CUANTO VOLUMEN BAJAS");
                bajar = scanner.nextInt();
                System.out.println(LG.subirVolumen(bajar));
            } else if (opcion == 3){
                System.out.println("HA QUE CANAL QUIERES CAMBIAR");
                nuevoCanal = scanner.next();
                System.out.println(LG.cambiarCanal(nuevoCanal));
            } else if (opcion == 4){
                System.out.println(LG.toString());
            }
        }
        scanner.close();
    }
}

class Televisor {
    String canalActual;
    int volumen;
    Televisor (String canalActual, int volumen){
        this.canalActual = canalActual;
        this.volumen = volumen;
    }
    int subirVolumen (int subir){
        if (volumen <= 100) {
            volumen += subir;
        }
        if (volumen > 100){
            volumen -= subir;
            System.out.println("TE HAS PASADO SUBIENDO EL VOLUMEN");
        }
        return volumen;
    }
        int bajarVolumen (int subir){
        if (volumen >= 0) {
            volumen -= subir;
        }
        if (volumen < 0 ){
            volumen += subir;
            System.out.println("TE HAS PASADO BAJANDO EL VOLUMEN");
        }
        return volumen;
    }

    String cambiarCanal(String nuevoCanal){
        this.canalActual = nuevoCanal;
        return canalActual;
    }
    @Override
    public String toString() {
    return "Canal actual: " + canalActual + ", Volumen: " + volumen;
    }
}
