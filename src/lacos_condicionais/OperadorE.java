package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
//		int idade;
//		boolean carteiraM;
//		
		Scanner leia = new Scanner(System.in);
//		
//		System.out.println("Digite a sua idade");
//		idade = leia.nextInt();
//		
//		System.out.println("Você tem carteira de habilitação? (true/false)");
//		carteiraM = leia.nextBoolean();
//		
//		if (idade >= 18 && carteiraM == true) {
//			System.out.println("pode dirigir!");
//		} else {
//			System.out.println("Não pode dirigir!");
//		}
		
		
		// ---------- EXEMPLO 2 -----------
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Parabéns, aprovade!");
		}if (media >= 5) {
			System.out.println("Está de exame!");
		}else {
			System.out.println("Está reprovade!");
		}
		
		// a ser satisfeito na primeira linha, ele não lê o resto
		
		leia.close();
		

	}

}
