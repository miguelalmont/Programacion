/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_05;

public class Comercial extends Empleado{
	private double sueldoBruto, ventas;
/**
 * 
 * @param dni
 * @param nombre
 * @param sueldoBruto
 * @param ventas
 */
	Comercial(String dni, String nombre, double sueldoBruto, double ventas) {
		super(dni, nombre);
		this.sueldoBruto = sueldoBruto;
		this.ventas = ventas;
	}
/**
 * 	
 * @return
 */
	public double calcularComision() {
		return ventas*0.1;
	}
	
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return sueldoBruto + calcularComision();
	}
	
	
}
