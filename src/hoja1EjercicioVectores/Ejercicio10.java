package hoja1EjercicioVectores;

public class Ejercicio10 {
	public static void main(String[] args)
	{
		int suma = 0;
		int contador = 0;
		int media;
		int numeroIgual = 0; int numeroSuperior = 0; int numeroInferior = 0;
		
		int numero[] = new int [20];
		
		// Rellenamos la matriz
		for (int x = 0; x < numero.length; x++) {
			contador = contador + 1;
			suma = suma + numero[x];
			media = suma/ contador;	
			
			if (numero[x] == media) {
				numero[x] = numeroIgual;
			} if (numero [x] < media) {
				numero[x] = numeroInferior;
			}else {
				numero[x] = numeroSuperior;
			}
		}
	
		media= suma/contador;
		System.out.println("La media es: "  + media);
		System.out.println("Hay " + numeroSuperior + " superiores a la media");
		System.out.println("Hay " + numeroInferior + " infeeriores a la media");
		System.out.println("Hay " + numeroIgual + " iguales a la media");
		
	}
}




