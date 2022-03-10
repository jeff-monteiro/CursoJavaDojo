package academy.devdojo.maratonajava.introduçao;

public class Arrays1 {
    public static void main(String[] args){
        //Qualquer Array em Java é considerado sempre um objeto exemplo: idade.
        //Utilizando Arrays é sempre criada uma Variável de referência.
        //É necessário sempre definir o tamanho do Array.
        //A palavra new é utilizada para criar objetos, então só utilizada quando houver Arrays.

        //Sintaxe para se criar Arrays.
        int[] idade = new int[3];
        idade[0] = 21;
        idade[1] = 19;
        idade[2] = 14;

        System.out.println("Idade 1 = " + idade[1]);
        System.out.println("Idade 2 = " + idade[0]);
        System.out.println("Idade 3 = " + idade[2]);
    }
}
