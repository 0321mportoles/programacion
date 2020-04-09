import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args)
	{
		int contador = 0;
		double suma = 0;
		int x;
		
		Scanner reader = new Scanner(System.in);
		
		
		do {
			System.out.print("Introduce un numero (-1 para que termine): ");
			x = reader.nextInt();
			if (x != -1) {
				contador = contador + 1;
				suma = suma + x;
			}
		
		
		} while (x != -1);
		
		System.out.println("La suma de los " + contador + " valores es " + suma);
		System.out.println("La media de los valores insertados por teclado es : " + (suma / contador));
			
	}		
}




