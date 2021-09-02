package exercicios;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;


        /*if(idade < 18) {
            status = "Não Adulto";
        }else{
            status = "Adulto";
        }*/
        status = idade < 18 ? "Não Adulto" : "Adulto";//Operador ternário.
        System.out.println(status);
    }
}
