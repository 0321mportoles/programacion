import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int x;
		int n = reader.nextInt();
		int sum = 0;
		
		// Empezamos a sumar a partir del siguiente numero par
		x = n;
		if (n % 2 != 0) {
			x = n +1;
		}
		
		for (int i= 0; i < n ; i++) {
			if (i == 0) {
				sum = x;
			} 
			else {
				sum= sum + x + (2 * i);
			}
			
		}
		
		System.out.println("La suma es : " + sum);
			
	}		
}




