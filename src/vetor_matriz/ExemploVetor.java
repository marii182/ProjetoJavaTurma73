package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		String cachorros[] = new String[3];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		// guarda os nomes
		for(indice = 0; indice < 3; indice++) {
			
			//systout e pressionar CTRL + Espaço
			System.out.println("Digite o " + (indice + 1) + "° nome: ");
			cachorros[indice] = leia.nextLine();
			//entre colchetes pode colocar a casa que se quer ser atualizada
		}
		
		//length = comprimento
		
		//lista os nomes
		for(indice = 0; indice < cachorros.length; indice++) {
			System.out.println("cachorro [" + indice +"]: " +cachorros[indice]);
		}
	}

}
