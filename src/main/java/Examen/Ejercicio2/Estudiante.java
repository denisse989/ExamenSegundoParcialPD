package Examen.Ejercicio2;

public class Estudiante extends Persona {
    private String nombre;
    private int numeroMatricula;

    public Estudiante(String nombre, int numeroMatricula, ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);
        this.nombre = nombre;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void enviarMensajeATodos(String mensaje) {
        this.send(new Mensaje(mensaje,true, true, true));
    }

    public void enviarMensajeADocentes(String mensaje) {
        this.send(new Mensaje(mensaje,false, true, false));
    }

    public void enviarMensajeAAdministrativos(String mensaje) {
        this.send(new Mensaje(mensaje,false, false, true));
    }

    @Override
    protected void send(Mensaje mensaje) {
        canalDeComunicacion.send(mensaje, this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("*** MENSAJE RECIVIDO POR ESTUDIANTE ***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Matricula: "+numeroMatricula);
        System.out.println("Mensaje: "+message);
        System.out.println(" ");

    }
}
