
public class ControleFluxo4 {
	public static void main(String[]args) {
		//Estrutura de repetição com while.
		//Estrutura de repetição com do/while.
		//Estrutura de repetição com for.
		int contador = 0;
		while(contador < 10) {//Ele só vai executar enquanto a condição for verdadeira.
			System.out.println("Deu merda");
			contador ++;
		}
		do {
			System.out.println("Dentro do do while");
		}while(contador < 10);//Nesse caso ele executa a condição pelo menos uma vez.
		
		
		for (int i = 0; i < 10; i++) {//Nesse caso ele avalia toda a instrução.
			System.out.println("O valor de i é: "+i);
			if(i==5){
				break;
			}
		}//Uma variável não pode ser utilizada se ela não for inicializada.
		
	}

}
