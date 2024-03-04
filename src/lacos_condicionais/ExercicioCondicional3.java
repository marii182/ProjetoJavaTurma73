package lacos_condicionais;

import java.util.Scanner;

public class ExercicioCondicional3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao = false;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite 'true' se essa é a sua primeira doação ou 'false' se essa não é a sua primeira doação: ");
		primeiraDoacao = leia.nextBoolean();
		
		
		if (idade >= 18 && idade <= 60) {
			System.out.println(nome + " está apto para doar sangue!");
		
		}else if (idade >= 60 && idade <= 69 && primeiraDoacao) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else {
			System.out.println(nome + " está apto para doar sangue!");
		}
		
	}

}
