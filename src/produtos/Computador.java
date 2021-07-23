package produtos;

public class Computador extends Produto implements Autenticacao{

    @Override
    public boolean autenticaCodigo(long codigoDeBarras) {
        return false;
    }

    @Override
    public double calcularValor(double valorCompra, double valorLucro) {
        return 0;
    }

    @Override
    public double calcularPreco(double preco, double lucro) {
        return 0;
    }
}
