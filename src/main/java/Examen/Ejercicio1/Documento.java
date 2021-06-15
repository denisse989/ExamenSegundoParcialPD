package Examen.Ejercicio1;

public class Documento {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void showInfo(){
        System.out.println("*** DOCUMENTO ***");
        System.out.println("TITULO: "+titulo);
    }
}
