package hoja3pseudocodigo;


public class Ejercicio40 {
	
	public static void main(String[] args)
	{
//		mainEjemploOrdenacionVectorSimple();
		int[][][] alumnos = {{{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}, {{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, { 1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}, {{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, { 1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}};
	
		imprimirMatriz(alumnos);
	}
	
	public static void imprimirMatriz(int [][][] matriz) {
	System.out.println();
	for (int x = 0; x < matriz.length; x++) { 
		System.out.print("| ");
		for (int y = 0; y < matriz[x].length; y++) {
			System.out.print("| ");
			for (int z = 0; z < matriz[x][y].length; z++) { 
				System.out.print(matriz[x][y][z]);
				if (z != matriz[x][y].length-1) {
				System.out.print("\t");
			}
			}
		}
		System.out.println(" |");
	}		 
}
}
