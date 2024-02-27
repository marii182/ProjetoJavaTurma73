package lacos_condicionais;

import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o valor 2: ");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o valor 3: ");
		valor3 = leia.nextInt();
		
		if ((valor1 + valor2) > valor3 ) {
			System.out.println("A soma do valor 1 + valor 2 é maior que o valor 3.");
		}else if ((valor1 + valor2) < valor3) {
			System.out.println("A soma do valor 1 + valor 2 é menor que o valor 3.");
		}else {
			System.out.println("A soma do valor 1 + valor 2 é igual que o valor 3.");
		}
		
		leia.close();
	}

}
