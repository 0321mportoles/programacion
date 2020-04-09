import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero (B): ");
		int b = reader.nextInt();
		
		/*
		if (a > b) {		
			System.out.println("a es mayor que b");
		}
		
		if (a < b)	{	
			System.out.println("b es mayor que a");
		}
		
		if (a == b) {
			System.out.println("b es igual que a");
		}
		*/
		
		if (a > b) {		
			System.out.println("a es mayor que b");
		} else if (a < b)	{	
			System.out.println("b es mayor que a");
		} else {
			System.out.println("b es igual que a");
		}
	}

}
