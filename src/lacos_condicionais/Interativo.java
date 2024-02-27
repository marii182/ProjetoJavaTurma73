package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite um valor para X: ");
		x = leia.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		y = leia.nextInt();
		
		if (x > y) {
			System.out.println("X maior que Y.");
			}else if (y == x) {
				System.out.println("X é igual a Y.");
			}else {
				System.out.println("Y é maior que X");
			}

			leia.close();
	}

}
