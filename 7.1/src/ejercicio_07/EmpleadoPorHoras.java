/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

public class EmpleadoPorHoras extends Empleado{
	
	private double sueldo;
	private int horas;
/**
 * 
 * @param nombre
 * @param apellido
 * @param nSS
 * @param sueldo
 * @param horas
 */
	EmpleadoPorHoras(String nombre, String apellido, long nSS, double sueldo, int horas) {
		super(nombre, apellido, nSS);
		this.sueldo = sueldo;
		this.horas = horas;
	}
/**
 * 
 * @param sueldo
 */
	public void establecerSueldo(double sueldo) {
		if (sueldo >= 0)
			this.sueldo = sueldo;
		else	
			System.out.println("El sueldo debe ser mayor de cero.");
	}
/**
 * 
 * @param horas
 */
	public void establecerHoras(int horas) {
		if (horas >= 0 && horas <= 168)
			this.horas = horas;
		else
			System.out.println("El numero de horas debe estar entre 0 y 168.");
	}
/**
 * 
 * @return
 */
	public double getSueldo() {
		return sueldo;
	}
/**
 * 
 * @return
 */
	public int getHoras() {
		return horas;
	}
	
	@Override
	public double ingresos() {
		if (this.horas <= 40)
			return sueldo*horas;
		else
			return (sueldo*40) + (sueldo * (horas - 40))*1.5;
	}
	
	@Override
	public String toString() {
		return super.toString()+" sueldo por horas: "+sueldo+" horas trabajadas:"+horas;
	}
}
