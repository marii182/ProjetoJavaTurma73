package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int segundos, minutos, horas, valor;
		
		
		System.out.println("Digite a duração do evento em segundos: ");
		
		Scanner leia = new Scanner(System.in);
		valor = leia.nextInt();
		
		
		
		horas = valor / 3600;
		valor = valor % 3600;
		
		minutos = valor / 60;
		valor = valor % 60;
		
		segundos = valor;
		
		leia.close();
		
		System.out.printf("\nValor Formatado: " + horas + ":" + minutos + ":" + segundos);
		
		
		
		
		

	}

}
