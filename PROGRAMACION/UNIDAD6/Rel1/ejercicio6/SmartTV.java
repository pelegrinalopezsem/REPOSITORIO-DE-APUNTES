public class SmartTV implements DispositivoInteligente{

    @Override
    public String encender(){
        return "La SmartTV se ha encendido";
    }

    @Override
    public String apagar(){
        return "La SmartTV se ha apagado";
    }

    @Override
    public String conectarWiFi(){
        return "La SmartTV se ha conectado";
    }

    @Override
    public String toString() {
        return encender() + "\n" + apagar() + "\n" + conectarWiFi();
    }

    
}
