package Examen.Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class PaginaFacebook implements IFacebook {
    private String nombre;
    private List<IUsuario> subscriptores = new ArrayList<>();

    public PaginaFacebook(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void attach(IUsuario subscriptor) {
        subscriptores.add(subscriptor);
    }

    @Override
    public void deattach(IUsuario subscriptor) {
        subscriptores.remove(subscriptor);
    }

    @Override
    public void notifyVideo() {
        for (IUsuario u : subscriptores) {
            u.update(nombre + " ha subido un nuevo video ");
        }
        System.out.println();
    }

    @Override
    public void notify(String notificacion) {
        for (IUsuario u : subscriptores) {
            if (!u.soloVideos()) {
                u.update(nombre + " notifica: " + notificacion);
            }
        }
        System.out.println();
    }
}
