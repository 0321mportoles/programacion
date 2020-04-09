package hoja3pseudocodigo;


public class Ejercicio39 {
	
	public static void main(String[] args)
	{
//		mainEjemploOrdenacionVectorSimple();
		mainEjemploOrdenacionMatriz();
	}
	
	public static void mainEjemploOrdenacionVectorSimple() {
		int [] prueba = {5,122,8,3,2,9,7,1,12,5,69,4};
		imprimirVector(prueba);
		prueba = shell(prueba);
		imprimirVector(prueba);		
	}

	public static void mainEjemploOrdenacionMatriz() {
		int[][] alumnos = {{1 ,2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 9, 8 , 7, 6, 5, 4, 3, 2, 1}, {7, 10, 8, 6, 7, 10, 8, 6, 5, -8}, {1, 18, 56, 1, 2, 4, 16, 5, 9, 18}};
		int[][] alumnosT;
		
		alumnosT = transponerMatriz(alumnos);
		imprimirMatriz(alumnos);
		imprimirMatriz(alumnosT);
		
		// imprimirMatriz(alumnosT);
		
		alumnosT = ordenarMatrizShell(alumnosT);
		alumnosT = transponerMatriz(alumnosT);
		
		imprimirMatriz(alumnosT);
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
