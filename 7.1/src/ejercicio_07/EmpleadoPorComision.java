/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

public class EmpleadoPorComision extends Empleado{
	
	private double ventasBrutas, comision;
/**
 * 
 * @param nombre
 * @param apellido
 * @param nSS
 * @param ventasBrutas
 * @param comision
 */
	EmpleadoPorComision(String nombre, String apellido, long nSS, double ventasBrutas, double comision) {
		super(nombre, apellido, nSS);
		this.ventasBrutas = ventasBrutas;
		this.comision = comision;
	}
/**
 * 
 * @param ventasBrutas
 */
	public void establecerVentas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}
/**
 * 
 * @param comision
 */
	public void establecerComision(double comision) {
		this.comision = comision;
	}
/**
 * 
 * @return
 */
	public double getVentasBrutas() {
		return ventasBrutas;
	}
/**
 * 
 * @return
 */
	public double getComision() {
		return comision;
	}
	
	@Override
	public double ingresos() {
		return ventasBrutas * comision / 100;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ventas brutas:"+ventasBrutas+" tarifa de comison:"+comision;
	}
}
