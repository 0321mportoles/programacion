package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int n;
		int suma= 0;
		int contador = 0;
		
		do {
			System.out.print("Introduce un valor (a): ");
			n = reader.nextInt();
			
			if (n % 5 == 0) {
				suma = suma + n;
			}
			
			if (n!= 0) {	
				contador = contador + 1;
			}
						
		} while (n!= 0);

		reader.close();
		
		System.out.println("El numero de numeros insertados es: " + contador);
		System.out.println("La suma de los numeros insertados que son multiplos de 5 es: " + suma);
	}

}
