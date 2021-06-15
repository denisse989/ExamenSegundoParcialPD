package Examen.Ejercicio2;

public class Cliente {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Estudiante estudiante1 = new Estudiante("Juan1", 1, chat);
        Estudiante estudiante2 = new Estudiante("Juan2", 2, chat);

        Docente docente1 = new Docente(123, "Jose1", chat);
        Docente docente2 = new Docente(456, "jose2", chat);

        Administrativo administrativo1 =  new Administrativo("Director", "Mari1", chat);
        Administrativo administrativo2 =  new Administrativo("Secretaria", "Maria2", chat);

        chat.add(estudiante1);
        chat.add(estudiante2);
        chat.add(docente1);
        chat.add(docente2);
        chat.add(administrativo1);
        chat.add(administrativo2);

        estudiante1.enviarMensajeATodos("Hola! de estudiante para todos");
        estudiante1.enviarMensajeADocentes("Hola soy estudiante para docentes");
        estudiante1.enviarMensajeAAdministrativos("Hola necesito ayuda de estudiante para administrativos");

        docente1.enviarMensajeAEstudiantes("Reprobado! de docente para estudiantes");
        docente1.enviarMensajeADocentes("Hola! de docente para docentes");

        administrativo1.enviarMensajeATodos("Hola! de administrativo para todos");

    }
}
