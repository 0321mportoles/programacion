package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio01 {
	public static Scanner reader = new Scanner(System.in);
	private int numeroDeEjercicio = 11;
	
	public static void main(String[] args) {
		String cadena;
		char letra;
		
		cadena = leerTextoDeTeclado();
		letra = leerCaracterDeTeclado();
		
		System.out.println("Mi frase original es: " + cadena);
		System.out.println("La letra escogida es: " + letra);
		
		String frase = ponerCaracterEnFraseEnMayusculas(cadena, letra);
		
		System.out.print("Mi frase con la letra en mayusculas es: " + frase);
		
		reader.close();
	}

	private static String leerTextoDeTeclado() {
		System.out.print("Introduce una frase: ");
		return reader.nextLine();
	}

	private static char leerCaracterDeTeclado() {
		char caracter;
		
		System.out.print("Introduce una letra: ");
		caracter = reader.nextLine().toLowerCase().charAt(0);
		
		return caracter;
	}

	private static String ponerCaracterEnFraseEnMayusculas(String cadena, char letra) {
		String caracterComoCadenaDeTexto = String.valueOf(letra);
		caracterComoCadenaDeTexto = caracterComoCadenaDeTexto.toUpperCase();
		cadena = cadena.replace(letra, caracterComoCadenaDeTexto.charAt(0));
		
		return cadena;
	}

}
