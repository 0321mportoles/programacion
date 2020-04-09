package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);	
			
		int a;
			
		System.out.print("Introduce un valor (a): ");
		a = reader.nextInt();
		
		if (a == sumaDeDivisores(a)) {
			System.out.print("El numero " + a + " es perfecto");
		} else {
			System.out.print("El numero " + a + " no es perfecto");
		}
				
		reader.close();
			
	}

	public static int sumaDeDivisores (int a)
	{
		int sumaDivisores = 0;
		
		//System.out.print("Los divisores de " + a + " son: ");
		for (int i = 1; i <= a/2; i++) {
			// System.out.println("Los valores del numero i son: " + i );		
			if (a % i == 0) {
				System.out.println("Los divisores del numero : " + a + " son: " + i + ", ");
				sumaDivisores = sumaDivisores + i;
			}
		}
		
		return sumaDivisores;
	}
}
