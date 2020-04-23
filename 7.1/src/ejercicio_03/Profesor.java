/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_03;

public class Profesor extends Persona{
	private int despacho;
/**
 * 
 */
	Profesor() {
		
	}
/**
 * 
 * @param nombre
 * @param apellidos
 * @param nif
 * @param calle
 * @param ciudad
 * @param codPostal
 * @param pais
 * @param despacho
 */
	Profesor(String nombre, String apellidos, String nif, String calle, String ciudad, String codPostal, String pais, int despacho) {
		super(nombre, apellidos, nif, calle, ciudad, codPostal, pais);
		this.despacho = despacho;
	}
/**
 * 
 * @return
 */
	public int getDespacho() {
		return despacho;
	}
/**
 * 
 * @param despacho
 */
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return super.getNif()+" "+super.getNombre()+" "+super.getApellidos();
	}
	
	@Override
	public Class<? extends Profesor> identificate() {
		return this.getClass();
	}
}
