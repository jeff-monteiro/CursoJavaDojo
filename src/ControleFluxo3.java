
public class ControleFluxo3 {
	public static void main(String[]args) {
		byte dia = 5;
		//char, int, byte, short, enum e string.(Tipos de dados que o comando SWITCH recebe)
		switch(dia) {
			case 1:
				System.out.println("Domingo");
			case 2:
				System.out.println("Segunda");
			case 3:
				System.out.println("Terça");
			case 4:
				System.out.println("Quarta");
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
			case 7:
				System.out.println("Sábado");
		}
	}
}
