package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args)
	{
			
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce un numero: " );
		int n = reader.nextInt();
		
	
		if (n % 2 == 0) {
			System.out.print(" El numero es par ");
		}
		else {
			System.out.print("El numero es impar ");
		}
		reader.close();	
	}
		
		
	
}
