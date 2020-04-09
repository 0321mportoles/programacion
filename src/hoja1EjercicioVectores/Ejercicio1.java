package hoja1EjercicioVectores;

public class Ejercicio1 {
	public static void main(String[] args)
	{
		int suma = 0;
		int contador = 0;
		double media;
		int numerosIguales = 0; int numerosSuperiores = 0; int numerosInferiores = 0;
		int[] numeros;
		
		numeros = new int [20];
		
		// Rellenamos la matriz
		System.out.println("Rellenando mi vector de numeros");
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) Math.floor(Math.random()*20-10);
			System.out.print(numeros[x] + ", ");
		}
		System.out.println();
		System.out.println("Recorriendo mi vector de " + numeros.length  + " numeros");
		// Calcular la media
		for (int x = 0; x < numeros.length; x++) { 
			contador = contador + 1;
			suma = suma + numeros[x];
		}
		
		System.out.println("La suma de los (" + contador + ") numeros es: " + suma);
		
		
		media = suma / contador;
		System.out.println("La media es: "  + suma / contador);
		System.out.println("La media es: "  + media);
		// Más calculos referidos a la media
		for (int x = 0; x < numeros.length; x++) {
			if (numeros[x] == media) {
				numerosIguales++;
			} if (numeros [x] < media) {
				numerosInferiores++;
			} else {
				numerosSuperiores++;
			}
		}

		System.out.println("La media es: "  + media);
		System.out.println("Hay " + numerosSuperiores + " superiores a la media");
		System.out.println("Hay " + numerosInferiores + " infeeriores a la media");
		System.out.println("Hay " + numerosIguales + " iguales a la media");
	}
}




