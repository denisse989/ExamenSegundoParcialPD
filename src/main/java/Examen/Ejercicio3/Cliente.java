package Examen.Ejercicio3;

public class Cliente {
    public static void main(String[] args) {
        PaginaFacebook paginaFacebook = new PaginaFacebook("Memes");

        paginaFacebook.attach(new Usuario(true, "Juan1"));
        paginaFacebook.attach(new Usuario(false, "Juan2"));
        paginaFacebook.attach(new Usuario(true, "Juan3"));
        paginaFacebook.attach(new Usuario(false, "Juan4"));
        paginaFacebook.attach(new Usuario(true, "Juan5"));

        paginaFacebook.notifyVideo();
        paginaFacebook.notify("Nueva imagen");
        paginaFacebook.notify("Nueva publicacion");
        paginaFacebook.notify("Nuevo post");
        paginaFacebook.notifyVideo();
    }
}
