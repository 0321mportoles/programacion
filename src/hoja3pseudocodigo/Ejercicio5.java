package hoja3pseudocodigo;



public class Ejercicio5 {
	public static void main(String[] args)
	{
		int contador = 0;

		System.out.println("Los numeros impares del 1 al 100 son: " );	
		for (int i=1; i<=100; i++) {
			
			if (i %2 != 0) {
				System.out.print(i+ "," );
				contador = contador + 1;
			}
			
		}
		System.out.println();	
		System.out.println("Hay " + contador + " numeros impares del 1 al 100");	

	
		System.out.println();
		
		System.out.println("programa terminado");
	}
}
