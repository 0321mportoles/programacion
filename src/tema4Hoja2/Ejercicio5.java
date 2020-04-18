package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio5 {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		String palabra = leerPalabra();
		System.out.print("La palabra tratada es: " + tratarPalabra(palabra));
		reader.close();
	}

	private static String leerPalabra() {
		System.out.print("Introduce una palabra: ");
		return reader.nextLine();
	}

	private static String tratarPalabra(String palabra) {
		return palabra.charAt(palabra.length()-1) 
				+ palabra.substring(1, palabra.length()-1)
				+ palabra.charAt(0);
	}
}