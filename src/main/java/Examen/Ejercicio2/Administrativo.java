package Examen.Ejercicio2;

public class Administrativo extends Persona {
    String cargo;

    public Administrativo(ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("*** MENSAJE RECIVIDO POR ADMINISTRATIVO ***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Mensaje: "+message);
        System.out.println(" ");

    }
}
