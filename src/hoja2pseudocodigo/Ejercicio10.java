package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args)
	{
		int valorPrimoMasProximo;
		
		Scanner reader = new Scanner(System.in);
			
		System.out.print("Introduce un numero: ");
		int a = reader.nextInt();

		valorPrimoMasProximo = numeroPrimoMasProximo(a);
		
		if (valorPrimoMasProximo != 0) {
			System.out.print("El numero  primo más proximo es: " + valorPrimoMasProximo);
		} else {
			System.out.println("No hay numeros primos por debajo de él");
		}
				
		reader.close();

	}
	
	public static int numeroPrimoMasProximo (int a)
	{
		if (a > 0) {
			for (int i = (a-1); i > 0; i--) {
				if (esPrimo(i)) {
					return i;
				}
			}
		}
		
		return 0;
	}

	public static boolean esPrimo(int numero)
	{
		boolean esPrimo = true;

		// System.out.println("Comprobando si " + numero + " es primo");
		
		if (numero > 0) {
			for (int i = 2; i < numero/2; i++) {
				// System.out.println("Comprobando si " + i + " es divisor");
				if (numero % i == 0) {
					// System.out.println(i + " es divisor y por tanto, " + numero + " no es primo");
					esPrimo = false;
					break;
				}
			}
		} else {
			esPrimo = false;
		}
		
		return esPrimo;
		
	}
	
}
