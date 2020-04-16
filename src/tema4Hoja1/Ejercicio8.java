package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio8 {
	
	
public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String frase = leerFrase();
		int numero = leerNumero();
		
		System.out.println("Frase insertada: " + frase);
		frase = frase.toUpperCase();
		System.out.println("En Mayusculas: " + frase);
		// System.out.println("Código insertado: " + numero);
		
		System.out.println("Frase codificada: " + fraseCodificada(frase, numero));
		
		System.out.println("Programa terminado");
	
	}

	
	private static String fraseCodificada(String f, int codigo) {
		String textoCodificado = "";
		
		for (int i = 0; i < f.length(); i++) {
			int ascii = (int) f.charAt(i);
			ascii = ascii + codigo;
			String str = new Character((char) ascii).toString();
			textoCodificado = textoCodificado.concat(str);
			
		}
		return textoCodificado;
	}


	private static int leerNumero() {
		System.out.print("Inserte un numero: ");
		int n = reader.nextInt();
		reader.nextLine();

		return n;
	}


	private static String leerFrase() {
		
		System.out.print("Inserte una frase: ");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}
}