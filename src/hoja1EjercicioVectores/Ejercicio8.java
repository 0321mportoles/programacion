package hoja1EjercicioVectores;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class Ejercicio8 {
	
	static final int FILAS = 10;
	static final int COLUMNAS = 20;
	
	public static void main(String[] args)
	{ 
		
		int[][] colegio = new int [FILAS][COLUMNAS]; // Entiendo que esto son 10 filas por 5 columnas
		colegio= rellenarMatriz(colegio);	
		imprimirMatriz(colegio);
		System.out.println();
		calcularMedia(colegio);
	}	
		
	
	public static int[][] rellenarMatriz (int [][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz [x].length; y++) {
				matriz[x][y]= (int) Math.floor(Math.random()*10+1);;
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
	public static void calcularMedia (int [][] matriz) {
		Scanner reader = new Scanner(System.in);
		double mediaAsignatura = 0;
		double mediaEstudiante = 0;
		double suma = 0;
		
		System.out.print("Introduce un numero de 0 a " + FILAS + " para saber la asigantura: ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero de 0 a " + COLUMNAS + " para saber el alumno: ");
		int b = reader.nextInt();
		
		System.out.println("Que me da esto? (matriz.length) " + matriz.length);
		if (a < FILAS && a >= 0) {
			System.out.println("Cuántos alumnos tiene esta asignatura? " + matriz[a].length);
			
			for (int x = 0; x < matriz[a].length; x++) {
				suma = suma + matriz[a][x];	
			}
			
			mediaAsignatura = suma / matriz[a].length;
			System.out.println("La media de la asignatura " + a + " es: " + mediaAsignatura);
		} else { 
			System.out.println("Los datos introducidos no son correctos");
		}
		
		if (b < COLUMNAS && b >= 0) {
			int contador = 0;
			suma = 0;
			for (int x = 0; x < matriz.length; x++) {
				for (int y = 0; y < matriz [x].length; y++) {
					if (y == b) {
						suma = suma + matriz[x][y];
						contador++;
					}
				}
			}
			
			mediaEstudiante = suma / contador ;
			System.out.println("La media del estudiante " + b + " es: " + mediaEstudiante);
		} else { 
			System.out.println("Los datos introducidos no son correctos");
		}
		
		reader.close();
		
	}
	
}