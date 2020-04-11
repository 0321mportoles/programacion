package hoja1EjercicioVectores;

public class Ejercicio10 {
	public static void main(String[] args)
	{

		char[]vectorNumeros = {'1', '2', '3', '4', '5', '6', '7', 'A', 'B', 'C'};
		char[]vectorPalos = {'O', 'C', 'E', 'P'};
	
		elegirCarta(vectorNumeros, vectorPalos);
	}

	public static void elegirCarta (char [] vector1, char [] vector2) {
		int carta;
		int palo;
		
		carta = (int) Math.floor(Math.random()*vector1.length);
		palo = (int) Math.floor(Math.random()*vector2.length);
		
		for(int x = 1; x <= 40; x++) {
			System.out.println("La carta elegida es el " + mostrarNumero(vector1[carta]) + " de "+ mostrarPalo(vector2[palo]));
		}
	}	
	
	public static String mostrarPalo (char caracter) {
		String cadena;
		
		switch (caracter) {
			case 'O':
				cadena = "Oros";
				break;
			case 'C':
				cadena = "Copas";
				break;
			case 'E':
				cadena = "Espadas";
				break;
			case 'P':
				cadena = "Bastos";
				break;
			default:
				cadena = "" + caracter;
		}
		
		return cadena;
	}
	
	public static String mostrarNumero (char caracter) {
		String cadena;
		switch (caracter) {
		case 'A':
			cadena = "Sota";
			break;
		case 'B':
			cadena = "Caballo";
			break;
		case 'C':
			cadena = "Rey";
			break;
		
		default:
			cadena = "" + caracter;
			
		}
		return cadena;
	}
	
}