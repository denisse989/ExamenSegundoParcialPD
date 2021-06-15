package Examen.Ejercicio1;

import memento.basic.Memento;

public class GuardarCambios {
    private Documento state;
    public void setState(Documento state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        this.state = state;
    }

    public EstadoDoc createMemento(){
        System.out.println("**** Create State *****");
        state.showInfo();
        return new EstadoDoc(this.state) ;
    }

    public void restoreFromMemento(EstadoDoc estadoDoc){
        this.state= estadoDoc.getDocumento();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
    }

}
