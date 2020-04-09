package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Introduce una frase: ");
		String frase= reader.nextLine();
		frase = frase.toLowerCase();
		
		System.out.print("Introduce un caracter para contabilizar: ");
		char c = reader.nextLine().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			if (c == frase.charAt(i)) {
				contador = contador + 1;
			}
		}
		
		System.out.print("El caracter " + c + " está " + contador + " veces en la frase insertada"); 
		
		
		reader.close();
	}
}
