package hoja3pseudocodigo;

public class Ejercicio34 {
	public static void main(String[] args)
	{
		int suma = 0;
		int contador = 0;
		int media;
		
		int alumno [] = {5, 8, 9, 6, 5, 4, 5, 7, 8, 9};
		for (int i = 0; i < alumno.length; i++) {
			contador = contador + 1;
			suma = suma + alumno[i];
			
			
		}
		media= suma/contador;
		System.out.println("La media es: "  + media);
		
		
	}
}

