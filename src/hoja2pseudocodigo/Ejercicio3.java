package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		int a;
		int resultado;
		
		System.out.print("Introduce un valor entre 1 y 100(a): ");
		a = reader.nextInt();
		
			
			
		if (a > 0 && a <= 100) {
			System.out.println("Tabla de multiplicar de " + a );
			for ( int i = 0; i <= 10; i++) {
				resultado= a * i;
 				System.out.println(a + "x" + i + " = " + resultado);
			}
		} else {
			System.out.print("Valor introducido no valido");
		}
			
				
		reader.close();
	}


}
