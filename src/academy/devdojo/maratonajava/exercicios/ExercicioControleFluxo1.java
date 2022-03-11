package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class ExercicioControleFluxo1 {
		public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o número de sua preferência:");
		byte dia = teclado.nextByte();
		switch(dia){
			case 1:
			case 7:
				System.out.println(" Final de semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			    System.out.println("Dia útil");
		    	break;
			default:
				System.out.println("Something went wrong!");
			
			}
		}
}

