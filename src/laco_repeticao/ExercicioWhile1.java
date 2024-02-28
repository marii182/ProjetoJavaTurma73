package laco_repeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		int idade = 0, totalMenor21 = 0, totalMaior50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				totalMenor21++;
			} else if (idade > 50) {

				totalMaior50++;
			}
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + totalMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalMaior50);

		leia.close();
	}

}
