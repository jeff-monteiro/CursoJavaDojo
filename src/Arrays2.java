public class Arrays2 {
    public static void main(String[] args){
        //byte, short, int, long, float, double = 0
        //char *\u0000* * * espaço em branco
        //boolean false;
        //reference null
        //IMPORTANTE: O Array não pode mudar de tamanho uma vez criado.

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Kenpachi";
        nomes[3] = "Rukia";

        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
