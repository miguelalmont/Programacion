/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_03;

public class Estudiante extends Persona{
	
	private int idEstudiante;
/**
 * 
 */
	Estudiante() {
		
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
 * @param idEstudiante
 */
	Estudiante(String nombre, String apellidos, String nif, String calle, String ciudad, String codPostal, String pais, int idEstudiante) {
		super(nombre, apellidos, nif, calle, ciudad, codPostal, pais);
		this.idEstudiante = idEstudiante;
	}
/**
 * 
 * @return
 */
	public int getIdEstudiante() {
		return idEstudiante;
	}
/**
 * 
 * @param idEstudiante
 */
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
/**
 * 
 */
	public String getNombre() {
		return super.getNombre();
	}
/**
 * 
 */
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
/**
 * 
 */
	public String getApellidos() {
		return super.getApellidos();
	}
/**
 * 
 */
	public void setApellidos(String apellidos) {
		super.setApellidos(apellidos);
	}
/**
 * 
 */
	public String getNif() {
		return super.getNif();
	}
/**
 * 
 */
	public void setNif(String nif) {
		super.setNif(nif);
	}
	
	@Override
	public String toString() {
		return super.getNif()+" "+super.getNombre()+" "+super.getApellidos();
	}
	
	@Override
	public Class<? extends Estudiante> identificate() {
		return this.getClass();
	}
}
