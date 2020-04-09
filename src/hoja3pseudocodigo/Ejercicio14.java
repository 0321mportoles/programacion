package hoja3pseudocodigo;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args)
	{
	


		int mayor= 0;
		int menor = 0;
		Scanner reader = new Scanner(System.in);
		
		for (int i= 1; i <= 5; i ++){
			System.out.print("Introduce un numero: ");
			int n = reader.nextInt();
						
			if (i == 1) {
				mayor = menor = n;
			}
			
			if (n < menor) {
				menor = n;
			}
			
			if (n > mayor) {
				mayor = n;
			}
		}
		System.out.println("El mayor es : " + mayor);
		System.out.println("El menor es : " + menor);
		
		
		
		reader.close();
	}
}
