package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio32 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero (a): ");
		int numero = reader.nextInt();
		int opcion;
		
		do {
			mostrarMenu();
			opcion = esperarOpcion();
		} while (opcion < 1 || opcion > 3);
		System.out.println("Ha elegido la opcion " + opcion);
		
		calcularOpcion(opcion, numero);
		
		reader.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("Elige lo que quieras");
		System.out.println("1 - Es primo");
		System.out.println("2 - Factorial");
		System.out.println("3 - Tabla de multiplicar");
		System.out.print("Elija (1-3): ");
	}
	
	public static int esperarOpcion() {
		Scanner reader = new Scanner(System.in);
		int o = reader.nextInt();
		return o;
	
	}
	
	public static double calcularOpcion(int opcion, int numero) {
		boolean esPrimo = true;
		int factorial = 1;
		int contador = 0;
		
		switch (opcion) {
			case 1: 
				for (int i = 2; i <= numero/2; i++) {
					if (numero % i == 0) {
						esPrimo = false;
					}
					if (esPrimo) {
						System.out.print("El numero  es primo");
					} else {
						System.out.println("El numero no es primo");
					}
				}
				break;
				
			case 2:
				for (int i = 1; i <= numero; i++) {
					factorial = factorial * i;
				}
				System.out.print("el factorial del numero " + numero + " es: " + factorial);
				break;
				
			case 3:
				System.out.print("Tabla de multiplicar del " + numero + " : ");
				System.out.println();
				for (int i = 0; i <= 10; i++) {
					System.out.println( numero + " x " + contador + " = " + (numero*contador));
					contador = contador +1;
				}
				break;
				
			
				
		}
		
		return 0.0;
		
	}
}
