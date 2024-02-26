package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu Salário Líquido é : " +salarioLiquido);


	}

}
