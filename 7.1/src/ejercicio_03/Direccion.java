/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_03;

public class Direccion {
	
	private String calle, ciudad, codPostal, pais;
/**
 * 
 */
	Direccion() {	
	}
/**
 * 
 * @param calle
 * @param ciudad
 * @param codPostal
 * @param pais
 */
	Direccion(String calle, String ciudad, String codPostal, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codPostal = codPostal;
		this.pais = pais;
	}
/**
 * 
 * @return
 */
	public String getCalle() {
		return calle;
	}
/**
 * 
 * @param calle
 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
/**
 * 
 * @return
 */
	public String getCiudad() {
		return ciudad;
	}
/**
 * 
 * @param ciudad
 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
/**
 * 
 */
	public String getCodPostal() {
		return codPostal;
	}
/**
 * 
 * @param codPostal
 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
/**
 * 
 * @return
 */
	public String getPais() {
		return pais;
	}
/**
 * 
 * @param pais
 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
