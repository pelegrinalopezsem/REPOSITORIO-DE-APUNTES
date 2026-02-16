package PROGRAMACION.UNIDAD5.Rel1;

public class ejercicio1 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularPerimetro());
    }

    
    
}

class Circulo {
    final double PI = 3.1415;
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }
    double calcularArea() {
        return PI * this.radio * this.radio;
    }
    double calcularPerimetro(){
        return 2*PI*this.radio;
    }
}