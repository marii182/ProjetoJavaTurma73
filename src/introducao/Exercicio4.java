package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float valor1;
		float valor2;
		float valor3;
		float valor4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Valor 1: ");
		valor1 = leia.nextFloat();
		
		System.out.println("Digite o Valor 2: ");
		valor2 = leia.nextFloat();
		
		System.out.println("Digite o Valor 3: ");
		valor3 = leia.nextFloat();
		
		System.out.println("Digite o Valor 4: ");
		valor4 = leia.nextFloat();
		
		diferenca =(valor1 * valor2) - (valor3 * valor4);
		
		System.out.println("A diferença é: " +diferenca);

	}

}
