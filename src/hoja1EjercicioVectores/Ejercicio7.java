package hoja1EjercicioVectores;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args)
	{
		 
		
		int[][] matrizNumerica = new int [5][5];
		matrizNumerica= rellenarMatriz(matrizNumerica);	
		imprimirMatriz(matrizNumerica);
		cambiarFilas(matrizNumerica);
	}	
		
	
	public static int[][] rellenarMatriz (int [][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				matriz[x][y]= (int) Math.floor(Math.random()*20-10);;
			}
		}
		return matriz;
	}
	public static void imprimirMatriz(int [][] matriz) {
		System.out.println();
		for (int x = 0; x < matriz.length; x++) { 
			System.out.print("| ");
			
			for (int y = 0; y < matriz [x].length; y++) {
				
				System.out.print(matriz[x][y]);
				System.out.print("\t");
			}
			System.out.println(" |");
			
		}
	}
	public static void cambiarFilas(int [][] matriz) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero de 1 a 5: ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero de 1 a 5: ");
		int b = reader.nextInt();
		
		if (a < 5 && a >= 0 && b < 5 && b >= 0) {
			int [] vectorAux = matriz [a];
			matriz [a] = matriz [b];
			matriz [b] = vectorAux;
			imprimirMatriz(matriz);					
		} else {
			System.out.print("El numero no es correcto. ");
		}

		
	}
	
}