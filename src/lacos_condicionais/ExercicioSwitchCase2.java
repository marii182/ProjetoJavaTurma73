package lacos_condicionais;

import java.util.Scanner;

public class ExercicioSwitchCase2 {

	public static void main(String[] args) {
		int cargo;
		float novoSalario, salario;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite o código do cargo de 1 a 6: ");
		cargo = leia.nextInt();
		
		switch (cargo) {
		case 1:
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.next();
			leia.nextLine();
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.1f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Gerente.");
			System.out.println("Novo Salário: R$"+novoSalario);
		
		break; 
		
		case 2:
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.next();
			leia.nextLine();
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.07f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Vendedor.");
			System.out.println("Novo Salário: R$"+novoSalario);
			
		break;
		
		case 3:
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.next();
			leia.nextLine();
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.09f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Supervisor.");
			System.out.println("Novo Salário: R$"+novoSalario);
		break;
		
		case 4:
			System.out.println("Digite o nome do colaborador: ");
			leia.skip("\\R?"); //pula o caracter do enter
			nome = leia.nextLine();
			
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.06f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Motorista.");
			System.out.println("Novo Salário: R$"+novoSalario);
			
		break;
		
		case 5:
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.next();
			leia.nextLine();
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.05f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Estoquista.");
			System.out.println("Novo Salário: R$"+novoSalario);
			
		break;
		
		case 6:
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.next();
			leia.nextLine();
			
			
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			novoSalario = salario + (0.08f * salario);
			
			System.out.println("Nome do colaborador: " +nome);
			System.out.println("Cargo: Estoquista.");
			System.out.println("Novo Salário: R$"+novoSalario);
			
		break;
		
		default:
			System.out.println("Código invalido! Digite um código válido de 1 a 6. ");
		}
		
		leia.close();
	}

}


	


