package Examen.Ejercicio4;

public class Usuario {
    private String nombre;
    private int ci;
    private int fecha;
    private String profesion;

    public Usuario(String nombre, int ci, int fecha, String profesion) {
        super();
        this.nombre = nombre;
        this.ci = ci;
        this.fecha = fecha;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void mostrarInfo() {
        System.out.println("*** INFORMACION USUARIO ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + ci);
        System.out.println("Fecha de nacimiento: " + fecha);
        System.out.println("Profesion: " + profesion);

    }
}
