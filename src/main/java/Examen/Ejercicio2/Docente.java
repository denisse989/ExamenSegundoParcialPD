package Examen.Ejercicio2;

public class Docente extends Persona {
    private String nombre;
    private int ci;


    public Docente(int ci, String nombre, ICanalDeComunicacion canalDeComunicacion) {
        super(canalDeComunicacion);
        this.ci = ci;
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enviarMensajeADocentes(String mensaje) {
        this.send(new Mensaje(mensaje,false, true, false));
    }

    public void enviarMensajeAEstudiantes(String mensaje) {
        this.send(new Mensaje(mensaje,true, false, false));
    }

    @Override
    protected void send(Mensaje mensaje) {
        canalDeComunicacion.send(mensaje, this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("*** MENSAJE RECIVIDO POR Docente ***");
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("Mensaje: "+message);
        System.out.println(" ");

    }
}
