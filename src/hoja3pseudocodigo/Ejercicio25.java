package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args)
	{
		int c;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero menor de 5000: ");
		int numero = reader.nextInt();
		
		if (numero > 5000) {
			System.out.print("El numero no es valido. ");
		} 
		else {	
			System.out.print("El numero introducido en numeros romanos es: " );
			
			// Millars
			if (numero / 1000 > 0 ) {
				for( int i = 0; i < numero / 1000; i++) {
					System.out.print("M");
				}
				numero = numero % 1000;
			}
			// Hundreds
			
			if (numero / 100 > 0 ) {
				switch (numero / 100) {
					case 1: 
						System.out.print("C");
						break;
					case 2:
						System.out.print("CC");
						break;
					case 3:
						System.out.print("CCC");
						break;
					case 4:
						System.out.print("CD");
						break;
					case 5:
						System.out.print("D");
						break;
					case 6:
						System.out.print("DC");
						break;
					case 7:
						System.out.print("DCC");
						break;
					case 8:
						System.out.print("DCCC");
						break;
					case 9:
						System.out.print("CM");
						break;
				}
				numero = numero % 100;
			}
			// Dozens
			if (numero / 10 > 0 ) {
				switch (numero / 10) {
					case 1: 
						System.out.print("X");
						break;
					case 2:
						System.out.print("XX");
						break;
					case 3:
						System.out.print("XXX");
						break;
					case 4:
						System.out.print("XL");
						break;
					case 5:
						System.out.print("L");
						break;
					case 6:
						System.out.print("LX");
						break;
					case 7:
						System.out.print("LXX");
						break;
					case 8:
						System.out.print("LXXX");
						break;
					case 9:
						System.out.print("XC");
						break;
				}
				numero = numero % 10;
			}
			// Units
			if (numero > 0 ) {
				switch (numero) {
					case 1: 
						System.out.print("I");
						break;
					case 2:
						System.out.print("II");
						break;
					case 3:
						System.out.print("III");
						break;
					case 4:
						System.out.print("IV");
						break;
					case 5:
						System.out.print("V");
						break;
					case 6:
						System.out.print("VI");
						break;
					case 7:
						System.out.print("VII");
						break;
					case 8:
						System.out.print("VIII");
						break;
					case 9:
						System.out.print("IX");
						break;
				}
			}
		}
	}
}
