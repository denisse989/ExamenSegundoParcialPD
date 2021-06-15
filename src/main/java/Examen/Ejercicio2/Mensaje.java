package Examen.Ejercicio2;

public class Mensaje {
    private String contenido;
    private Boolean estudiante;
    private Boolean docente;
    private Boolean administrativo;

    public Mensaje(String contenido, Boolean estudiante, Boolean docente, Boolean administrativo) {
        this.contenido = contenido;
        this.estudiante = estudiante;
        this.docente = docente;
        this.administrativo = administrativo;
    }
    public boolean paraEstudiante(){
        return estudiante;
    }
    public boolean paraDocente(){
        return docente;
    }
    public boolean paraAdministrativo(){
        return administrativo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setEstudiante(Boolean estudiante) {
        this.estudiante = estudiante;
    }

    public void setDocente(Boolean docente) {
        this.docente = docente;
    }

    public void setAdministrativo(Boolean administrativo) {
        this.administrativo = administrativo;
    }

}
