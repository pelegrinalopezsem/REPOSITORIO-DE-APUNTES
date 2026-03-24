package src.Rel1.Ejercicio12;

public class Moto extends Vehiculo{
    
        @Override
    String arrancar() {
        boolean arrancado = false;
        String mensaje = "";
        if (arrancado == true) {
            mensaje = "EL coche ya esta arrancado.";
        } else {
            mensaje = "El coche ha sido arrancado.";
            arrancado = true;
        }
        return mensaje;
    }
        @Override
    String detener() {
        boolean detenido = false;
        String mensaje = "";
        if (detenido == true) {
            mensaje = "EL coche ya esta detenido.";
        } else {
            mensaje = "El coche ha sido detenido.";
            detenido = true;
        }
        return mensaje;
    }
}
