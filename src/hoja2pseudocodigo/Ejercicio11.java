package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);
				
		System.out.print("Introduce un numero: ");
		int numero = reader.nextInt();
		
		int factorial = 1;

		if (numero > 0) {
			for (int i = 1; i <= numero; i++) {
				factorial = factorial * i;
			}
			System.out.print("el factorial del numero " + numero + " es: " + factorial);
		}
				
		reader.close();
		
		
	}

}
