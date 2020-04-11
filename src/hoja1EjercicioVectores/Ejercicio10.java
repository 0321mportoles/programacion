package hoja1EjercicioVectores;

public class Ejercicio10 {
	public static void main(String[] args)
	{

		char[] vectorNumeros = {'1', '2', '3', '4', '5', '6', '7', 'A', 'B', 'C'};
		char[] vectorPalos = {'O', 'C', 'E', 'P'};
		String [] apariciones;
		String [] baraja = {
			"1O", "2O", "3O", "4O", "5O", "6O", "7O", "AO", "BO", "CO", 
			"1C", "2C", "3C", "4C", "5C", "6C", "7C", "AC", "BC", "CC", 
			"1E", "2E", "3E", "4E", "5E", "6E", "7E", "AE", "BE", "CE", 
			"1P", "2P", "3P", "4P", "5P", "6P", "7P", "AP", "BP", "CP"
		};
	
		elegirCarta(vectorNumeros, vectorPalos);
	}

	public static void elegirCarta (char [] vector1, char [] vector2) {
		int carta;
		int palo;
		
		carta = (int) Math.floor(Math.random()*vector1.length);
		palo = (int) Math.floor(Math.random()*vector2.length);
		
		System.out.println("La carta elegida es el " + mostrarNumero(vector1[carta]) + " de "+ mostrarPalo(vector2[palo]));
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