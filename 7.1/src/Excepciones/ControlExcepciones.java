/**
 * Control de Excepciones
 * 
 * @author Miguel Alcantara
 */
package Excepciones;

import java.util.Scanner;
import java.time.LocalDate;

public class ControlExcepciones {
	Scanner entrada = new Scanner(System.in);
	boolean error = false;

	/**
	 * Metodo que controla la entrada de enteros
	 * 
	 * @return int
	 */
	public int controlInt() {
		int i = 0;
		do {
			try {
				i = entrada.nextInt();
				entrada.nextLine();
				error = false;
			} catch (Exception ex) {
				System.out.println("Valor no valido. Vuelva a introducir valor:");
				entrada.nextLine();
				error = true;
			}
		} while (error || i < 0);
		return i;
	}

	/**
	 * Metodo que controla la entrada de double
	 * 
	 * @return double
	 */
	public double controlDouble() {
		double d = 0;
		do {
			try {
				d = entrada.nextDouble();
				entrada.nextLine();
				error = false;
			} catch (Exception ex) {
				System.out.println("Valor no valido. Vuelva a introducir valor:");
				entrada.nextLine();
				error = true;
			}
		} while (error);
		return d;
	}

	/**
	 * Metodo que controla la entrada de float
	 * 
	 * @return float
	 */
	public float controlFloat() {
		float f = 0;
		do {
			try {
				f = entrada.nextFloat();
				entrada.nextLine();
				error = false;
			} catch (Exception ex) {
				System.out.println("Valor no valido. Vuelva a introducir valor:");
				entrada.nextLine();
				error = true;
			}
		} while (error);
		return f;
	}
	
	/**
	 * Metodo que controla la entrada de long
	 * 
	 * @return long
	 */
	public long controlLong() {
		long l = 0;
		do {
			try {
				l = entrada.nextLong();
				entrada.nextLine();
				error = false;
			} catch (Exception ex) {
				System.out.println("Valor no valido. Vuelva a introducir valor:");
				entrada.nextLine();
				error = true;
			}
		} while (error);
		return l;
	}
	
	/**
	 * Metodo que controla la entrada de localdate
	 * 
	 * @return localdate
	 */
	public LocalDate controlDate() {
		LocalDate date = null;
		do {
			System.out.println("Dia:");
			int dia = controlInt();
			System.out.println("Mes:");
			int mes = controlInt();
			System.out.println("Anio:");
			int anio = controlInt();
			try {
				date = LocalDate.of(anio, mes, dia);
				error = false;
			} catch (Exception ex) {
				System.out.println("Fecha no valida. Vuelva a introducir una fecha correcta.");
				error = true;
			}
		} while (error);
		return date;
	}
}