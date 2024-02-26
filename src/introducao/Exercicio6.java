package introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		float raio;
		float pi = 3.14159f;
		float area;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		raio = leia.nextFloat();
		
		area = pi * (raio*raio);
		
		System.out.println("A área do círculo é: "+area);
		

	}

}
