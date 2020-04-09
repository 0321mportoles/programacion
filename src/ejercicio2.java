import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero (B): ");
		int b = reader.nextInt();
		

		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
	}

}
