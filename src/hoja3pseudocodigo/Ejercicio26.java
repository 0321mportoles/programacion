package hoja3pseudocodigo;

import java.util.Scanner;


public class Ejercicio26 {
	
	
	public static void main(String[] args)
	{
		
		String frase;
				
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		frase = reader.nextLine();
			  
		printCenter(frase);
		
		reader.close();
		 
		
    }
	
	public static void printCenter(String cadena) {
		int MAX_WIDTH = 80 - 2;
		
		int init = (MAX_WIDTH - cadena.length()) / 2;
		
		System.out.print("[");
		for(int i=0; i < init; i++) System.out.print(" ");
		System.out.print(cadena);
		for(int i = init + cadena.length(); i < MAX_WIDTH; i++) System.out.print(" ");
		System.out.print("]");
	}
}
