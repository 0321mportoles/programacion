package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio4 {
	
	
public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String frase;
		
		frase = leerFrase();
		
		pasarAmayusculas(frase);
		pasarAminusculas(frase);

		System.out.println("Programa terminado");
		
	}

	

	private static String leerFrase() {
		
		System.out.print("Inserte una frase: ");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}
	
	private static void pasarAmayusculas(String frase) {

		String fraseMayus = frase.toUpperCase();
	
		System.out.println("En mayusculas: " + fraseMayus);
	}
		
	private static void pasarAminusculas(String frase) {
		String fraseMinus = frase.toLowerCase();
		
		System.out.println("En minusculas: " + fraseMinus);
		
	}	
	
		
		

}