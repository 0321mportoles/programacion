import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args)
	{

		Scanner reader = new Scanner(System.in);
		
		String mesImpreso;
		
		System.out.print("Introduce un dia: ");
		int dia = reader.nextInt();
		
		System.out.print("Introduce un mes: ");
		int mes = reader.nextInt();
		
		System.out.print("Introduce un ano: ");
		int ano = reader.nextInt();
		
		
		
		
		if (dia > 31  || dia <= 0 || mes > 12 || mes <= 0 ) {
			System.out.println("Fecha no valida");
		}
		else if (ano <= 0) {
			System.out.println("Ano debe ser > 0");
		}
		else {
			switch (mes) {
				case 1 : mesImpreso = "Enero";
					break;
				case 2 : mesImpreso = "Febrero";
					break;
				case 3 : mesImpreso = "Marzo";
					break;
				case 4 : mesImpreso = "Abril";
					break;
				case 5 : mesImpreso = "Mayo";
					break;
				case 6 : mesImpreso = "Junio";
					break;
				case 7 : mesImpreso = "Julio";
					break;
				case 8 : mesImpreso = "Agosto";
					break;
				case 9 : mesImpreso = "Septiembre";
					break;
				case 10 : mesImpreso = "Octubre";
					break;
				case 11 : mesImpreso = "Noviembre";
					break;
				case 12 : mesImpreso = "Diciembre";
					break;
				default: 
					break;
			}
			System.out.println(dia + " de " + mes +  " de " + ano);	
		}
		
			


		
		System.out.println("Programa terminado");
		
	}		
}




