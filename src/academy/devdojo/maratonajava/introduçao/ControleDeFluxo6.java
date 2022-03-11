package academy.devdojo.maratonajava.introduçao;

public class ControleDeFluxo6 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Porém as parcelas não podem ser menores que 1000.

        double valorTotal = 30000;
        for(double parcela = valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$"+ valorParcela);
        }
    }
}
