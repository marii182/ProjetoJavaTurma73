package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio1CollectionList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		int contador;
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 0; contador < 5; contador++) {
			System.out.println("Insira a cor número: " + (contador + 1) + ":");
			String cor = leia.nextLine();
			cores.add(cor);
			
		}
		
		System.out.println("Lista das cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("Lista das cores ordenadas: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		
		leia.close();

	}
	

}
