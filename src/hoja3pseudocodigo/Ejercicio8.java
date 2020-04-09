package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce el caracter N o S: ");	
		char c = reader.nextLine().charAt(0);
		
		if (c != 'n' && c != 's' ) {
			System.out.println("El caracter introducido " + c + " no es valido. Solo puede ser N o S. " );
		} else {
			System.out.println("El caracter es valido." );
		}

		reader.close();
		System.out.println();
		
		System.out.println("programa terminado");
	}
}
