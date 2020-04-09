import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Tienes bachiller? (0=no, 1=si): ");
		int bachiller = reader.nextInt();
		System.out.print("Tienes prueba de acceso? (0=no, 1=si): ");
		int prueba = reader.nextInt();
			
		if (bachiller == 1 || prueba == 1) {
			System.out.println("la persona puede acceder al grado");
		}
		else 
		{
			System.out.println("la persona no puede acceder");
		}
			
		
	}


}

