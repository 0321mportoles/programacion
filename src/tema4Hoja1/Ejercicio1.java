package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String frase;
		
		frase = leerFrase();
		imprimirResultado(frase);

		System.out.println("programa terminado");
	
	}

	private static String leerFrase() {
		
		System.out.println("Inserte una frase:");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}

	private static void imprimirResultado(String frase) {
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.substring(0, i+1));
		
		}
	
	}
}