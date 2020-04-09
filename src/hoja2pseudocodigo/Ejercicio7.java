package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int n;
		int sumaPar = 0, sumaImpar = 0, contador = 0;


		System.out.print("Introduce un valor (n): ");
		n = reader.nextInt();
			
		if(n != 0) {
			while (n!= 0) {
				contador = contador + 1;

				if (contador % 2 ==0) {
					sumaPar = sumaPar + n;
				} else {
					sumaImpar = sumaImpar + n;
				}

				System.out.print("Introduce un nuevo valor (n): ");
				n = reader.nextInt();
			
			}
			
			System.out.println("La suma de los numeros insertados en los puestos impares es: " + sumaImpar);
			System.out.println("La suma de los numeros insertados en los puestos pares es: " + sumaPar);
			
		} else {
			System.out.println("programa terminado");
		}
		
		reader.close();
		
		
	}

}
