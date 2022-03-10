package academy.devdojo.maratonajava.introduçao;

import java.util.Scanner;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {

        //Crie um switch que dado o valor de 1 a 7
        //considerando 1 domingo imprima se é dia útil ou final de semana
        System.out.println("Selecione um dia, sabendo que Sábado e Domingo não são dias úteis");
        Scanner selecioneDia = new Scanner(System.in);
        byte dia = selecioneDia.nextByte();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Não é dia útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Selecione uma opção!");

        }

    }
}
