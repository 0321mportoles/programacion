package hoja3pseudocodigo;


public class Ejercicio36 {
	public static void main(String[] args)
	{
		int[][] matrizAleatoria;
		
		matrizAleatoria = new int [5][4];
		
		// Rellenamos la matriz
		for (int x = 0; x < matrizAleatoria.length; x++) {
			for (int y = 0; y < matrizAleatoria [x].length; y++) {
				matrizAleatoria[x][y] = (int) Math.floor(Math.random()*100+1);
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
			
	}
}
