public class Smartphone implements DispositivoInteligente{

    @Override
    public String encender(){
        return "El Smartphone se ha encendido";
    }

    @Override
    public String apagar(){
        return "El Smartphone se ha apagado";
    }

    @Override
    public String conectarWiFi(){
        return "El Smartphone se ha conectado";
    }

    @Override
    public String toString() {
        return encender() + "\n" + apagar() + "\n" + conectarWiFi();
    }

    
}
