package Examen.Ejercicio2;
import java.util.List;
import java.util.ArrayList;

public class Chat implements ICanalDeComunicacion{
    private List<Persona> personas=new ArrayList<>();
    public void add(Persona persona){
        personas.add(persona);
    }
    @Override
    public void send(Mensaje message, Persona persona) {
        for (Persona p:personas){
            if (p!=persona){
                if (p instanceof Estudiante && message.paraEstudiante()){
                    p.messageReceived(message.getContenido());
                }if(p instanceof Docente && message.paraDocente()){
                    p.messageReceived(message.getContenido());
                }if(p instanceof Administrativo && message.paraAdministrativo()){
                    p.messageReceived(message.getContenido());
                }
            }
        }

    }
}
