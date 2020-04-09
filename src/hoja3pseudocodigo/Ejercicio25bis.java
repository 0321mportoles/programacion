package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio25bis {
	public static void main(String[] args)
	{
		
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero menor de 5000: ");
		int numero = reader.nextInt();
		
		if (numero > 5000) {
			System.out.print("El numero no es valido. ");
		} 
		else {	
			System.out.print("El numero introducido en numeros romanos es: " );
		
			// UNIDADES
			if (numero == 1 ) {
				System.out.print("I");
			}
			if (numero == 2 ) {
				System.out.print("II");
			}
			if (numero == 3 ) {
				System.out.print("III");
			}
			if (numero == 4 ) {
				System.out.print("IV");
			}
			if (numero == 5 ) {
				System.out.print("V");
			}
			if (numero == 6 ) {
				System.out.print("VI");
			}
			if (numero == 7 ) {
				System.out.print("VI");
			}
			if (numero == 8 ) {
				System.out.print("VI");
			}
			if (numero == 9 ) {
				System.out.print("IX");
			}
			// DECENAS
			if (numero % 10 == 0) 
			{
				if (numero < 90 ) {
					System.out.print("XC");
				}  
				else if (numero < 80 ) {
					System.out.print("LXXX");
				}
				else if (numero < 70 ) {
					System.out.print("LXX");
				}
				else if (numero < 60 ) {
					System.out.print("LX");
				}
				else if (numero < 50 ) {
					System.out.print("L");
				}
				else if (numero < 40 ) {
					System.out.print("XL");
				}
				else if (numero < 30 ) {
					System.out.print("XXX");
				}
				else if (numero < 20 ) {
					System.out.print("XX");
				}
				else if (numero == 10 ) {
					System.out.print("X");
				}
			}
			// CENTENAS
			if (numero % 100 == 0) {
				if (numero < 900 ) {
					System.out.print("CM");
				}  
				else if (numero < 800 ) {
					System.out.print("DCCC");
				}
				else if (numero < 700 ) {
					System.out.print("DCC");
				}
				else if (numero < 600 ) {
					System.out.print("DC");
				}
				else if (numero < 500 ) {
					System.out.print("D");
				}
				else if (numero < 400 ) {
					System.out.print("CD");
				}
				else if (numero < 300 ) {
					System.out.print("CCC");
				}
				else if (numero < 200 ) {
					System.out.print("CC");
				}
				else if (numero < 100 ) {
					System.out.print("C");
				}
			}
			//MILLARES
			if (numero % 1000 == 0) {
				if (numero == 5000 ) {
					System.out.print("VM");
				}
				else if (numero < 4000 ) {
					System.out.print("IVM");
				}
				else if (numero < 3000 ) {
					System.out.print("XXXM");
				}
				else if (numero < 2000 ) {
					System.out.print("XXM");
				}
				else if (numero < 1000 ) {
					System.out.print("M");
				}
			}
			
		
			
		}
		
		
	}
}
