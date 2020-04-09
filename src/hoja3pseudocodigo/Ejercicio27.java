package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = reader.nextInt();
		int contador = 0;
		
		System.out.print("Tabla de multiplicar del " + numero + " : ");
		System.out.println();
		
		if(numero <= 10) {
			for (int i = 0; i <= 10; i++) {
			System.out.println( numero + " x " + contador + " = " + (numero*contador));
			contador = contador +1;
			}
		} 
		else {
			System.out.println("El numero no es valido");
		}
		
		reader.close();
	
	}
}
