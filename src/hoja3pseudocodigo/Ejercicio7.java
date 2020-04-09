package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args)
	{
	
		int contador = 0;
		String frase;
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Introduce una frase: " );	
			frase = reader.nextLine();
			if ((frase != null) && (!frase.equals(""))) {
				contador = contador + 1;
			}
		} while ((frase != null) && (!frase.equals("")));
			
		
	
		System.out.println("Hay " + contador + " frases");	

		reader.close();
		System.out.println();
		
		System.out.println("programa terminado");
	}
}
