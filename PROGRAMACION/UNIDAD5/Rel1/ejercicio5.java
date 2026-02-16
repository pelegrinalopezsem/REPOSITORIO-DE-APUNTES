package PROGRAMACION.UNIDAD5.Rel1;

public class ejercicio5 {
    public static void main(String[] args) {
        Termometro calor = new Termometro(10);
        System.out.println(calor);
    }
}

class Termometro {
    double temperatura;

    Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    double convertirAFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }
    @Override
    public String toString() {
        return "Temperatura: " + temperatura + " ºC pasada a Fahrenheit: " + convertirAFahrenheit() + " ºF";
    }
}
