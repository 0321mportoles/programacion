package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio10 {
	
	
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String frase = leerFrase();
		frase = frase.toUpperCase();
		System.out.println("La frase introducida en mayusculas es : " + frase);	
		contarLetras(frase);
		
		reader.close();
		System.out.println("Programa terminado");	
	}



	private static String leerFrase() {
		System.out.print("Introduce una frase de menos de 60 caracteres: " );
		String cadena = reader.nextLine();
		System.out.println("La frase introducida es: " + cadena);	
		return cadena;
	}
	
	/**
	 * La función contarletras nos imprime por pantalla el número de veces que aparece
	 * cada letra
	 * 
	 * @param cadena
	 */
	private static void contarLetras(String cadena) {
		char caracter;
		
		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);
			System.out.println("El numero de " + caracter + "´s es: " + contarAparicionesDeLetraEnFrase(caracter, cadena));
		}
	}

	private static int contarAparicionesDeLetraEnFrase(char caracter, String cadena) {
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
		}
		
		return contador;
	}
}