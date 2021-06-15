package Examen.Ejercicio5;

public class Computadora {
    private IStateComputadora state;
    private  String[] programasAbiertos;
    private int consumoMemoriaRAM;
    private int consumoCPU;

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoMemoriaRAM() {
        return consumoMemoriaRAM;
    }

    public void setConsumoMemoriaRAM(int consumoMemoriaRAM) {
        this.consumoMemoriaRAM = consumoMemoriaRAM;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
    public void  request(){
        this.state.handler(this);
    }
}
