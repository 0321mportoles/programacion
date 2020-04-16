package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio6 {
	
	
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
		int consonantes= 0, vocales = 0, numeros = 0;
			
		for (int i = 0; i < frase.length(); i++) {
			int ascii = (int) frase.charAt(i);
			if (ascii >= 48 && ascii <= 57) {
				numeros++;
			} else if (ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117) {
				vocales++;
			} else if (ascii >= 98 && ascii <= 122 && (ascii != 101 || ascii != 105 || ascii != 111 || ascii != 117)) {
				consonantes++;
			} 
	
		}
		
		System.out.println("Hay "+ consonantes + " consonantes, "+ vocales + " vocales y " + numeros + " numeros");
	}
			
			
	
}