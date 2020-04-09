package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args)
	{
		System.out.println("Los numeros pares del 1 al 100 son: " );	
		for (int i=1; i<=100; i++) {
			if (i %2 == 0) {
				System.out.print(i+ "," );
			}
		}

		
		System.out.println(" ");
		
		System.out.println("programa terminado");
	}
}
