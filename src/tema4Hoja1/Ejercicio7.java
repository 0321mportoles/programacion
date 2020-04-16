package tema4Hoja1;

import java.util.Scanner;

public class Ejercicio7 {
	
	
		public static Scanner reader = new Scanner(System.in);
		
		public static void main(String[] args)
		{
		
			String frase;
			
			frase = leerFrase();
			
			
			buscarMayusculasYMinusculas(frase);
		
			System.out.println("Programa terminado");
			
		}
		private static String leerFrase() {
			
			System.out.print("Inserte una frase: ");
			String frasePorTeclado = reader.nextLine();
		
			return frasePorTeclado;
		}
		
		private static void buscarMayusculasYMinusculas(String frase) {
			int mayus= 0, minus = 0, numeros = 0;
						
			for (int i = 0; i < frase.length(); i++) {
				int ascii = (int) frase.charAt(i);
				if (ascii >= 48 && ascii <= 57) {
					numeros++;
				} else if (ascii >= 65 && ascii <= 90) {
					mayus++;
				} else if (ascii >= 97 && ascii <= 122) {
					minus++;
				} 
		
			}
			
			System.out.println("Hay "+ mayus + " mayusculas y " + minus + " minusculas y " + numeros + " numeros");
		}
				
				
		
		}