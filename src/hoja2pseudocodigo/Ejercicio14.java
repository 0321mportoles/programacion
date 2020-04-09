package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args)
	{
				
		Scanner reader = new Scanner(System.in);
			
		System.out.print("Introduce un numero: ");
		int n = reader.nextInt();
		
		System.out.print("los numeros primos hasta " + n + " son: ");
		

	
			for (int i = 2; i <= n; i++) {
				if (esPrimo(i)) {
					System.out.print(i + ", ");
				}
			}

		reader.close();

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

