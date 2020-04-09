package hoja3pseudocodigo;


public class Ejercicio37 {
	public static void main(String[] args)
	{
		int[][] matrizAleatoria;
		
		matrizAleatoria = new int [5][4];
		int[][] matrizT = new int[matrizAleatoria[0].length][matrizAleatoria.length];
		
		// Rellenamos la matriz
		for (int x = 0; x < matrizAleatoria.length; x++) {
			for (int y = 0; y < matrizAleatoria [x].length; y++) {
				matrizAleatoria[x][y] = (int) Math.floor(Math.random()*100+1);
			}
		}
		
		// Rellenamos la matriz
		for (int x = 0; x < matrizAleatoria.length; x++) {
			for (int y = 0; y < matrizAleatoria [x].length; y++) {
				matrizT[y][x] = matrizAleatoria[x][y];
			}
		}
		
		//imprimirMatrizNumeros(matrizAleatoria);
		
		// Recorremos la matriz y la imprimimos
		for (int x = 0; x < matrizAleatoria.length; x++) { 
			System.out.print("| ");
			for (int y = 0; y < matrizAleatoria [x].length; y++) {
				System.out.print(matrizAleatoria[x][y]);
				
				if (y != matrizAleatoria[x].length-1) {
					System.out.print("\t");
				}
			}
			System.out.println(" |");
		}
		
		System.out.println();
		
		// imprimimos la matriz rtaspuesta
		for (int x = 0; x < matrizT.length; x++) { 
			System.out.print("| ");
			for (int y = 0; y < matrizT [x].length; y++) {
				System.out.print(matrizT[x][y]);
				
				if (y != matrizT[x].length-1) {
					System.out.print("\t");
				}
			}
			System.out.println(" |");
		}
		
		
	}
}
