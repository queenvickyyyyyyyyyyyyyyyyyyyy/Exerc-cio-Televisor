public class Televisor{
    private int canal;
    private double volume;
    private boolean ligado;

    public Televisor(int canal, double volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        if (ligado && volume < 100){
            volume += 5;
        }
    }

    public void diminuirVolume(){
        if (ligado && volume > 0){
            volume -= 5;
        }
    }

    public void trocarCanal(){
        if (ligado){
            canal++;
        }
    }

    @Override
    public String toString() {
        if (ligado) {
            return "O televisor está ligado no canal " + canal + ", com volume " + volume;
        } else {
            return "O televisor está desligado.";
        }
    }
}