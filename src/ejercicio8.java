import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce el numero de mes: ");
		int mes = reader.nextInt();
		System.out.print("Introduce el importe: ");
		double importe = reader.nextDouble();
		
		if (mes == 10) {
			// importe = importe - (importe*15/100);
			importe = importe * (1 - 0.15);
		}	
		System.out.println("el importe es: " + importe);
	
		
		
	}


}

