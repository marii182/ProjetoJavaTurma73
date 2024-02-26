package introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int valor;
		int notasCem, notasCinquenta, notasVinte, notasDez, notasCinco, notasDois, notasUm;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = leia.nextInt();
		
		notasCem = valor / 100;
		valor = valor % 100;
		
		notasCinquenta = valor / 50;
		valor = valor % 50;
		
		notasVinte = valor / 20;
		valor = valor % 20;
		
		notasDez = valor / 10;
		valor = valor % 10;
		
		notasCinco = valor / 5;
		valor = valor % 5;
		
		notasDois = valor / 2;
		valor = valor % 2;
		
		notasUm = valor / 1;
		valor = valor % 1;
		
		System.out.printf("%d notas de 100,00%n", notasCem);
		System.out.printf("%d notas de 50,00%n", notasCinquenta);
		System.out.printf("%d notas de 20,00%n", notasVinte);
		System.out.printf("%d notas de 10,00%n", notasDez);
		System.out.printf("%d notas de 5,00%n", notasCinco);
		System.out.printf("%d notas de 2,00%n", notasDois);
		System.out.printf("%d notas de 1,00%n", notasUm);
		
		leia.close();
		
	}

}
