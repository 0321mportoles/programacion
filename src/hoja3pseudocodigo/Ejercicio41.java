package hoja3pseudocodigo;

import java.text.DecimalFormat;

public class Ejercicio41 {
	
	public static void main(String[] args)
	{
		double[][][] notasAlumnos = new double [5][10][20];
		
		notasAlumnos = rellenarMatrizTri(notasAlumnos);
		// imprimirMatrizTri(notasAlumnos);
		imprimirDatosMedias(notasAlumnos);
		
	}
	
	public static double[][][] rellenarMatrizTri(double [][][] matriz) {
		
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				for (int z = 0; z < matriz[x][y].length; z++) {
					matriz[x][y][z] = Math.random()*10;
				}
			}
		}
		return matriz;
	}
	
	public static void imprimirMatrizTri(double [][][] matriz) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println();
		for (int x = 0; x < matriz.length; x++) { 
			System.out.println("Imprimiendo notas del centro " + x);
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print("| ");
				for (int z = 0; z < matriz[x][y].length; z++) { 
					System.out.print(df.format(matriz[x][y][z]));
					if (z != matriz[x][y].length-1) {
						System.out.print("\t");
					}
				}
				System.out.println(" |");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}		 
	}
	
	public static void imprimirDatosMedias(double [][][] matriz) {
		double mediaCurso = 0.0, mediaCentro = 0.0, mediaMaxima = 0.0, suma = 0.0;
		DecimalFormat df = new DecimalFormat("0.00");
		int centro = 0;
		
		for (int x = 0; x < matriz.length; x++) { 
			// System.out.println("En el centro " + x + " : ");
			mediaCentro = 0.0;
			for (int y = 0; y < matriz[x].length; y++) {
				suma = 0;
				for (int z = 0; z < matriz[x][y].length; z++) { 
					suma = suma + matriz[x][y][z];
				}
				
				mediaCurso = suma / matriz[x][y].length;
				mediaCentro = mediaCentro + mediaCurso;
				if ((x == 0 && y == 0) 
					|| (y > 0 && mediaMaxima < mediaCurso))
				{
					mediaMaxima = mediaCurso;
					centro = x;
				}
				
				System.out.println("En el centro " + x + " la media del curso " + y + " es: " + df.format(mediaCurso));
			}
			
			mediaCentro = mediaCentro / matriz[x].length;
			
			// System.out.println("La media del centro " + x + " es: " + df.format(mediaCentro));
		}
		
		System.out.println("La media maxima es: " + df.format(mediaMaxima) + " y pertenece al centro " + centro);
	}
		
		
		
	
	
}
