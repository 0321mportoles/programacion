package hoja2pseudocodigo;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args)
	{
	
		Scanner reader = new Scanner(System.in);	
		
		
		int q;
		int p;
		int contadorp = 0;
		int contadorq = 0;
		int limite;
		
		
		System.out.print("Introduce un valor (p): ");
		p = reader.nextInt();
			
		System.out.print("Introduce un valor (q): ");
		q = reader.nextInt();
		
		if (p > 0 && q > 0) {
			limite = q;
			
			if (p > q) {
				limite = p;
			}
			
			for (int i = 1; i <= limite/2; i++) {
				// System.out.println("Los valores del numero i son: " + i );		
				if (p % i == 0 ) {
					contadorp = contadorp + 1;
				}
				
				if (q % i == 0 ) {
					contadorq = contadorq + 1;
				}
				
			}
			System.out.println("Los divisores de " + p + " son: " + contadorp);		
			System.out.println("Los divisores de " + q + " son: " + contadorq);
			
			if (contadorp > contadorq) {
				System.out.println(p+ " tiene mas divisores que  " + q );		
			}
			else {
				System.out.println(q+ " tiene mas divisores que  " + p);	
			}
		}
		reader.close();
		
	}

}
