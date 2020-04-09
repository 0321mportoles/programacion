import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		
		
		
		if (a <= 0) {		
			System.out.println("error");
		}
		
		else {
			System.out.println("del numero " + a + " su raiz es: " + Math.sqrt(a) + " y su cuadrado es: " + Math.pow(a, 2));
		}
		
	}


}

