package Examen.Ejercicio5;



public class Cliente {
    public static void main (String [] args){
        IStateComputadora state1 = new Apagado();
        Computadora computadora=new Computadora();
        computadora.setState(state1);
        computadora.request();

        state1=new Prendido();
        computadora.setState(state1);
        computadora.request();

        state1=new Reiniciar();
        computadora.setState(state1);
        computadora.request();



    }
}
