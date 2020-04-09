package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args)
	{
	

		int contador = 0;
		int suma = 0;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero (a): ");
		int a = reader.nextInt();
		
		System.out.print("Introduce un numero mayor que el primero (b): ");
		int b = reader.nextInt();
		
		
		
		if (b < a) {
			System.out.print("El numero introducido está mal.");
		} else {
			System.out.print("Los numeros multiplos de 2 entre " + a + " y " + b + " son: ");
			for (int i = a; i <= b ; i++) {
				if (i % 2 == 0 ) {
					contador = contador + 1;
					suma = suma + i;
					System.out.print(i + ", ");
				}
			}
		System.out.println();
		System.out.println("Hay " + contador + " numeros multiplos de 2 entre " + a + " y " + b );
		System.out.println("La suma de los numeros multiplos de 2 es: " + suma);	
		}
		
			
		
		
		
		reader.close();
	}
}
