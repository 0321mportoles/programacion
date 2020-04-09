package hoja1EjercicioVectores;

public class Ejercicio3 {
	public static void main(String[] args)
	{
		int max= 0; 
		int min= 0; 
		
		int numero[] = {5, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 22, 25, 26, 27, 28, 29,30};
		
		for (int x = 0; x < numero.length; x++) {
			if (x == 0) {
				max = min = numero[x];
			}
			
			if (numero[x] < min ) {
				min = numero[x];
			}
			if (numero[x] > max ) {
				max = numero[x];
			}
		}
		
		System.out.println("El numero max es : " + max);
		System.out.println("El numero min es : " + min);		
	
	}
}




