package hoja3pseudocodigo;



public class Ejercicio12 {
	public static void main(String[] args)
	{
		int sumaPar = 0;
		int sumaImpar = 0;
		
		System.out.println("Los numeros del 1 al 100 son: " );	
		for (int i=1; i<=100; i++) {
			
			System.out.print(i+ ", " );
			
			if (i %2 == 0) {
				sumaPar = sumaPar + i;
			} else {
				sumaImpar = sumaImpar + i;
			}
			if (i % 10 == 0) {
				System.out.println();
			}
			
			
		}
		
		System.out.println();
		System.out.println("la suma de los numeros pares es: " + sumaPar );
		System.out.println("la suma de los numeros impares es: " + sumaImpar );
			

		
		System.out.println();
		
		System.out.println("programa terminado");
	}
}
