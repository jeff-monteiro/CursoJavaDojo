package academy.devdojo.maratonajava.introduçao;

public class Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        double resultado = numero01 / (double)numero02;
        System.out.println(resultado);

        // % mod
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte? "+ isDezMaiorQueVinte);
        
    }
    
}
