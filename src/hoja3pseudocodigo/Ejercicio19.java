package hoja3pseudocodigo;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Ejercicio19 {
	public static void main(String[] args)
	{
		int hora = 0, minuto = 0, segundo = 0;
		
		Scanner reader = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		
		System.out.print("Desea poner en hora el reloj? (s/n) ");
		if (reader.nextLine().charAt(0) == 's') {
			hora = calendario.get(Calendar.HOUR_OF_DAY);
			minuto = calendario.get(Calendar.MINUTE);
			segundo = calendario.get(Calendar.SECOND);
		}
		
		for (int i = hora; i  < 24; i++) {
			for (int j = minuto; j  < 60; j++) {
				for (int k = segundo; k < 60; k++) {
					System.out.println("La hora es: " + i + ":" + j + ":" + k);
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		reader.close();
	}
}
