public class ExercícioControleFluxo2 {
    public static void main(String[] args){
        //imprima todos os números pares de 0 até 100.000
        int valor = 100000;

        for(int i=0; i<=valor; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
}
