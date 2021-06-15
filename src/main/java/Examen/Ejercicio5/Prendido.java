package Examen.Ejercicio5;
import java.util.Random;
public class Prendido implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*** ESTADO PRENDIDO ***");
        computadora.setProgramasAbiertos(programas());
        computadora.setConsumoCPU(computadora.getProgramasAbiertos().length*5);
        computadora.setConsumoMemoriaRAM(computadora.getProgramasAbiertos().length*5);
        System.out.println("MEMORIA RAM: "+computadora.getConsumoMemoriaRAM()+"%");
        System.out.println("CONSUMO CPU: "+computadora.getConsumoCPU()+"%");
        System.out.println("*** PROGRAMAS ABIERTOS ***");
        for (int i=0;i<computadora.getProgramasAbiertos().length;i++){
            System.out.println("- "+computadora.getProgramasAbiertos()[i]);
        }
        System.out.println("");


    }

    private String[] programas() {
        Random random=new Random();
        int programas=random.nextInt(20)+1;
        String[] programa= new String[programas];
        for(int i=0;i<programas;i++){
            programa[i]="PROGRAMA"+(i+1);
        }
        return programa;
    }
}
