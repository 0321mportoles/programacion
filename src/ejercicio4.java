import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero (B): ");
		int b = reader.nextInt();
		System.out.print("Introduce otro numero (C): ");
		int c = reader.nextInt();
		
		
		if (a > b & a > c) {		
			System.out.println("A es el mayor ");
		}
		else if (b > a & b > c)	{	
			System.out.println("b es el mayor");
		}
		else {
			System.out.println("c es el mayor");
		}
		
	}


}

