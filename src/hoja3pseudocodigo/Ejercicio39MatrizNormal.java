package hoja3pseudocodigo;


public class Ejercicio39MatrizNormal {
	
	public static void main(String[] args)
	{
		mainEjemploOrdenacionMatriz();
	}

	public static void mainEjemploOrdenacionMatriz() {
		int[][][] alumnos = {{{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}, {{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, { 1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}, {{1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}, { 1 ,2, 3, 4, 5}, {1 ,2, 3, 4, 5}}};
		
		imprimirMatriz(alumnos);
		alumnos = ordenarMatrizShell(alumnos);
		imprimirMatriz(alumnos);
	}
	
	public static int[][] ordenarMatrizShell(int matriz[][])
	{
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("ordenarMatrizShell (" + i + "): Inicio");
			imprimirVector(matriz[i]);
			matriz[i] = shell(matriz[i]);
			System.out.println("ordenarMatrizShell (" + i + "): Fin");
			imprimirVector(matriz[i]);
		}
		
		return matriz;
	}
	
	public static int[] shell(int A[]){
		int salto, aux, i;
		boolean cambios;
		for(salto=A.length/2; salto!=0; salto/=2){
			cambios=true;
			while(cambios){ // Mientras se intercambie algún elemento
				cambios=false;
				for(i=salto; i< A.length; i++) // se da una pasada
					if(A[i-salto]>A[i]){ // y si están desordenados
						aux=A[i]; // se reordenan
						A[i]=A[i-salto];
						A[i-salto]=aux;
						cambios=true; // y se marca como cambio.
					}
			}
		}
		 
		return A;
	}
	 
	public static int[][] transponerMatriz (int [][] matriz)
	{
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				matrizT[y][x] = matriz[x][y];
			}
		}
		 
		return matrizT;
	}

	public static void imprimirVector(int vector[]) {
		System.out.println();
		System.out.print("[ ");
		
		for (int x = 0; x < vector.length; x++) { 
				System.out.print(vector[x]);
				System.out.print("\t");
		}
		
		System.out.println(" ]");		
	}
	
	public static void imprimirMatriz(int [][] matriz) {
		System.out.println();
		for (int x = 0; x < matriz.length; x++) { 
			System.out.print("| ");
			for (int y = 0; y < matriz [x].length; y++) {
				System.out.print(matriz[x][y]);
				
				if (y != matriz[x].length-1) {
					System.out.print("\t");
				}
			}
			System.out.println(" |");
		}		 
	}
}
