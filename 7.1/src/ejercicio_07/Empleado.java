/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

public abstract class Empleado {
	
	private String nombre, apellido;
	private long nSS;
/**
 * 
 * @param nombre
 * @param apellido
 * @param nSS
 */
	Empleado(String nombre, String apellido, long nSS) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nSS = nSS;
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
	public String getApellido() {
		return apellido;
	}
/**
 * 
 * @return
 */
	public long getnSS() {
		return nSS;
	}
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @param apellido
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/**
 * 
 * @param nSS
 */
	public void setnSS(long nSS) {
		this.nSS = nSS;
	}
	
	@Override
	public String toString() {
		return nombre+" "+apellido+" Nº SS: "+nSS;
	}
	
	abstract public double ingresos();
}
