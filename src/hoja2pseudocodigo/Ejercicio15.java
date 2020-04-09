package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args)
	{
		int opcion;
		double area;
		
		do {
			mostrarMenu();
			opcion = esperarOpcion();
		} while (opcion < 1 || opcion > 3);
		
		area = calcularArea(opcion);
		System.out.println("Ha elegido la opcion " + opcion);
		System.out.println("El area es: " + area);
	}
	
	public static void mostrarMenu() {
		System.out.println("Elige el tipo de figura");
		System.out.println("1 - Triangulo");
		System.out.println("2 - Cuadrado");
		System.out.println("3 - Rectangulo");
		System.out.print("Elija (1-3): ");
	}
	
	public static int esperarOpcion() {
		Scanner reader = new Scanner(System.in);
		int o = reader.nextInt();
		
		return o;
	}
	
	public static double calcularArea(int opcion) {
		
		
		switch (opcion) {
			case 1:
				return calcularAreaTriangulo();
			case 2:
				return calcularAreaCuadrado();
			case 3:
				return calcularAreaRectangulo();
		}
		
		return 0.0;
	}
	
	public static double calcularAreaTriangulo() {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Inserte una base: ");
		double base = reader.nextDouble();
		System.out.print("Inserte una altura: ");
		double altura = reader.nextDouble();
		
		reader.close();
		
		return base * altura/2;
	}
	
	public static double calcularAreaCuadrado() {
		Scanner reader = new Scanner(System.in);

		System.out.print("Inserte un numero como lado: ");
		double lado = reader.nextDouble();

		reader.close();
		
		return lado * lado;
	}

	public static double calcularAreaRectangulo() {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Inserte un lado: ");
		double lado1 = reader.nextDouble();
		System.out.print("Inserte otro lado: ");
		double lado2 = reader.nextDouble();
		
		reader.close();
		
		return lado1 * lado2;
	}

	
}