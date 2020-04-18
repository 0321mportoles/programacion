package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio03 {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		String palabra = leerPalabra();
		
		boolean esPalidromo = sonPalidromos(palabra);
		if (esPalidromo) {
			System.out.println("La palabra " + palabra + " es palidromo");
		} else {
			System.out.println("La palabra " + palabra + " NO es palidromo");
		}
		
//		boolean palindromo = 1 < 0 ;
//		if (palindromo) {
//			System.out.println("La palabra " + palabra + " es palidromo");
//		} else {
//			System.out.println("La palabra " + palabra + " NO es palidromo");
//		}

		reader.close();
	}

	private static String leerPalabra() {
		System.out.print("Introduce una palabra: ");
		return reader.nextLine();
	}

	private static String invertirPalabra(String palabra) {
		String palabraInvertida = "";
		
		System.out.println("La palabra invertida inicial: " + palabraInvertida );
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			System.out.println("Escribiendo el caracter " + palabra.charAt(i) + " en la frase invertida : " + palabraInvertida );
			palabraInvertida = palabraInvertida + palabra.charAt(i); 
			
		}
		
		System.out.println("La palabra invertida es: " + palabraInvertida );
		
		return palabraInvertida;
	}

	private static boolean sonPalidromos(String palabra) {
		String palabraAlReves =  invertirPalabra(palabra);
		
		System.out.println("Las palabras a comparar son: " + palabra + " vs " + palabraAlReves );
		
		return palabra.equals(palabraAlReves);
	}

	

}
