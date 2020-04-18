package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio02 {
	public static Scanner reader = new Scanner(System.in);
	private int numeroDeEjercicio = 11;
	
	public static void main(String[] args) {
		String cadena;
		char letra;
		
		cadena = leerTextoDeTeclado();
		letra = leerCaracterDeTeclado();
		
		System.out.println("Mi frase original es: " + cadena);
		System.out.println("La letra escogida es: " + letra);
		
		String frase = eliminar3PrimerosCaracteresDeFrase(cadena, letra);
		
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

	private static String eliminar3PrimerosCaracteresDeFrase(String cadena, char letra) {
//		String caracterComoCadenaDeTexto = String.valueOf(letra);
//		cadena = cadena.replaceFirst(caracterComoCadenaDeTexto, "").replaceFirst(caracterComoCadenaDeTexto, "").replaceFirst(caracterComoCadenaDeTexto, "");
		char [] cadenaVector = cadena.toCharArray();
		int contador = 0;
		
		for (int i = 0; i < cadenaVector.length; i++) {
			
			if (cadenaVector[i] == letra && contador < 3) {
				cadenaVector[i] = ' ';
				contador++;
			}
			
		}
		
		return String.valueOf(cadenaVector);
	}

}
