import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = reader.nextInt();
		int sum = 0;
		
		if (n > 0) 
		{
			for (int x= 0; x <= n; x++) {
				sum= sum + x;

			}
			System.out.println("La suma es : " + sum);
			
		}
		
		else {
			System.out.println("El numero " + n + " no es natural." );
			
		}
	}		
}




