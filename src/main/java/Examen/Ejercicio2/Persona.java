package Examen.Ejercicio2;

public abstract class Persona {
    String nombre;
    protected ICanalDeComunicacion canalDeComunicacion;

    public Persona(ICanalDeComunicacion canalDeComunicacion) {
        this.canalDeComunicacion = canalDeComunicacion;
    }
    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
