/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_05;

public class Directivo extends Empleado{
	private double sueldoBruto, comision;
/**
 * 
 * @param dni
 * @param nombre
 * @param sueldoBruto
 * @param comision
 */
	Directivo(String dni, String nombre, double sueldoBruto, double comision) {
		super(dni, nombre);
		this.sueldoBruto = sueldoBruto;
		this.comision = comision;
	}
/**
 * 
 * @return
 */
	public double getSueldoBruto() {
		return sueldoBruto;
	}
/**
 * 
 * @return
 */
	public double getComision() {
		return comision;
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return sueldoBruto + comision;
	}
	
}
