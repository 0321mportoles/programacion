package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int a;
		int suma= 0;
		int cuadrado;
		
		System.out.print("Introduce un valor (a): ");
		a = reader.nextInt();
			
		for (int i = 1; i <= a; i++) {
			System.out.println("Comprobando valor " + i);
		
			if (i % 2 == 0) {
				cuadrado = i*i;
				suma = suma + cuadrado;
			}	
		}

		reader.close();
		
		System.out.println("La suma de los cuadrados entre 1 y " + a + " es: " + suma);
	}

}
