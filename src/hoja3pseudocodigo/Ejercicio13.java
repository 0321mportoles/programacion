package hoja3pseudocodigo;



public class Ejercicio13 {
	public static void main(String[] args)
	{
		int contador = 0;
	
		
		System.out.println("Los numeros multiplos de 2 y 3 del 1 al 100 son: " );	
		for (int i=1; i<=100; i++) {
			
			
			if (i %2 == 0 || i %3 == 0) {
				System.out.print(i+ "," );
				contador = contador +1;
			}
		}
		
		System.out.println();
		System.out.println("el numero de los numeros multiplos de 2 y 3 es: " + contador );

		System.out.println();
		
		System.out.println("programa terminado");
	}
}
