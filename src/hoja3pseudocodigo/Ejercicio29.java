package hoja3pseudocodigo;

public class Ejercicio29 {
	public static void main(String[] args)
	{
		int contador = 0;
		
		for( int i = 0; i < 100; i++) {
			int dado1 = (int) Math.floor(Math.random()*6+1);
			int dado2 = (int) Math.floor(Math.random()*6+1);

			if ((dado1 + dado2) == 10) {
				contador = contador + 1;
			}	
		}
	
		System.out.print("Los dados han sumado 10 " + contador + " veces.");

	}
}
