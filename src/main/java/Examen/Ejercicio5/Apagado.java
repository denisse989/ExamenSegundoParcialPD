package Examen.Ejercicio5;

public class Apagado implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*** ESTADO APAGADO ***");
        computadora.setConsumoCPU(0);
        computadora.setConsumoMemoriaRAM(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("MEMORIA RAM: "+computadora.getConsumoMemoriaRAM()+"%");
        System.out.println("CONSUMO CPU: "+computadora.getConsumoCPU()+"%");
        System.out.println("NINGUN PROGRAMA ESTA ABIERTO");
        System.out.println("");


    }
}
