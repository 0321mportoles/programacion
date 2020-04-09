package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args)
	{
			
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce un numero Real: " );
		int n = reader.nextInt();
		
	
		if (n <= 0) {
			System.out.print(" El numero es negativo ");
		}
		else {
			System.out.print("El numero es positivo ");
		}
		reader.close();	
	}
		
		
	
}
