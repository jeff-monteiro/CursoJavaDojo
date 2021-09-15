package exercicios;
import java.util.Scanner;
public class ExercicioControleFluxo2 {
    public static void main(String[] args){
        
        //Crie um switch que dado o valor de 1 a 7
        //considerando 1 domingo imprima se é dia útil ou final de semana
        System.out.println("Selecione um dia, sabendo que Domingo não é dia útil");
        Scanner selecioneDia = new Scanner(System.in);
        byte dia = selecioneDia.nextByte();

        switch(dia){
            case 1:
            if(dia == 1) {
                System.out.println("Domingo não é dia útil");
            }
                break;
            case 2:
                System.out.println("Segunda é dia útil");
                break;
            case 3:
                System.out.println("Terça é dia útil");
                break;
            case 4:
                System.out.println("Terça é dia útil");
                break;
            case 5:
                System.out.println("Terça é dia útil");
                break;
            case 6:
                System.out.println("Terça é dia útil");
                break;
            case 7:
                System.out.println("Terça é dia útil");
                break;
            default:
                System.out.println("Selecione um dia");

        }

    }
}
