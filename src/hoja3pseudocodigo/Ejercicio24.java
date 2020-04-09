package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		boolean esPrimo = true;
		
		System.out.print("Introduce un numero mayor que 1: ");
		int numero = reader.nextInt();
		if (numero >= 1) {
			for (int i = 2; i <= numero/2; i++) {
				if (numero % i == 0) {
					esPrimo = false;
			
				}
			}
			if (esPrimo) {
				System.out.print("El numero  es primo");
			} else {
				System.out.println("El numero no es primo");
			}
		}else {
			System.out.print("El numero  no es correcto");
		}
			
			
				
		reader.close();
	}
}
