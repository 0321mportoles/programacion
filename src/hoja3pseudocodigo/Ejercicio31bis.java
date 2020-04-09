package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio31bis {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero (a): ");
		int a = reader.nextInt();
		
		System.out.print("Introduce un numero (b): ");
		int b = reader.nextInt();
		int opcion;
		double resultado;
		
		do {
			mostrarMenu();
			opcion = esperarOpcion();
		} while (opcion < 1 || opcion > 4);
		System.out.println("Ha elegido la opcion " + opcion);
		
		calcularOperacion(opcion, a, b);
		
		reader.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("Elige lo que quieras");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicacion");
		System.out.println("4 - Division");
		System.out.print("Elija (1-4): ");
	}
	
	public static int esperarOpcion() {
		Scanner reader = new Scanner(System.in);
		int o = reader.nextInt();
		return o;
	
	}
	
	public static void calcularOperacion(int opcion, double a, double b) {
		
		double resultado = 0.0;
		
		switch (opcion) {
			case 1: 
				resultado = (a+b);
				System.out.println("El resultado de la operación es " + resultado);
				break;
			case 2:
				resultado = (a-b);
				System.out.println("El resultado de la operación es " + resultado);
				break;
			case 3:
				resultado = (a*b);
				System.out.println("El resultado de la operación es " + resultado);
				break;
			case 4:
				resultado = (a/b);
				System.out.println("El resultado de la operación es " + resultado);
				break;
			default:
				System.out.println("No has elegido una opcion correcta");
				
		}
		
		
	}
}
	
	