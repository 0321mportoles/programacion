package hoja3pseudocodigo;

import java.util.Scanner;



public class Ejercicio11 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce un numero mayor que cero: " );
		int n = reader.nextInt();
		
		System.out.println("Los numeros divisores de 3 del 1 al "+ n + " son: " );
		for (int i=1; i<=n; i++) {
			if (i % 3 == 0) {
			System.out.print(i+ ", ");
			}
		}
		
		reader.close();
	}
	
		
}
	