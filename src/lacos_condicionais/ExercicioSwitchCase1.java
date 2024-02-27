package lacos_condicionais;

import java.util.Scanner;

public class ExercicioSwitchCase1 {

	public static void main(String[] args) {
		int produto, quantidade;
		float valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a) a Lanchonete SuperFaturada! ");
		System.out.println("Digite o código do produto de 1 a 6: ");
		produto = leia.nextInt();
		
		switch (produto) {
		case 1:
			System.out.println("Cachorro quente. ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 10.00f;
			
			System.out.println("Você comprou " +quantidade+ " cachorro(s) quente(s).");
			System.out.println("Valor Total: R$"+valorTotal);
		
		break; 
		
		case 2:
			System.out.println("X-Salada. ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 15.00f;
			
			System.out.println("Você comprou " +quantidade+ " X-Salada(s).");
			System.out.println("Valor Total: R$"+valorTotal);
			
		break;
		
		case 3:
			System.out.println("X-Bacon. ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 18.00f;
			
			System.out.println("Você comprou " +quantidade+ " X-Bacon(s).");
			System.out.println("Valor Total: R$"+valorTotal);

		break;
		
		case 4:
			System.out.println("Bauru. ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 12.00f;
			
			System.out.println("Você comprou " +quantidade+ " Bauru(s).");
			System.out.println("Valor Total: R$"+valorTotal);
			
		break;
		
		case 5:
			System.out.println("Refrigerante ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 8.00f;
			
			System.out.println("Você comprou " +quantidade+ " Refrigerante(s).");
			System.out.println("Valor Total: R$"+valorTotal);
			
		break;
		
		case 6:
			System.out.println("Suco de Laranja ");
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			
			valorTotal = quantidade * 13.00f;
			
			System.out.println("Você comprou " +quantidade+ " suco(s) de laranja.");
			System.out.println("Valor Total: R$"+valorTotal);
			
		break;
		
		default:
			System.out.println("Código invalido! Digite um código válido de 1 a 6. ");
		}
		
		leia.close();
	}

}
