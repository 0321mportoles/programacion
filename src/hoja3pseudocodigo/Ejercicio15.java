package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args)
	{
	

		int contador = 0;
		int contadorPares = 0;
		int sumaImpares = 0;
		int menor, mayor;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero (a): ");
		int a = reader.nextInt();
		
		System.out.print("Introduce un numero (b): ");
		int b = reader.nextInt();
		
		menor = a;
		mayor = b;
		
		if (b < a) {
			 menor = b;
			 mayor = a;
		}
		
		System.out.print("Los numeros naturales entre " + menor + " y " + mayor + " son: ");
		for (int i = menor; i <= mayor ; i++) {
			System.out.print(i + ", ");
			contador = contador +1;
			if (i % 2 == 0 ) {
				contadorPares = contadorPares + 1;
			} else {
				sumaImpares = sumaImpares + i;
			}
			
			
		} 
		System.out.println();
		System.out.println("Hay " + contador + " numeros naturales entre " + a + " y " + b );
		System.out.println("Hay " + contadorPares + " numeros pares entre " + a + " y " + b );
		System.out.println("La suma de los numeros impares es: " + sumaImpares);	
		
		
		reader.close();
	}
}
