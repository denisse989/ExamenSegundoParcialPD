package Examen.Ejercicio2;

public abstract class Persona {
    String nombre;
    protected ICanalDeComunicacion canalDeComunicacion;

    public Persona(ICanalDeComunicacion canalDeComunicacion){
        this.canalDeComunicacion =canalDeComunicacion;
    }

    protected abstract void send(Mensaje mensaje);
    protected abstract void messageReceived(String message);
}
