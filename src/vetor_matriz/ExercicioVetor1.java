package vetor_matriz;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		int numeros[] = new int[10];

		Scanner leia = new Scanner(System.in);
		int indice, procuraNumero, posicao = -1;
		boolean encontrado = false;

		for (indice = 0; indice < 10; indice++) {

		
			System.out.println("Digite o " + (indice + 1) + "° número: ");
			numeros[indice] = leia.nextInt();
			
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		procuraNumero = leia.nextInt();

		for (indice = 0; indice < 10; indice++) {
			if (procuraNumero == numeros[indice]) {
				posicao = indice + 1;
				encontrado = true;
				System.out.println("O numero " + procuraNumero + " está localizado na posição " + posicao);
				
			}

		}
		if (!encontrado) {
			System.out.println("O numero " + procuraNumero + " não foi encontrado.");
		}

	}

}
