import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args)
	{
		int intentos = 3;
		boolean contrasenya_incorrecta = true;
		
		Scanner reader = new Scanner(System.in);

		
			
		while (intentos > 0 && contrasenya_incorrecta) {
			System.out.print("Introduce la clave: ");
			String clave = reader.nextLine();
			switch (clave) {
				case "eureka" :
					contrasenya_incorrecta = false;
					System.out.println("Abrete sesamo");
					break;
				default: 
					intentos--;
					break;
			}
		}
		
		if (contrasenya_incorrecta) {
			System.out.println("Has agotado el numero de intentos, sayonara baby");
		}
		
		System.out.println("Programa terminado");
		
	}		
}




