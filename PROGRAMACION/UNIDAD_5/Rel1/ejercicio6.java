package PROGRAMACION.UNIDAD_5.Rel1;

public class ejercicio6 {
    public static void main(String[] args) {
        Reloj tarde = new Reloj(18, 30, 02);
        System.out.println(tarde.formatoReloj());
    }
}

    class Reloj {
        int hora;
        int minuto;
        int segundo;
        Reloj(int hora,int minuto, int segundo){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
        String formatoReloj(){
            String formato = hora + ":" + minuto + ":" + segundo;
            return  formato;
        }
    }
