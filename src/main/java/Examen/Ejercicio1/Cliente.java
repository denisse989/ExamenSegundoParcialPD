package Examen.Ejercicio1;

import chainOfResponsability.basic.HandlerManager;

public class Cliente {
    public static void main (String[] argsssss){
        GuardarCambios guardarCambios = new GuardarCambios();
        Cambio cambio=new Cambio();

        Documento documento1=new Documento("TITULO1");
        guardarCambios.setState(documento1);
        cambio.guardar(guardarCambios.createMemento());

        Documento documento2=new Documento("TITULO2");
        guardarCambios.setState(documento2);
        cambio.guardar(guardarCambios.createMemento());

        Documento documento3=new Documento("TITULO3");
        guardarCambios.setState(documento3);
        cambio.guardar(guardarCambios.createMemento());

        Documento documento4=new Documento("TITULO4");
        guardarCambios.setState(documento4);
        cambio.guardar(guardarCambios.createMemento());

        //ctrl+z
        guardarCambios.restoreFromMemento(cambio.getRevertir());
        guardarCambios.restoreFromMemento(cambio.getRevertir());
        guardarCambios.restoreFromMemento(cambio.getRevertir());

        //ctrl+y
        guardarCambios.restoreFromMemento(cambio.getDeshacer());
        guardarCambios.restoreFromMemento(cambio.getDeshacer());
        guardarCambios.restoreFromMemento(cambio.getDeshacer());



    }
}
