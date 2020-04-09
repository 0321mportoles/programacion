package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args)
	{
		long factorialNumero;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = reader.nextInt();
		
		factorialNumero = factorial(numero);	
		System.out.print("el factorial del numero es: " + factorialNumero);
		reader.close();
	}
				
	public static long factorial(int num) {

		long factorial = 1;
		
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
		}
		
		return factorial;
		
	}
}
