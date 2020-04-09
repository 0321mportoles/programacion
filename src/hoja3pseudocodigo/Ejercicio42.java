package hoja3pseudocodigo;

import java.text.DecimalFormat;

public class Ejercicio42 {
	
	public static void main(String[] args)
	{
		double[][][] ventas = new double [3][12][4];
		
		ventas = rellenarMatrizTri(ventas);
		imprimirMatrizTri(ventas);
		calcularVentasTotales(ventas);
		
	}
	
	public static double[][][] rellenarMatrizTri(double [][][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				for (int z = 0; z < matriz[x][y].length; z++) {
					matriz[x][y][z] = (int) Math.floor(Math.random()*100);
				}
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatrizTri(double [][][] matriz) {
		System.out.println();
		for (int x = 0; x < matriz.length; x++) { 
			System.out.println("Imprimiendo ventas del representante " + x);
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print("| ");
				for (int z = 0; z < matriz[x][y].length; z++) { 
					System.out.print(matriz[x][y][z]);
					if (z != matriz[x][y].length-1) {
						System.out.print("\t");
					}
				}
				System.out.println(" |");
			}
			System.out.println();
		}		 
	}
	
	public static void calcularVentasTotales(double [][][] matriz) {
		double [][] matrizSuma = new double[matriz[0].length][matriz[0][0].length];
		// Genero una matriz bi-dimensional con todos sus valores a cero
		matrizSuma = rellenarMatriz(matrizSuma, false, 0.0);
		for (int x = 0; x < matriz.length; x++) {
			matrizSuma = sumarMatrices(matrizSuma, matriz[x]);
		}
		
		System.out.println("Imprimiendo las ventas totales");
		imprimirMatriz(matrizSuma);
	}
	
	public static double[][] sumarMatrices(double[][] matriz1, double[][] matriz2) {
		for (int x = 0; x < matriz2.length; x++) {
			for (int y = 0; y < matriz2 [x].length; y++) {
				matriz1[x][y] = matriz1[x][y] + matriz2[x][y];
			}
		}
		return matriz1;
	}

	public static double[][] rellenarMatriz(double [][] matriz, boolean valoresAleatorios, double valorPorDefecto) {
		double [][] matrizRellena = new double[matriz.length][matriz[0].length];
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				if (valoresAleatorios) {
					matrizRellena[x][y] = (int) Math.floor(Math.random()*valorPorDefecto+1);
				}
				matrizRellena[x][y] = valorPorDefecto;
			}
		}
		
		return matrizRellena;
	}
	
	public static void imprimirMatriz(double [][] matriz) {
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
