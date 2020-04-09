package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int a;

		
		System.out.print("Introduce un valor (a): ");
		a = reader.nextInt();
		
		System.out.print("Los divisores de " + a + " son: ");
		for (int i = 1; i <= a/2; i++) {
			// System.out.println("Los valores del numero i son: " + i );		
			if (a % i == 0) {
				//System.out.println(i + " es divisor de " + a);
				System.out.print(i + ", ");
			}
			
		}
		
		System.out.print(a);
		

		reader.close();
		
		//System.out.println("Los divisores del numero : " + a + " son: " + i);
	}

}
