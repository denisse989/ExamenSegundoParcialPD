package Examen.Ejercicio5;

public class Reiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*** ESTADO REINICIANDO ***");
        System.out.println("MEMORIA RAM ANTES: "+computadora.getConsumoMemoriaRAM()+"%");
        System.out.println("CONSUMO CPU ANTES: "+computadora.getConsumoCPU()+"%");
        computadora.setConsumoCPU(0);
        computadora.setConsumoMemoriaRAM(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("MEMORIA RAM ACTUAL: "+computadora.getConsumoMemoriaRAM()+"%");
        System.out.println("CONSUMO CPU ACTUAL: "+computadora.getConsumoCPU()+"%");
        System.out.println("LOS PROGRAMAS SE CERRARON");
        System.out.println("");


    }
}
