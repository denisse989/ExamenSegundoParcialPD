package Examen.Ejercicio2;

public class Administrativo extends Persona {
    private String nombre;
    private String cargo;


    public Administrativo(String cargo, String nombre, ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);

        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enviarMensajeATodos(String mensaje) {
        this.send(new Mensaje( mensaje,true, true, true));
    }

    @Override
    protected void send(Mensaje mensaje) {
        canalDeComunicacion.send(mensaje, this);

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
