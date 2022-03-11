package academy.devdojo.maratonajava.introduçao;

public class ControleDeFluxo5 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Porém as parcelas não podem ser menores que 1000.

        double valorTotal = 50000;

        for(double parcela=1; parcela<=valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }else{
                System.out.println("Parcela " + parcela + " R$"+ valorParcela);
            }

        }
    }
}
