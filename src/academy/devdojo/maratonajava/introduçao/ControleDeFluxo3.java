package academy.devdojo.maratonajava.introduçao;
import java.util.Scanner;

public class ControleDeFluxo3 {
	public static void main(String[]args) {

		System.out.println("Qual o dia da semana você quer trabalhar remotamente?");
		Scanner decisao = new Scanner(System.in);
		byte dia = decisao.nextByte();
		//char, int, byte, short, enum e string.(Tipos de dados que o comando SWITCH recebe)
		switch(dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
		}
	}
}
