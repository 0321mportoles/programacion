package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio11 {
	
	
public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String frase = leerFrase();
		frase = frase.toUpperCase();
		rotarFrase(frase);
		System.out.println("Programa terminado");
	
	}


	private static void rotarFrase(String frase) {
		int aux;
		
		System.out.println();
		System.out.println(frase);
		
		for (int i = (frase.length() -1 ); i > 0 ; i--) {
			// Desplazamos la lectura inicial de frase i posiciones
			for (int j = i; j < frase.length() + i ; j++) {
				System.out.print(frase.charAt(j % frase.length()));
			}
			System.out.println();
		}
		
		System.out.println();
	}


	private static String leerFrase() {
		
		System.out.print("Inserte una palabra de menos de 20 caracteres: ");
		String frasePorTeclado = reader.nextLine();

		System.out.print("La palabra introducida es: " + frasePorTeclado);
		return frasePorTeclado;
	}
}