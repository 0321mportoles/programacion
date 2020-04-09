package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int a;
		int b;
		int suma= 0;
		
		System.out.print("Introduce un valor (a): ");
		a = reader.nextInt();
			
		System.out.print("Introduce un valor (b): ");
		b = reader.nextInt();

		for (int i = a; i <= b; i++) {
			System.out.println("Comprobando valor " + i);
			if (i % 2 != 0) {
				suma = suma + i;
				System.out.println(" --> El valor " + i + " es impar y la suma parcial es: " + suma);
			}
		}

		reader.close();
		System.out.println("La suma de los valores impares entre a y b es: " + suma);
	}

}
