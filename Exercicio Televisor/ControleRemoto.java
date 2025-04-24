public class ControleRemoto {
    private Televisor tv;

    public ControleRemoto(Televisor tv){
        this.tv = tv;

    }

    public void ligar(){
        tv.ligar();
    }

    public void desligar(){
        tv.desligar();
    }

    public void alumentarVolume(){
        tv.aumentarVolume();
    }

    public void diminuirVolume(){
        tv.diminuirVolume();
    }

    public void trocarCanal(int canal){
        tv.trocarCanal();
    }

    public void imprimir() {
        System.out.println(tv.toString());
    }
}