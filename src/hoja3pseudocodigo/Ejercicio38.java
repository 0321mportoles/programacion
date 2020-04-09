package hoja3pseudocodigo;


public class Ejercicio38 {
	public static void main(String[] args)
	{
		int[][] alumnos = {{3, 4, 7, 2, 10, 8, 6, 3, 1, 6}, {3, 4, 7, 2, 10, 8, 6, 3, 1, 6, 3, 4, 7, 2, 10, 8, 6, 3, 1, 6}, {7, 10, 8, 6, 7, 10, 8, 6}};
				
		// Rellenamos la matriz
		for (int curso = 0; curso < alumnos.length; curso++) {
			System.out.print("| ");
			for (int alumno = 0; alumno < alumnos [curso].length; alumno++) {
				System.out.print(alumnos[curso][alumno]);
				if (alumno != alumnos[curso].length-1) {
					System.out.print("\t");
				}
			}
			System.out.println(" |");
		}
	}
}
