package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = reader.nextLine();
		
		for (int i = 0; i < 5; i++) {
			for (int espacio = 0; espacio < i; espacio++) {
				System.out.print("\t\t\t\t");
			}
			System.out.println(frase);
		}
		
		reader.close();
	}
}
