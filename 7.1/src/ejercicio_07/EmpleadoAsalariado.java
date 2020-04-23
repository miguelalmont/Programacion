/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

public class EmpleadoAsalariado extends Empleado{
	
	private double salarioSemanal;
/**
 * 
 * @param nombre
 * @param apellido
 * @param nSS
 * @param salarioSemanal
 */
	EmpleadoAsalariado(String nombre, String apellido, long nSS, double salarioSemanal) {
		super(nombre, apellido, nSS);
		this.salarioSemanal = salarioSemanal;
	}
/**
 * 
 * @param salarioSemanal
 */
	public void establecerSueldo(double salarioSemanal) {
		if (salarioSemanal >= 0)
			this.salarioSemanal = salarioSemanal;
		else	
			System.out.println("El salario debe ser mayor de cero.");
	}
/**
 * 
 * @return
 */
	public double obtener() {
		return salarioSemanal;
	}
	
	@Override
	public double ingresos() {
		return this.salarioSemanal + this.salarioSemanal*0.1;
	}
	
	@Override
	public String toString() {
		return super.toString()+" salario semanal:"+salarioSemanal;
	}
}
