package Examen.Ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class Cambio {
    private List<EstadoDoc> cambios=new ArrayList<>();
    private List<EstadoDoc> deshacer=new ArrayList<>();

    public void guardar(EstadoDoc state){
        cambios.add(0,state);
    }
    public EstadoDoc getRevertir(){
        System.out.println("**** REVERTIR *****");
        deshacer.add(cambios.get(0));
        cambios.remove(0);
        return cambios.get(0);
    }
    public EstadoDoc getDeshacer(){
        System.out.println("**** DESHACER *****");
        return deshacer.remove(deshacer.size()-1);
    }

}
