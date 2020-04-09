import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args)
	{

		int contador = 0;
		int x;
		
		for (x = 1; x <= 100; x++) {
			if (x % 2 == 0 || x % 3 == 0) {
				contador = contador + 1;
			}
		}
		
			
		System.out.println("La cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1 y 100 es :" + contador);

		
		System.out.println("Programa terminado");
		
	}		
}




