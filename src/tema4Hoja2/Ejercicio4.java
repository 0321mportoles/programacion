package tema4Hoja2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio4 {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nombreYApellido1 = leerFrase();
		String nombreYApellido2 = leerFrase();
		
		String nombre1 = extraerNombre(nombreYApellido1);
		String nombre2 = extraerNombre(nombreYApellido2);
		
		String apellido1 = extraerApellido(nombreYApellido1);
		String apellido2 = extraerApellido(nombreYApellido2);
		
		System.out.println();
		System.out.println(nombre2 + apellido1);
		System.out.println(nombre1 + apellido2);
		
		reader.close();
	}

	private static String leerFrase() {
		System.out.print("Introduce una nombre y un apellido: ");
		return reader.nextLine();
	}

	private static String extraerNombre(String texto) {
		return texto.substring(0, texto.indexOf(" "));
	}

	private static String extraerApellido(String texto) {
		return texto.substring(texto.indexOf(" "));
	}
}
