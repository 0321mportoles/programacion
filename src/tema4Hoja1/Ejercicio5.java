package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio5 {
	
	
public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String frase;
		
		frase = leerFrase();
		
		System.out.print("Frase posiciones pares: ");
		imprimirAlternado(frase, 0);
		System.out.println();
		System.out.print("Frase posiciones impares: ");
		imprimirAlternado(frase, 1);
		System.out.println();
		System.out.println("Programa terminado");
	}

	private static String leerFrase() {
		
		System.out.print("Inserte una frase: ");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}
	
	private static void imprimirAlternado(String frase, int inicio) {

		for (int i = inicio; i < frase.length(); i= i+2) {
			System.out.print(frase.charAt(i));
		}
		
		
	}
}