package polimorfismoOperacoesMath;

public class TesteOperacao {
    public static void mostrarCalculo(Operacao operacao, double x, double y){
        System.out.println("O resultado da operação é: " + operacao.calcular(x, y));
    }

    public static void main(String[] args) {
        TesteOperacao.mostrarCalculo(new Soma(), 5, 5);
        TesteOperacao.mostrarCalculo(new Dividir(), 8, 2);
    }
}
