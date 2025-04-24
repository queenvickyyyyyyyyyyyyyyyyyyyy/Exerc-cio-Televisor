public class Principal {
    public static void main(String[] args) {
        Televisor tv = new Televisor(1, 10.0, false);

        ControleRemoto controle = new ControleRemoto(tv);
       
        controle.imprimir();

        tv.ligar();
        controle.imprimir();
       
        controle.trocarCanal(5);
        controle.alumentarVolume();
        controle.alumentarVolume();
        controle.diminuirVolume();
        controle.imprimir();

        tv.trocarCanal();
        tv.aumentarVolume();
        tv.aumentarVolume();
        controle.imprimir();

        tv.desligar();
        controle.imprimir();
    }
}
