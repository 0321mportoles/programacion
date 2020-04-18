package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio7 {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		String palabra = leerPalabra();
		
		contarVocales(palabra);

		reader.close();
	}

	private static String leerPalabra() {
		System.out.print("Introduce una palabra: ");
		return reader.nextLine();
	}

	private static void contarVocales(String palabra) {
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			switch (palabra.charAt(i)) {
			case 'A':
			case 'a':
			case 'á':
				contadorA++;
				break;
			case 'E':
			case 'e':
			case 'é':
				contadorE++;
				break;
			case 'I':
			case 'i':
			case 'í':
				contadorI++;
				break;
			case 'O':
			case 'o':
			case 'ó':
				contadorO++;
				break;
			case 'U':
			case 'u':
			case 'ú':
				contadorU++;
				break;
			

			default:
				break;
			}
		}
		
		if (contadorA  == Math.max(contadorA, Math.max(contadorE, Math.max(contadorI, Math.max(contadorO, contadorU))))) {
			System.out.println("La vocal que más aparece es la a: " + contadorA);	
		}
		
		if (contadorE  == Math.max(contadorA, Math.max(contadorE, Math.max(contadorI, Math.max(contadorO, contadorU))))) {
			System.out.println("La vocal que más aparece es la e: " + contadorE);	
		}
		
		if (contadorI  == Math.max(contadorA, Math.max(contadorE, Math.max(contadorI, Math.max(contadorO, contadorU))))) {
			System.out.println("La vocal que más aparece es la i: " + contadorI);	
		}
		
		if (contadorO  == Math.max(contadorA, Math.max(contadorE, Math.max(contadorI, Math.max(contadorO, contadorU))))) {
			System.out.println("La vocal que más aparece es la o: " + contadorO);	
		}
		
		if (contadorU  == Math.max(contadorA, Math.max(contadorE, Math.max(contadorI, Math.max(contadorO, contadorU))))) {
			System.out.println("La vocal que más aparece es la u: " + contadorU);	
		}
		
		
	}
}
