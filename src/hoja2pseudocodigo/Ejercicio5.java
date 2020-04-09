package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args)
	{
		boolean esPrimo = true;
		Scanner reader = new Scanner(System.in);
				
		System.out.print("Introduce un numero: ");
		int a = reader.nextInt();

		for (int i = 2; i <= a/2; i++) {
			if (a % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		if (esPrimo) {
			System.out.print("El numero  es primo");
		} else {
			System.out.println("El numero no es primo");
		}
				
		reader.close();
		
		
	}

}
