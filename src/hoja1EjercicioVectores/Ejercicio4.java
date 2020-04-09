package hoja1EjercicioVectores;


public class Ejercicio4 {
	public static void main(String[] args)
	{
		
		int[][] matrizNumerica = new int [5][5];
			
		matrizNumerica = rellenarMatriz(matrizNumerica);
		imprimirMatriz(matrizNumerica);
		imprimirDatos(matrizNumerica);
	}
		
	public static int[][] rellenarMatriz(int [][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				matriz[x][y]= (int) Math.floor(Math.random()*200-100);
			}
		}
		return matriz;
	}
		
	public static void imprimirMatriz(int [][] matriz) {
		System.out.println();
		for (int x = 0; x < matriz.length; x++) { 
			System.out.print("| ");
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]);
				System.out.print("\t");
			}
			System.out.println(" |");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}		 
		
	public static void imprimirDatos(int [][] matriz) {
		int mayor=0, menor = 0, lugarMinX = 0, lugarMinY = 0 , lugarMaxX = 0, lugarMaxY = 0;
			
		for (int x = 0; x < matriz.length; x++) { 
				
			for (int y = 0; y < matriz[x].length; y++) {
				
				if (x == 0 && y == 0) {
					mayor = menor = matriz[x][y];
					lugarMinX = lugarMinY = lugarMaxX = lugarMaxY = 0;
					
				} 
				
				if (matriz[x][y] > mayor) {
					 mayor = matriz[x][y];
					 lugarMaxX = x;
					 lugarMaxY = y;
				} else if (menor > matriz[x][y]) {
					menor = matriz[x][y];
					lugarMinX = x;
					lugarMinY = y;
				}
			}
			
		}	
		
		System.out.println("El valor maximo es: " + mayor + " y pertenece a la posicion (x,y) = (" + lugarMaxX + "," + lugarMaxY + ")");	
		System.out.println("El valor mínimo es: " + menor + " y pertenece a la posicion (x,y) = (" + lugarMinX + "," + lugarMinY + ")");		
	}
			
}
