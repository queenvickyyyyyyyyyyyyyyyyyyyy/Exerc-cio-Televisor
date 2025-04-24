public class Principal {
    public static void main(String[] args) {
        Televisor tv = new Televisor(1, 10.0, false);

        ControleRemoto controle = new ControleRemoto(tv);
       
        controle.imprimir();

        controle.ligar();
        controle.imprimir();
       
        controle.trocarCanal(5);
        controle.alumentarVolume();
        controle.alumentarVolume();
        controle.diminuirVolume();
        controle.imprimir();

        controle.desligar();
        controle.imprimir();
    }
}
