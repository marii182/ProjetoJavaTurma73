package laco_repeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		int numero, soma = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro");

		do {
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;

			}
		} while (numero != 0);

		System.out.println("A soma dos números positivos digitados é: " + soma);

		leia.close();
	}

}
