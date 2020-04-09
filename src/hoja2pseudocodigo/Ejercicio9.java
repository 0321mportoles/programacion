package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args)
	{
	
		int contador = 0;
		double suma = 0;
		int x;
		int min = 0;
		int max = 0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero (0 para que termine): ");
		
		do {
			x = reader.nextInt();
			if (x != 0) {
				contador = contador + 1;
				suma = suma + x;
				
				if (contador == 1) {
					max = min = x;
				}
				
				if (x < min ) {
					min = x;
				}
		
				if (x > max ) {
					max = x;
				}
			}		
		} while (x != 0);
		
		System.out.println("La media de la secuencia es: " + (suma / contador) + ". El mayor numero es: " + max + " y el menor numero es: " + min);
		reader.close();
	}

}
