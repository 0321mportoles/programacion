package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio1bis {
	
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String frase = reader.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.substring(0, i+1));
		}
		
		System.out.println("programa terminado");
	}

}
