package vetor_matriz;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		int numeros[][] = {
				{10, 15, 35},
				{70, 120, 140}, 
				{50, 100, 150}};
		//linha e coluna
		
		//int[][] matriz = new int[3][3];
		
		int linha, coluna;
		
		// percorrer as linhas da matriz
		for(linha = 0; linha < 3; linha++) {
			
			//percorrer as colunas da Matriz
			for(coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Numeros[ " + linha + "][" + coluna + "]" + numeros[linha][coluna]);
			}
			
		}
	}

}
