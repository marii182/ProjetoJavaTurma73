package vetor_matriz;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		int matrizNumeros[][] = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;

		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizNumeros[linha][coluna] = leia.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.print(matrizNumeros[linha][coluna] + " ");
				}

			}

		}

		System.out.println("\nDiagonal Secundária: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 2) {
					System.out.print(matrizNumeros[linha][coluna] + " ");
				}

			}

		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					somaPrincipal += matrizNumeros[linha][coluna];
				}

			}

		}
		System.out.println("\nSoma da diagonal principal: " + somaPrincipal);
		

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 2) {
					somaSecundaria += matrizNumeros[linha][coluna];				}

			}

		}
		System.out.println("\nSoma da diagonal secundária: " + somaSecundaria);
		
	}

}
