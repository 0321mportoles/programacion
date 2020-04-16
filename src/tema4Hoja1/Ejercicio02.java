package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio02 {
	
	
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String frase;
		
		frase = leerFrase();
		buscarMayusculasYMinusculas(frase);

		System.out.println("Programa terminado");
		
	
	}

	private static String leerFrase() {
		
		System.out.print("Inserte una frase: ");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}

	private static void buscarMayusculasYMinusculas(String frase) {

		int mayus= 0 ;
		int minus = 0;
		
		String fraseMayus = frase.toUpperCase();
		String fraseMinus = frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == ' ') {
				// continue;
			} else {
			
				if (frase.charAt(i) == fraseMayus.charAt(i)) {
						mayus = mayus + 1;
				}
				
				if (frase.charAt(i) == fraseMinus.charAt(i)) {
						minus = minus + 1;
				}
			}
	
		}
		
		System.out.println("Hay "+ mayus + " mayusculas y " + minus + " minusculas");
	}
}