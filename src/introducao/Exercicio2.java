package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite o Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite o Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite o Nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é: " +mediaFinal);
				
			
		

	}

}
