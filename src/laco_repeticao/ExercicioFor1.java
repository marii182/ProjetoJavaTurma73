package laco_repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		int num1, num2, contador;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = leia.nextInt();
		
		if(num1 < num2) {
			for(contador = num1; contador <= num2; contador++) {
			 if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador);
			}
			}
		}else {
			System.out.println("Intervalo Inválido!");
		}
		leia.close();
	}
	 
}
