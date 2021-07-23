package produtos;

public abstract class Produto {
    double preco;
    int quantidade;
    long codigoDeBarras;

    public abstract double calcularPreco(double preco, double lucro);

    public abstract double calcularValor(double valorCompra, double valorLucro);


}
