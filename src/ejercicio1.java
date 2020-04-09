import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int aux;
		
		System.out.print("Introduce un numero(A): ");
		int a = reader.nextInt();
		System.out.print("Introduce otro numero (B): ");
		int b = reader.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.print("el valor de A es " + a + " y el valor de B es " + b);
	}

}
