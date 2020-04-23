/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_05;

public abstract class Empleado implements Calculos{
	private String nombre, dni;
	private int nHijos;
/**
 * 
 * @param dni
 * @param nombre
 */
	Empleado(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @return
 */
	public String getDni() {
		return dni;
	}
/**
 * 
 * @return
 */
	abstract public double calcularSueldo();
	
	@Override
	public double retencion() {
		if (calcularSueldo() < 1000 ) {
			return calcularSueldo() * 0.12;
		}
		else if (calcularSueldo() < 1500) {
			return calcularSueldo() * 0.15;
		}
		else if (calcularSueldo() < 2500) {
			return calcularSueldo() * 0.18;
		}
		else {
			return calcularSueldo() * 0.20;
		}
	}
	
	@Override
	public double gratificacion(int nHijos) {
		this.nHijos = nHijos;
		if (nHijos == 0) {
			return 0;
		}
		else if (nHijos > 0 && nHijos < 4) {
			return 200;
		}
		else {
			return 300;
		}
	}
	
	@Override
	public double calcular() {
		return calcularSueldo() - retencion() + gratificacion(this.nHijos);
	}
}
