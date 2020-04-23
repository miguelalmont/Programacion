/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_03;

public abstract class Persona implements Humano{
	
	private String nombre, apellidos, nif;
	private Direccion direccion;
/**
 * 
 */
	Persona() {
		
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
 */
	Persona(String nombre, String apellidos, String nif, String calle, String ciudad, String codPostal, String pais) {
		Direccion d = new Direccion(calle, ciudad, codPostal, pais);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = d;
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
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return
 */
	public String getApellidos() {
		return apellidos;
	}
/**
 * 
 * @param apellidos
 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
/**
 * 
 * @return
 */
	public String getNif() {
		return nif;
	}
/**
 * 
 * @param nif
 */
	public void setNif(String nif) {
		this.nif = nif;
	}
/**
 * 
 * @return
 */
	public Direccion getDireccion() {
		return direccion;
	}
/**
 * 
 * @param direccion
 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
/**
 * 
 */
	public Class<?> identificate() {
		return this.getClass();
	}
}
