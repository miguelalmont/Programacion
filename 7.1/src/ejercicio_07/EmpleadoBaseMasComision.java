/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	
	private double salarioBase;
/**
 * 
 * @param nombre
 * @param apellido
 * @param nSS
 * @param ventasBrutas
 * @param comision
 * @param salarioBase
 */
	EmpleadoBaseMasComision(String nombre, String apellido, long nSS, double ventasBrutas, double comision, double salarioBase) {
		super(nombre, apellido, nSS, ventasBrutas, comision);
		this.salarioBase = salarioBase;
	}
/**
 * 
 * @param salarioBase
 */
	public void establecerSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
/**
 * 
 * @return
 */
	public double getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	public double ingresos() {
		return salarioBase + (super.getVentasBrutas() * super.getComision() / 100);
	}
	
	@Override
	public String toString() {
		return super.toString()+" salario base: "+salarioBase;
	}
}
