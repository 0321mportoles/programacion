package tema4Hoja1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio9 {
	
	
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String cadena;
		int ano, curso;
		char sexo;
		int contadorTotal = 0, contador = 0;
		
		ArrayList<Character> alumnosCurso1 = new ArrayList();
		ArrayList<Character> alumnosCurso2 = new ArrayList();

		do {
			System.out.println();
			cadena = pedirDatosAlumno();
			
			ano = extraerAno(cadena); 
			sexo = extraerSexo(cadena); 
			curso = extraerCurso (cadena);
			if (datosAlumnosCorrecto(ano, sexo, curso)) {	
				contador = contador + 1;	
				System.out.println("Año recibido: " + ano); System.out.println("Sexorecibido: " + sexo); System.out.println("Curso recibido: " + curso);
				if (curso == 1) {
					alumnosCurso1.add(sexo);
				} else if (curso == 2) {
					alumnosCurso2.add(sexo);
				}
			}

			if (!cadena.equals("00000000")) {
				contadorTotal = contadorTotal + 1;				
			}

		} while (!cadena.equals("00000000"));
		
		System.out.println("Hemos recibido " + contadorTotal + " alumnos y " + contador + " eran correctos");
		extraerEstadisticas(alumnosCurso1, alumnosCurso2);
	}

	private static boolean datosAlumnosCorrecto(int ano, char sexo, int curso) {
		if (ano < 1990 && ano > 1995) {
			return false;
		}
		
		if (sexo != 'H' && sexo != 'M') {
			return false;
		}
		
		if (curso != 1 && curso != 2) {
			return false;
		}
			
		return true;
	}

	private static String pedirDatosAlumno() {
		System.out.print("Introduce datos del alumno(YYYYSCVV) (00000000 para terminar): ");
		return reader.nextLine();
	}
	
	private static int extraerAno(String cadena) {
		String miNumeroEnCadenaDeTexto = cadena.substring(0, 4);
		return Integer.parseInt(miNumeroEnCadenaDeTexto);
	}
	
	private static char extraerSexo(String cadena) {
		return cadena.substring(4, 5).charAt(0);
	}
	
	private static int extraerCurso(String cadena) {
		String miNumeroEnCadenaDeTexto = cadena.substring(5, 6);
		return Integer.parseInt(miNumeroEnCadenaDeTexto);
	}
	
	private static void extraerEstadisticas(ArrayList<Character> alc1, ArrayList<Character> alc2) {
		mostrarEstadisticasArrayList(1, alc1);
		mostrarEstadisticasArrayList(2, alc2);
	}

	private static void mostrarEstadisticasArrayList(int curso, ArrayList<Character> array) {
		int contadorHombres = 0, contadorMujeres = 0;
		
		for (Iterator iterator = array.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			if (character == 'H') {
				contadorHombres++;
			}
			
			if (character == 'M') {
				contadorMujeres++;
			}
		}
		
		System.out.println("En el curso " + curso + " hay " + contadorHombres + "  hombres y " + contadorMujeres + " mujeres");
	}
	
}