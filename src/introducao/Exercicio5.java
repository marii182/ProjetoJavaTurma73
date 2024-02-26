package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float valor1;
		float valor2;
		float soma;
		float diferenca;
		float multiplicacao;
		float divisao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = leia.nextFloat();
		
		System.out.println("Digite o valor 2: ");
		valor2 = leia.nextFloat();
		
		soma = valor1 + valor2;
		
		diferenca = valor1 - valor2;
		
		multiplicacao = valor1 * valor2;
		
		divisao = valor1 / valor2;
		
		System.out.println("A resultado da soma dos dois valores é: "+soma);
		System.out.println("A resultado da diferença dos dois valores é: "+diferenca);
		System.out.println("A resultado da multiplicação dos dois valores é: "+multiplicacao);
		System.out.println("A resultado da divisão dos dois valores é: "+divisao);
		
		
		
		if(valor1 > valor2) {
			System.out.println(+valor1+" É maior que "+valor2);
		}else if(valor2>valor1) {
			System.out.println(+valor2+" É maior que "+valor1);
		}else {
			System.out.println("Os valores são iguais.");
		}
		
		

		
		
	}

}
