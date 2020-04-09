package hoja3pseudocodigo;

public class Ejercicio21 {
	public static void main(String[] args)
	{
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int i = 1; i <= 1000; i++) {
			switch (i % 2) {
			case 0:
				sumaPares = sumaPares + i; 
				break;
			case 1: 
				sumaImpares = sumaImpares + i; 
				break;
			default:
				break;
			}
		}
		System.out.println("La suma de los numeros pares del 1 al 1000 es: " + sumaPares);
		System.out.println("La suma de los numeros impares del 1 al 1000 es: " + sumaImpares);
	}
}
