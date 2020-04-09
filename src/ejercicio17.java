import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args)
	{

		
		
		int x;
		double suma = 0;
		int contador = 0;
		int min = 0;
		int max = 0;
		
		do {
			Scanner reader = new Scanner(System.in);
			System.out.print("Introduce un numero: ");
			x = reader.nextInt();	
			
			if (x != 0) {
				
				
				contador = contador + 1;
				suma = suma + x;
				
				if (contador == 1) {
					max = min = x;
				}
				
				if (x < min ) {
					min = x;
				}
				if (x > max ) {
					max = x;
				}
			}
			
			
		} while ( x != 0);
			
		System.out.println("La media es : " + (suma/contador));
		System.out.println("El numero max es : " + max);
		System.out.println("El numero min es : " + min);
		
		System.out.println("Programa terminado");
		
	}		
}




