package hoja3pseudocodigo;

import java.util.Scanner;



public class Ejercicio6 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce un numero mayor que cero: " );
		int n = reader.nextInt();
		
		System.out.println("Los numeros del 1 al "+ n + " son: " );
		for (int i=1; i<=n; i++) {
			System.out.print(i+ ", ");
		}
		
		reader.close();
	}
	
		
}
	