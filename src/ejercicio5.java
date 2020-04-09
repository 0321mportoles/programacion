import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero (B): ");
		int b = reader.nextInt();
		System.out.print("Introduce otro numero (C): ");
		int c = reader.nextInt();
		
		
		
		if (a < 0) {		
			System.out.println(a*b*c);
		}
		
		else {
			System.out.println(a+b+c);
		}
		
	}


}

