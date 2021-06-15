package Examen.Ejercicio3;

public interface IFacebook {
    void attach(IUsuario subscriptor);
    void deattach(IUsuario subscriptor);
    void notifyVideo();
    void notify(String notificacion);
}
