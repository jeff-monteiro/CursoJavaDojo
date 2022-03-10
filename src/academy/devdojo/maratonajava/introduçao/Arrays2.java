package academy.devdojo.maratonajava.introduçao;

public class Arrays2 {
    public static void main(String[] args){
        //byte, short, int, long, float, double = 0
        //char *\u0000* * * espaço em branco
        //boolean false;
        //reference null
        //IMPORTANTE: O Array não pode mudar de tamanho uma vez criado.

        String[] nomes = new String[]{"Goku","Ichigo","Kenpachi","Rukia"};

        for(String aux : nomes){
            System.out.println(aux);
        }
    }
}
