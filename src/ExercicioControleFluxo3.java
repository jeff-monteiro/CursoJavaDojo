public class ExercicioControleFluxo3 {
    public static void main(String[] args){
        //Imprima todos os números pares até 100000.

        double num = 100000;

        for(int i = 0; i <= num; i++ ){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
