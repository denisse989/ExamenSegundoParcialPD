package Examen.Ejercicio3;

public class Usuario implements IUsuario{
    private String nombre;
    private boolean soloVideos;



    public Usuario(boolean videos, String nombre) {
        super();
        this.soloVideos = videos;
        this.nombre = nombre;
    }


    public boolean isSoloVideos() {
        return soloVideos;
    }


    public void setSoloVideos(boolean videos) {
        this.soloVideos = videos;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void update(String message) {
        System.out.println("MENSAJE RECIBIDO:");
        System.out.println("POR:"+nombre);
        System.out.println(" Mensaje: "+message);

    }


    @Override
    public boolean soloVideos() {
        return soloVideos;
    }
}
