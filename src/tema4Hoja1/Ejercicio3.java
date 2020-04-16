package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio3 {
	
	
public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String frase;
		
		frase = leerFrase();
		String palabra = LeerPalabra();
		posicionPalabraEnFrase(frase, palabra);

		System.out.println("Programa terminado");
	
	}

	private static String leerFrase() {
		
		System.out.print("Inserte una frase: ");
		String frasePorTeclado = reader.nextLine();

		return frasePorTeclado;
	}
	
	private static String LeerPalabra() {
		System.out.print("Inserte una palabra: ");
		String palabraPorTeclado = reader.nextLine();

		return palabraPorTeclado;
	}


	private static void posicionPalabraEnFrase(String frase, String palabra) {
		
		if (frase.indexOf(palabra) == -1) {
			System.out.println("La palabra " + palabra + " no está en la frase " + frase);
		} else {
			System.out.println("La palabra "+ palabra + " esta situada en la posicion " + (frase.indexOf(palabra))  + " de la frase: " + frase);
		}
		
		
	}
}