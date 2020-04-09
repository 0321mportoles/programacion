import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args)
	{

		double notaTotal;
		String nombreAlumno;
		double pPractica;
		double pTeorica;
		double pProblemas;
		
		
		Scanner reader = new Scanner(System.in);	
		
		do {
			nombreAlumno = "";
			System.out.print("Introduce nombre de alumno: ");
			nombreAlumno = reader.nextLine();
			
			if ( (nombreAlumno != null) && (!nombreAlumno.equals("")) ) {
				System.out.print("Introduce nota practica: ");
				pPractica = reader.nextDouble();
				
				System.out.print("Introduce nota teorica: ");
				pTeorica = reader.nextDouble();
				
				System.out.print("Introduce nota problemas: ");
				pProblemas = reader.nextDouble();
				reader.nextLine();
				
				if (pPractica < 0 || pPractica > 10 || pProblemas < 0 || pProblemas > 10 || pTeorica < 0 || pTeorica > 10) {
					System.out.print("Error en la nota ");
				} 
				else {
					notaTotal = 0.1 * pPractica + 0.5 * pTeorica + 0.4 * pProblemas;	
					System.out.println("La nota de " + nombreAlumno + " es " + notaTotal);
				}
			}
		} while ((nombreAlumno != null) && (!nombreAlumno.equals("")));
		
		reader.close();
		
		System.out.println();
		System.out.println("Programa terminado");
		
	}		
}




