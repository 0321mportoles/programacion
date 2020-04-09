package hoja1EjercicioVectores;

public class Ejercicio5 {
	public static void main(String[] args)
	{
		int[] vectorNmerico1 = new int [10];
		int[] vectorNmerico2 = new int [10];
		
		vectorNmerico1 = rellenarVector(vectorNmerico1);
		vectorNmerico2 = rellenarVector(vectorNmerico2);
		
		imprimirVector(vectorNmerico1);
		imprimirVector(vectorNmerico2);
		
		resultadoContar(vectorNmerico1, vectorNmerico2);
		
	}
		
	public static int[] rellenarVector(int [] vector) {
		for (int x = 0; x < vector.length; x++) {
			vector[x]= (int) Math.floor(Math.random()*5+1);
		}
		return vector;
	}
		
	public static void imprimirVector(int [] vector) {
		System.out.println();
		System.out.print("[ ");
		for (int x = 0; x < vector.length; x++) { 
			
				System.out.print(vector[x]);
				System.out.print("\t");
		}
		System.out.println(" ]");
		
		System.out.println();
	}	
	
	public static void resultadoContar(int [] vector, int [] vector2) {
		int contador = 0;
		
		System.out.println();
		
		for (int x1 = 0; x1 < vector.length; x1++) {
			contador = 0;
			 for (int x2 = 0; x2 < vector2.length; x2++) {
				 if (vector	[x1] == vector2[x2]) {
					 contador = contador + 1;
				 }
			}
			System.out.println(" Elemento " + x1 + " del vector 'vector' con valor " + vector[x1] + " está en vector2 " + contador + " veces");
		}
	}
	
}