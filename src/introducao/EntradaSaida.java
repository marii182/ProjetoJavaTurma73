package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		//Variáveis
		String nome = "Giovanna";
		int idade;
		
		//Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a sua idade: ");
		idade = leia.nextInt();
		
		//concatenação = juntar texto com váriaveis/constantes
		//Saída de dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade + "anos.");

	}

}
