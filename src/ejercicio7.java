import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce el numero de ninos(nNinos): ");
		int nNinos = reader.nextInt();
		System.out.print("Introduce el numero de ninas(nNinas): ");
		int nNinas = reader.nextInt();
		
		int porc_ninos = (nNinos * 100 / (nNinos+ nNinas));
		
		System.out.println("el porcentaje de ninos es: " + porc_ninos);
		System.out.println("el porcentaje de ninas es: " + (100 - porc_ninos));
		
		
	}


}

