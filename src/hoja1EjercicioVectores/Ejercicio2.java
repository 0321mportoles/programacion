package hoja1EjercicioVectores;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int[] numeros1;
		
		numeros1 = new int [10];
		
		int[] numeros2;
		
		numeros2 = new int [10];
			
		int[] sumaVectores;
		
		sumaVectores = new int [10];
		
		// Rellenamos la matriz numeros 1
		System.out.println("Rellenando nuestro vector de numeros numero 1");
		numeros1 = rellenarVector(numeros1);
		
		System.out.println("Imprimiendo nuestro vector de numeros numero 1");
		imprimirVector(numeros1);

			
		// Rellenamos la matriz numeros2
		System.out.println("Rellenando nuestro vector de numeros numero 2");
		numeros2 = rellenarVector(numeros2);
		
		System.out.println("Imprimiendo nuestro vector de numeros numero 2");
		imprimirVector(numeros2);
		
		// Calcular la suma
		for (int x = 0; x < sumaVectores.length; x++) { 
			sumaVectores[x] = numeros1[x] + numeros2[x];
		}
		
		System.out.println("Imprimiendo nuestro vector suma de nuestros vectores 1 y 2");
		imprimirVector(sumaVectores);
		
		reader.close();
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
	
	public static int[] rellenarVector(int vector[]) {
		Scanner reader = new Scanner(System.in);
		
		for (int x = 0; x < vector.length; x++) {
			System.out.print("Introduce un numero para el vector: ");
			int a = reader.nextInt();
			vector[x] = a;
		}
		
		return vector;
	}
}


