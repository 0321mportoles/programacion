package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio6 {

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
		return palabra.replaceAll("si", "no");
	}
}