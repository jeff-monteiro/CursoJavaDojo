package academy.devdojo.maratonajava.introduçao;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = teclado.nextLine();
        int idade = teclado.nextInt();
        System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade + " anos.");
        //System.out.println("e sua idade é: " + idade + "anos.");
     
    }   
}
