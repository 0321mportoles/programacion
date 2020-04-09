package hoja1EjercicioVectores;

public class Ejercicio6 {
	public static void main(String[] args)
	{
		
			int[][]matriz = new int [10][10];
			matriz = rellenarMatriz(matriz);
			imprimirMatriz(matriz);
		
		}
	
		public static int[][] rellenarMatriz(int [][] matriz) {
			int [][] matrizRellena = new int[10][10];
			for (int x = 0; x < matriz.length; x++) {
				for (int y = 0; y < matriz [x].length; y++) {
					matrizRellena[x][y] = (int) Math.floor(Math.random()*10-5);
				}	
			}
			
			return matrizRellena;
		}
		
		public static void imprimirMatriz(int [][] matriz) {
			System.out.println();
			for (int x = 0; x < matriz.length; x++) { 
				System.out.print("| ");
				
				for (int y = 0; y < matriz [x].length; y++) {
					
					System.out.print(matriz[x][y]);
					// Otra forma de sumar columnas sería creando un vector con las mismas columnas
					// que nuestra matriz y almacenar las sumas parciales
					// vectorSumaColumnas[y] = vectorSumaColumnas[y] + matriz[x][y]; 
					
					if (y != matriz[x].length-1) {
						System.out.print("\t");
					}
				}
				System.out.print(" |");
				System.out.println("    =    " + sumarfila(matriz, x));
				
			}
			
			System.out.println("=========== Suma columnas ===========");
			
			for (int x = 0; x < matriz.length; x++) {
				for (int y = 0; y < matriz [x].length; y++) {
					System.out.print(sumarcolumna(matriz, y) + "\t");
				}
				break;
			}
		}
		
		public static int sumarfila(int [][] matriz, int fila) {
			int suma = 0;
			
			for (int x = 0; x < matriz.length; x++) {
				if (fila == x) {
					for (int y = 0; y < matriz [x].length; y++) {						
						suma = suma + matriz[x][y];
					}	
				}
			}
			
			return suma;	
		}
		
		public static int sumarcolumna(int [][] matriz, int columna) {
			int sumac = 0;
			
			for (int x = 0; x < matriz.length; x++) { 
				for (int y = 0; y < matriz [x].length; y++) {
					if (columna == y) {
						sumac = sumac + matriz[x][y];
					}
				}
			}
			return sumac;	
		}
}