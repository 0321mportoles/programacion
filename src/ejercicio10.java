import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int entero = reader.nextInt();
	
		while (entero == 0) {
			System.out.println("Introduce un numero valido");
			
		}
		
		if (entero %2 == 0) {
			System.out.println("el numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}		
		
			
		
	}


}

