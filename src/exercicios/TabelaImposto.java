package exercicios;

import java.util.Scanner;

public class TabelaImposto {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);//Recebe dados do teclado
		System.out.println("Insira o valor mensal do seu salário: ");//Apresenta a msg na tela
		double salario = teclado.nextDouble();//Pega os dados inseridos pelo teclado e atribui a variável salario
		double totalImposto = 0;
		if(salario<1000) {
			totalImposto = salario * 0.05;
		}else if(salario>= 1000 && salario < 2000) {
			totalImposto = salario * 0.1;
		}else if(salario>= 2000 && salario < 4000) {
			totalImposto = salario * 0.15;
		}else {
			totalImposto = salario * 0.2;
		}
		System.out.println("O valor do seu imposto é: "+ totalImposto);
	}
}
