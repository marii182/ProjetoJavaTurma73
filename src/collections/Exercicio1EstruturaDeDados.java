package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1EstruturaDeDados {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		String cliente = "vazio";
		
		do {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Sair do programa");
			System.out.println("Escolha uma opção: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				leia.nextLine();
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("Fila: ");
				for (String clienteFila: fila) {
					System.out.println(clienteFila);
				}
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				}else {
					System.out.println("Fila: ");
					for (String clienteFila: fila) {
						System.out.println(clienteFila);
					}
				}
				break;
			case 3:
				if(fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				}else {
					fila.remove();
					System.out.println("Fila: ");
						for (String clienteFila: fila) {
							System.out.println(clienteFila);
						}
						System.out.println("O Cliente foi Chamado!");
					}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção Invalida.");
			}
		}while (opcao != 0);
		
		leia.close();
		
		}
	}


